package pro.sketchware;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;

import com.besome.sketch.tools.CollectErrorActivity;

import pro.sketchware.utility.theme.ThemeManager;

public class SketchApplication extends Application {
    private static Context mApplicationContext;

    public static Context getContext() {
        return mApplicationContext;
    }

    @Override
    protected void attachBaseContext(Context base) {
        // Force Persian for application-level resources too (services, receivers, etc.)
        android.content.res.Configuration config = new android.content.res.Configuration(base.getResources().getConfiguration());
        config.setLocale(new java.util.Locale("fa"));
        config.setLocales(new android.os.LocaleList(new java.util.Locale("fa")));
        super.attachBaseContext(base.createConfigurationContext(config));
    }

    @Override
    public void onCreate() {
        mApplicationContext = getApplicationContext();
        // Force Persian UI app-wide, regardless of system language
        AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags("fa"));
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(@NonNull Thread thread, @NonNull Throwable throwable) {
                Intent intent = new Intent(getApplicationContext(), CollectErrorActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.putExtra("error", Log.getStackTraceString(throwable));
                startActivity(intent);
                Process.killProcess(Process.myPid());
                System.exit(1);
            }
        });
        super.onCreate();
        ThemeManager.applyTheme(this, ThemeManager.getCurrentTheme(this));
    }
}
