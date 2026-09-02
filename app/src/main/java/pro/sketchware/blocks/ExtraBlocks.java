package pro.sketchware.blocks;

import android.util.Pair;

import com.besome.sketch.editor.LogicEditorActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import a.a.a.eC;
import a.a.a.jC;
import mod.hilal.saif.activities.tools.ConfigActivity;

public class ExtraBlocks {

    private final String eventName;
    private final String javaName;
    private final LogicEditorActivity logicEditor;
    private final eC projectDataManager;

    public ExtraBlocks(LogicEditorActivity logicEditor) {
        eventName = logicEditor.eventName;
        this.logicEditor = logicEditor;
        javaName = logicEditor.M.getJavaName();
        projectDataManager = jC.a(logicEditor.scId);
    }

    public static void extraBlocks(ArrayList<HashMap<String, Object>> arrayList) {
        arrayList.add(addBlock("caseStrAnd", " ", "", "case %s:", "#e1a92a", "حالت %s و"));
        arrayList.add(addBlock("caseNumAnd", " ", "", "case ((int)%s):", "#e1a92a", "حالت %d و"));
        arrayList.add(addBlock("continue", "f", "", "continue;", "#e1a92a", "ادامه"));
        arrayList.add(addBlock("isEmpty", "b", "", "%s.isEmpty()", "#e1a92a", "%s خالی است"));
        arrayList.add(addBlock("fileutilcopydir", " ", "", "FileUtil.copyDir(%1$s, %2$s);", "#a1887f", "کپی پوشه از %s به %s"));
        arrayList.add(addBlock("instanceOfOperator", "b", "", "%1$s instanceof %2$s", "#e1a92a", "%s از نوع %s است"));
        arrayList.add(addBlock("checkViewVisibility", "b", "", "%s.getVisibility() == View.%s", "#4a6cd4", "نمایانی %m.view برابر %m.visible است"));
        arrayList.add(addBlock("intentHasExtra", "b", "", "getIntent().hasExtra(%s)", "#2ca5e2", "اکتیویتی کلید %s را دارد"));
        arrayList.add(addBlock("intentSetType", " ", "", "%s.setType(%s);", "#2ca5e2", "تنظیم نوع %m.intent به %s"));
        arrayList.add(addBlock("intentRemoveExtra", " ", "", "%s.removeExtra(%s);", "#2ca5e2", "حذف کلید %s از %m.intent"));
        arrayList.add(addBlock("fileContainsData", "b", "", "%1$s.contains(%2$s)", "#2ca5e2", "%m.file شامل %s است"));
        arrayList.add(addBlock("viewGetChildAt", "v", "View", "%1$s.getChildAt(%2$s)", "#4a6cd4", "گرفتن فرزند موقعیت %d از %m.view"));
        arrayList.add(addBlock("strParseInteger", "d", "", "Integer.parseInt(%s)", "#5cb722", "تبدیل %s به عدد صحیح"));
        arrayList.add(addBlock("stringSubSingle", "s", "", "%1$s.substring(%2$s)", "#5cb722", "زیررشته %s از %d"));
        arrayList.add(addBlock("webviewGetProgress", "d", "", "%1$s.getProgress()", "#4a6cd4", "گرفتن پیشرفت بارگذاری %m.webview"));
        arrayList.add(addBlock("menuItemSetVisible", " ", "", "%1$s.setVisible(%2$s);", "#4a6cd4", "نمایانی %m.MenuItem؟ %b"));
        arrayList.add(addBlock("menuItemSetEnabled", " ", "", "%1$s.setEnabled(%2$s);", "#4a6cd4", "فعال‌بودن %m.MenuItem؟ %b"));
        arrayList.add(addBlock("menuFindItem", "v", "MenuItem", "menu.findItem(%s)", "#4a6cd4", "یافتن مورد منو: %s"));
        arrayList.add(addBlock("listAddAll", " ", "", "%1$s.addAll(%2$s);", "#cc5b22", "افزودن همه موارد %m.list به %m.listStr"));
        // File Blocks
        arrayList.add(addBlock("fileCanExecute", "b", "", "%s.canExecute()", "#a1887f", "قابل اجرا؟ %m.File"));
        arrayList.add(addBlock("fileCanRead", "b", "", "%s.canRead()", "#a1887f", "قابل خواندن؟ %m.File"));
        arrayList.add(addBlock("fileCanWrite", "b", "", "%s.canWrite()", "#a1887f", "قابل نوشتن؟ %m.File"));
        arrayList.add(addBlock("fileGetName", "s", "", "%s.getName()", "#a1887f", "گرفتن نام %m.File"));
        arrayList.add(addBlock("fileGetParent", "s", "", "%s.getParent()", "#a1887f", "گرفتن والد %m.File"));
        arrayList.add(addBlock("fileGetPath", "s", "", "%s.getPath()", "#a1887f", "گرفتن مسیر %m.File"));
        arrayList.add(addBlock("fileIsHidden", "b", "", "%s.isHidden()", "#a1887f", "مخفی است؟ %m.File"));
        // Basically Command Block
        arrayList.add(addBlock("addPermission", " ", "", "", "#493F5A", "بلوک دستوری مجوز: افزودن %m.Permission"));
        arrayList.add(addBlock("removePermission", " ", "", "", "#493F5A", "بلوک دستوری مجوز: حذف %m.Permission"));
        arrayList.add(addBlock("addCustomVariable", " ", "", "", "#493F5A", "بلوک متغیر سفارشی: افزودن متغیر %s"));
        arrayList.add(addBlock("addInitializer", " ", "", "", "#493F5A", "بلوک مقدارده اولیه: افزودن %s"));
        //OtpView Blocks
        arrayList.add(addBlock("otpViewSetFieldCount", " ", "", "%1$s.setFieldCount(%2$s);", "#4a6cd4", "تنظیم تعداد خانه‌های %m.otpview به %d"));
        arrayList.add(addBlock("otpViewSetOTPText", " ", "", "%1$s.setOTPText(%2$s);", "#4a6cd4", "تنظیم متن %m.otpview به %s"));
        arrayList.add(addBlock("otpViewGetOTPText", "s", "", "%1$s.getOTPText()", "#4a6cd4", "گرفتن متن %m.otpview"));
        arrayList.add(addBlock("otpViewSetOTPListener", "c", "", "%1$s.setOTPListener(new OTPListener() {\r\npublic void onOTPEntered(String _otp) {\r\n%2$s\r\n}\r\n});", "#4a6cd4", "وقتی کد %m.otpview کامل شد → _otp"));
        //SignInButton Blocks
        arrayList.add(addBlock("signInButtonSetColorScheme", " ", "", "%1$s.setColorScheme(SignInButton.%2$s);", "#4a6cd4", "تنظیم طرح رنگ %m.signinbutton به %m.SignButtonColor"));
        arrayList.add(addBlock("signInButtonSetSize", " ", "", "%1$s.setSize(SignInButton.%2$s);", "#4a6cd4", "تنظیم اندازه %m.signinbutton به %m.SignButtonSize"));
        //Admob's AdView Blocks
        arrayList.add(addBlock("bannerAdViewLoadAd", " ", "", "{\r\nAdRequest adRequest = new AdRequest.Builder().build();\r\n%1$s.loadAd(adRequest);\r\n}", "#4a6cd4", "بارگذاری %m.adview"));
        //RewardedVideoAd
        arrayList.add(addBlock("rewardedVideoAdLoad", " ", "", "RewardedAd.load(%2$s.this, _reward_ad_unit_id, new AdRequest.Builder().build(), _%1$s_rewarded_ad_load_callback);", "#2ca5e2", "بارگذاری %m.videoad در %m.activity"));
        arrayList.add(addBlock("rewardedVideoAdShow", " ", "", "%1s.show(%2$s.this, _%1$s_on_user_earned_reward_listener);", "#2ca5e2", "نمایش %m.videoad در %m.activity"));
    }

    /**
     * @return A block as HashMap&lt;String, Object&gt;.
     */
    private static HashMap<String, Object> addBlock(String name, String type, String typeName, String code, String color, String spec) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("type", type);
        map.put("typeName", typeName);
        map.put("code", code);
        map.put("color", color);
        map.put("palette", "-1");
        map.put("spec", spec);
        return map;
    }

    /**
     * @return A block as HashMap&lt;String, Object&gt; with spec2 (<code>e</code> type blocks)
     */
    private static HashMap<String, Object> addBlock(String name, String type, String typeName, String code, String color, String spec, String spec2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("type", type);
        map.put("typeName", typeName);
        map.put("code", code);
        map.put("color", color);
        map.put("palette", "-1");
        map.put("spec", spec);
        map.put("spec2", spec2);
        return map;
    }

    public boolean isVariableUsed(int varId) {
        ArrayList<Pair<Integer, String>> arrayList = projectDataManager.k(javaName);
        ArrayList<Integer> variableList = new ArrayList<>();
        for (Pair<Integer, String> intStrPair : arrayList) {
            variableList.add(intStrPair.first);
        }
        return variableList.contains(varId);
    }

    public boolean isListUsed(int listId) {
        ArrayList<Pair<Integer, String>> arrayList = projectDataManager.j(javaName);
        ArrayList<Integer> listVar = new ArrayList<>();
        for (Pair<Integer, String> intStrPair : arrayList) {
            listVar.add(intStrPair.first);
        }
        return listVar.contains(listId);
    }

    public boolean isComponentUsed(int componentId) {
        return projectDataManager.f(javaName, componentId) || ConfigActivity.isSettingEnabled(ConfigActivity.SETTING_SHOW_EVERY_SINGLE_BLOCK);
    }

    public boolean isCustomVarUsed(String variable) {
        if (ConfigActivity.isSettingEnabled(ConfigActivity.SETTING_SHOW_EVERY_SINGLE_BLOCK)) {
            return true;
        }

        ArrayList<String> arrayList = new ArrayList<>();
        for (String variableName : projectDataManager.e(javaName, 5)) {
            Matcher matcher = Pattern.compile("^(\\w+)[\\s]+(\\w+)").matcher(variableName);
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        }
        return arrayList.contains(variable);
    }

    public void eventBlocks() {
        if (eventName.equals("onCreateOptionsMenu")) {
            logicEditor.a("مورد منو", 0xff555555);
            logicEditor.a(" ", "menuItemSetVisible");
            logicEditor.a(" ", "menuItemSetEnabled");
            logicEditor.a("v", "menuFindItem");
        }
    }

    public void fileBlocks() {
        if (isCustomVarUsed("File")) {
            logicEditor.a("بلوک‌های فایل", 0xff555555);
            logicEditor.a("b", "fileCanExecute");
            logicEditor.a("b", "fileCanRead");
            logicEditor.a("b", "fileCanWrite");
            logicEditor.a("s", "fileGetName");
            logicEditor.a("s", "fileGetParent");
            logicEditor.a("s", "fileGetPath");
            logicEditor.a("b", "fileIsHidden");
        }
    }
}
