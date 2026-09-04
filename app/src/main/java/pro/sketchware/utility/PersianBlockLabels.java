package pro.sketchware.utility;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import a.a.a.Ts;
import pro.sketchware.SketchApplication;

/**
 * Round 14 — Persian display layer for built-in blocks.
 * <p>
 * The labels of built-in blocks (setEnable, getDip, bluetoothConnect..., ...) live inside the
 * prebuilt a.a.a jar and cannot be resource-translated. This utility rewrites the VISIBLE text
 * of every TextView inside a block view tree AFTER the block was constructed, using a JSON map
 * (assets/fa_block_labels.json). Spec / opCode / code generation are NEVER touched —
 * projects keep compiling exactly as before. If the JSON is missing or a label is unmapped,
 * the original English text stays (safe fallback).
 */
public class PersianBlockLabels {

    private static volatile boolean loaded = false;
    private static final Map<String, String> FRAG = new HashMap<>();
    private static final Map<String, String> TYPES = new HashMap<>();

    private static void load() {
        if (loaded) return;
        synchronized (PersianBlockLabels.class) {
            if (loaded) return;
            try (var in = SketchApplication.getContext().getAssets().open("fa_block_labels.json")) {
                StringBuilder sb = new StringBuilder();
                try (var reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
                    String line;
                    while ((line = reader.readLine()) != null) sb.append(line);
                }
                var root = new org.json.JSONObject(sb.toString());
                var f = root.optJSONObject("frag");
                if (f != null) {
                    var it = f.keys();
                    while (it.hasNext()) {
                        String k = it.next();
                        FRAG.put(k, f.optString(k, k));
                    }
                }
                var t = root.optJSONObject("types");
                if (t != null) {
                    var it = t.keys();
                    while (it.hasNext()) {
                        String k = it.next();
                        TYPES.put(k, t.optString(k, k));
                    }
                }
            } catch (Exception ignored) {
                // Missing/corrupt JSON → English fallback (never crash the editor)
            }
            loaded = true;
        }
    }

    /** Rewrite all visible block label texts inside the given view tree. */
    public static void rewrite(View root) {
        load();
        if (FRAG.isEmpty() && TYPES.isEmpty()) return;
        if (root instanceof TextView) {
            rewriteText((TextView) root);
        }
        if (root instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) root;
            for (int i = 0; i < group.getChildCount(); i++) {
                rewrite(group.getChildAt(i));
            }
        }
    }

    private static void rewriteText(TextView tv) {
        CharSequence cs = tv.getText();
        if (cs == null) return;
        String text = cs.toString();
        if (text.isEmpty() || text.length() > 80) return;
        String mapped = mapText(text);
        if (!mapped.equals(text)) {
            tv.setText(mapped);
            // re-measure: block widths are computed at layout; trigger re-measure
            tv.requestLayout();
        }
    }

    /**
     * Map one rendered label. Handles:
     *  - exact fragment ("setEnable" → "فعال‌سازی")
     *  - "View:" dropdown prefix style ("View:" → "ویو:")
     *  - "View: setEnable" combined strings
     */
    public static String mapText(String text) {
        load();
        String direct = FRAG.get(text);
        if (direct != null) return direct;
        // "TypeName: rest" pattern (dropdown prefix)
        int colon = text.indexOf(':');
        if (colon > 0) {
            String prefix = text.substring(0, colon).trim();
            String rest = text.substring(colon + 1);
            String pType = TYPES.get(prefix);
            if (pType != null) {
                String r = FRAG.get(rest.trim());
                return pType + ": " + (r != null ? r : rest.trim());
            }
        }
        return FRAG.containsKey(text) ? FRAG.get(text) : text;
    }

    /** Persian name of a %m type (kq.b equivalent) — falls back to English mapping. */
    public static String typeName(String en) {
        load();
        return TYPES.getOrDefault(en, en);
    }
}
