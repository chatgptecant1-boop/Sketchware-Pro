package mod.hilal.saif.blocks;

import androidx.annotation.ColorInt;

import com.besome.sketch.editor.LogicEditorActivity;

import java.util.ArrayList;
import java.util.HashMap;

import mod.hilal.saif.activities.tools.ConfigActivity;
import pro.sketchware.R;
import pro.sketchware.blocks.ExtraBlocks;
import pro.sketchware.utility.ThemeUtils;

public class BlocksHandler {

    public static void builtInBlocks(ArrayList<HashMap<String, Object>> arrayList) {
        ExtraBlocks.extraBlocks(arrayList);

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("name", "CommandBlockJava");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "/*-JX4UA2y_f1OckjjvxWI.bQwRei-sLEsBmds7ArsRfi0xSFEP3Php97kjdMCs5ed\n"
                        + ">[%1$s]\n"
                        + ">%2$s\n"
                        + ">%3$s\n"
                        + ">%4$s\n"
                        + ">%5$s\n"
                        + "%6$s\n"
                        + "BpWI8U4flOpx8Ke66QTlZYBA_NEusQ7BN-D0wvZs7ArsRfi0.EP3Php97kjdMCs*/");
        hashMap.put("color", "#493F5A");
        hashMap.put("palette", "0");
        hashMap.put(
                "spec",
                "Java Command Block: reference %s distance %d frontend %d backend %d command"
                        + " %m.Command");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "CommandBlockXML");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "/*AXAVajPNTpbJjsz-NGVTp08YDzfI-04kA7ZsuCl4GHqTQQiuWL45sV6Vf4gwK\n"
                        + ">[%1$s]\n"
                        + ">%2$s\n"
                        + ">%3$s\n"
                        + ">%4$s\n"
                        + ">%5$s\n"
                        + ">%6$s\n"
                        + "%7$s\n"
                        + "Ui5_PNTJb21WO6OuGwQ3psk3su1LIvyXo_OAol-kVQBC5jtN_DcPLaRCJ0yXp*/");
        hashMap.put("color", "#493F5A");
        hashMap.put("palette", "0");
        hashMap.put(
                "spec",
                "XML Command Block: reference %s distance %d frontend %d backend %d command"
                        + " %m.Command xml name %s.inputOnly");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "viewOnClick");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "%s.setOnClickListener(new View.OnClickListener() {\n"
                        + "@Override\n"
                        + "public void onClick(View _view) {\n"
                        + "%s\n"
                        + "}\n"
                        + "});");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "وقتی %m.view کلیک شد");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setRecyclerViewLayoutParams");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "RecyclerView.LayoutParams _lp = new"
                        + " RecyclerView.LayoutParams(ViewGroup.LayoutParams.%s,"
                        + " ViewGroup.LayoutParams.%s);\n"
                        + "_view.setLayoutParams(_lp);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "7");
        hashMap.put(
                "spec", "set RecyclerViewLayoutParams width %m.LayoutParam height %m.LayoutParam");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "refreshingList");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.invalidateViews();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.listview نوسازی ویوها");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ListViewAddHeader");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.addHeaderView(%s,%s,%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "افزودن ویو سربرگ به %m.listview با ویو %m.view و داده %s و قابل انتخاب؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ListViewAddFooter");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.addFooterView(%s,%s,%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "افزودن ویو پاصفحه به %m.listview با ویو %m.view و داده %s و قابل انتخاب؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listViewRemoveHeader");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.removeHeaderView(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "حذف سربرگ %m.view از %m.listview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listViewRemoveFooter");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.removeFooterView(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "حذف پاصفحه %m.view از %m.listview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogCreate");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s = new ProgressDialog(%s.this);");
        hashMap.put("color", "#29A7E4");
        hashMap.put("palette", "7");
        hashMap.put("spec", "ساخت %m.progressdialog در %m.activity");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listViewSetSelection");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setSelection((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "7");
        hashMap.put("spec", "تنظیم موقعیت انتخاب %m.listview به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextdiableSuggestion");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "غیرفعال‌کردن پیشنهادهای %m.edittext");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextLines");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setLines(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "تنظیم تعداد خطوط %m.edittext به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextSingleLine");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setSingleLine(%2$s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.edittext تک‌خطی؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextShowError");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "((EditText)%s).setError(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "نمایش خطای %s در %m.edittext");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextSelectAll");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "((EditText)%s).selectAll();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "انتخاب کل متن %m.edittext");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextSetSelection");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "((EditText)%s).setSelection((int)%s, (int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "تنظیم شروع انتخاب %m.edittext به %d و پایان به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextSetMaxLines");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "((EditText)%s).setMaxLines((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "تنظیم بیشینه خطوط %m.edittext به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EdittextGetselectionStart");
        hashMap.put("type", "d");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.getSelectionStart()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "گرفتن شروع انتخاب %m.edittext");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EdittextGetselectionEnd");
        hashMap.put("type", "d");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.getSelectionEnd()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "گرفتن پایان انتخاب %m.edittext");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "performClick");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.performClick();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "انجام کلیک روی %m.view");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "AsyncTaskExecute");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "new %s().execute(%s);");
        hashMap.put("color", "#29A7E4");
        hashMap.put("palette", "7");
        hashMap.put("spec", "اجرای %m.asynctask با پیام %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "AsyncTaskPublishProgress");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "publishProgress((int)%s);");
        hashMap.put("color", "#29A7E4");
        hashMap.put("palette", "7");
        hashMap.put("spec", "انتشار پیشرفت %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetCanceledOutside");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setCanceledOnTouchOutside(%s);");
        hashMap.put("color", "#29A7E4");
        hashMap.put("palette", "7");
        hashMap.put("spec", "%m.progressdialog لغو با لمس بیرون؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "datePickerDialogShow");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "DialogFragment datePicker = new DatePickerFragment();\r\n"
                        + "datePicker.show(getSupportFragmentManager(), \"datePicker\");");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "نمایش گفت‌وگوی انتخاب تاریخ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "timePickerDialogShow");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.show();");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "نمایش %m.timepickerdialog");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "imageCrop");
        hashMap.put("type", " ");
        hashMap.put("code", "SketchwareUtil.CropImage(this, %s, (int) %s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "برش تصویر از مسیر %s با کد درخواست %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "isConnected");
        hashMap.put("type", " ");
        hashMap.put("code", "SketchwareUtil.isConnected(getApplicationContext())");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "متصل است");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "customImport");
        hashMap.put("type", " ");
        hashMap.put("code", "import %s;");
        hashMap.put("color", "#EE7D15");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "واردکردن %s.import");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "customImport2");
        hashMap.put("type", " ");
        hashMap.put("code", "import %s;");
        hashMap.put("color", "#EE7D15");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "واردکردن %m.import");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "customToast");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "SketchwareUtil.CustomToast(getApplicationContext(), %s, %s, %s, %s, %s,"
                        + " SketchwareUtil.%s);");
        hashMap.put("color", "#8A55D7");
        hashMap.put("palette", "-1");
        hashMap.put(
                "spec",
                "CustomToast %s رنگ متن %m.color اندازه متن %d رنگ پس‌زمینه %m.color گردی گوشه %d"
                        + " gravity %m.gravity_t");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "customToastWithIcon");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "SketchwareUtil.CustomToastWithIcon(getApplicationContext(), %s, %s, %s, %s, %s,"
                        + " SketchwareUtil.%s, R.drawable.%s);");
        hashMap.put("color", "#8A55D7");
        hashMap.put("palette", "-1");
        hashMap.put(
                "spec",
                "CustomToastWithIcon %s textColor %m.color textSize %d bgColor %m.color"
                        + " cornerRadius %d gravity %m.gravity_t Icon %m.resource");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "LightStatusBar");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);\r\n"
                        + "getWindow().setStatusBarColor(0xFFFFFFFF);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "نوار وضعیت روشن");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hideKeyboard");
        hashMap.put("type", " ");
        hashMap.put("code", "SketchwareUtil.hideKeyboard(getApplicationContext());");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "پنهان‌کردن کیبورد");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "showKeyboard");
        hashMap.put("type", " ");
        hashMap.put("code", "SketchwareUtil.showKeyboard(getApplicationContext());");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "نمایش کیبورد");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetTitle");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTitle(%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم عنوان %m.progressdialog به %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetMessage");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setMessage(%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم پیام %m.progressdialog به %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetMax");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setMax((int)%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم بیشینه %m.progressdialog به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetProgress");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setProgress((int)%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم پیشرفت %m.progressdialog به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetCancelable");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCancelable(%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.progressdialog قابل لغو؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetCanceled");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCanceledOnTouchOutside(%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.progressdialog لغو با لمس بیرون؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetStyle");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setProgressStyle(ProgressDialog.%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم سبک پیشرفت %m.progressdialog به %m.styleprogress");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogDismiss");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.dismiss();");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "بستن %m.progressdialog");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogShow");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.show();");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "نمایش %m.progressdialog");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "startService");
        hashMap.put("type", " ");
        hashMap.put("code", "startService(new Intent(getApplicationContext(), %s.class));");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "شروع سرویس در %m.activity");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "stopService");
        hashMap.put("type", " ");
        hashMap.put("code", "stopService(new Intent(getApplicationContext(), %s.class));");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "توقف سرویس در %m.activity");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "sendBroadcast");
        hashMap.put("type", " ");
        hashMap.put("code", "sendBroadcast(%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "ارسال برادکست %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "startActivityWithChooser");
        hashMap.put("type", " ");
        hashMap.put("code", "startActivity(Intent.createChooser(%s, %s));");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "شروع %m.intent با انتخابگر %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "finishAffinity");
        hashMap.put("type", "f");
        hashMap.put("code", "finishAffinity();");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "بستن همه اکتیویتی‌ها");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ternaryString");
        hashMap.put("type", "s");
        hashMap.put("code", "%s ? %s : %s");
        hashMap.put("color", "#E1A928");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "اگر %b آنگاه %s وگرنه %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ternaryNumber");
        hashMap.put("type", "d");
        hashMap.put("code", "%s ? (int)%s : (int)%s");
        hashMap.put("color", "#E1A928");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "اگر %b آنگاه %d وگرنه %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "forLoopIncrease");
        hashMap.put("type", "c");
        hashMap.put("code", "for (%s = %s; %s; %s++) {\r\n%s\r\n}");
        hashMap.put("color", "#E1A928");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "برای %m.varInt = %d؛ تا زمانی که %b؛ %m.var++");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "notifyDataSetChanged");
        hashMap.put("type", " ");
        hashMap.put("code", "notifyDataSetChanged();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "بازخوانی داده");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getLastVisiblePosition");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getLastVisiblePosition()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن موقعیت آخرین مورد پیدای %m.listview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listscrollparam");
        hashMap.put("type", "d");
        hashMap.put("code", "ListView.%s");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "پارامتر پیمایش %m.listview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "menuInflater");
        hashMap.put("type", " ");
        hashMap.put("code", "getMenuInflater().inflate(R.menu.%s, menu);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن منو از فایل %m.menu");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "menuAddItem");
        hashMap.put("type", " ");
        hashMap.put("code", "menu.add(0, %s, 0, %s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "افزودن منو با شناسه %d و عنوان %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "menuAddMenuItem");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "MenuItem %1$s = menu.add(Menu.NONE, %2$s, Menu.NONE, %3$s);\r\n"
                        + "%1$s.setIcon(R.drawable.%4$s);\r\n"
                        + "%s.setShowAsAction(MenuItem.%5$s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put(
                "spec",
                "%m.menuitem add id %d title %s icon %m.resource showAsAction %m.menuaction");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "menuAddSubmenu");
        hashMap.put("type", "c");
        hashMap.put("code", "SubMenu %s = menu.addSubMenu(%s);\r\n%s");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "افزودن %m.submenu با عنوان %s؛");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "submenuAddItem");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.add(0, %s, 0, %s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "افزودن زیرمنو با شناسه %d و عنوان %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getAssetFile");
        hashMap.put("type", " ");
        hashMap.put("code", "java.io.InputStream %s = getAssets().open(%s);");
        hashMap.put("color", "#A1887F");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن فایل از assets با مسیر %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "renameFile");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\n"
                        + "java.io.File dYx4Y = new java.io.File(%1$s);\n"
                        + "java.io.File e5Cyk = new java.io.File(%2$s);\n"
                        + "dYx4Y.renameTo(e5Cyk);\n"
                        + "}");
        hashMap.put("color", "#A1887F");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تغییر نام فایل %s به %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "copyAssetFile");
        hashMap.put("type", "s");
        hashMap.put("code", "SketchwareUtil.copyFromInputStream(%s)");
        hashMap.put("color", "#A1887F");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تبدیل %m.inputstream به رشته");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "sortListmap");
        hashMap.put("type", " ");
        hashMap.put("code", "SketchwareUtil.sortListMap(%s, %s, %s, %s);");
        hashMap.put("color", "#CC5B21");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "مرتب‌سازی %m.listMap با کلید %s و عددی؟ %b و صعودی؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "deleteMapFromListmap");
        hashMap.put("type", "a");
        hashMap.put("code", "%2$s.remove(%1$s);");
        hashMap.put("color", "#CC5B21");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "حذف %m.varMap از %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "html");
        hashMap.put("type", "s");
        hashMap.put("typeName", "");
        hashMap.put("code", "Html.fromHtml(%s)");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "کد HTML: %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "reverse");
        hashMap.put("type", "s");
        hashMap.put("code", "new StringBuilder(%s).reverse().toString()");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "معکوس‌کردن %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "toHashCode");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.hashCode()");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تبدیل %s به هش‌کد");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "stringMatches");
        hashMap.put("type", "b");
        hashMap.put("code", "%s.matches(%s)");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%s با الگوی %s مطابقت دارد");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "stringReplaceFirst");
        hashMap.put("type", "s");
        hashMap.put("code", "%s.replaceFirst(%s, %s)");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "جایگزینی اولین تطابق %s در الگوی %s با %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "stringReplaceAll");
        hashMap.put("type", "s");
        hashMap.put("code", "%s.replaceAll(%s, %s)");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "جایگزینی همه تطابق‌های %s در الگوی %s با %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "stringSplitToList");
        hashMap.put("type", " ");
        hashMap.put("code", "%3$s = new ArrayList<String>(Arrays.asList(%1$s.split(%2$s)));");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "شکستن %s با الگوی %s به لیست %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "mapContainValue");
        hashMap.put("type", "b");
        hashMap.put("code", "%s.containsValue(%s)");
        hashMap.put("color", "#EE7D15");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.varMap شامل مقدار %s است");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getHeight");
        hashMap.put("type", "d");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.getHeight()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن ارتفاع %m.view");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getWidth");
        hashMap.put("type", "d");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.getWidth()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن عرض %m.view");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "removeView");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.removeView(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "حذف ویو %m.view از %m.view");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "removeViews");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.removeAllViews();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "حذف همه ویوهای %m.view");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "addView");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.addView(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "افزودن ویو %m.view به %m.view");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "addViews");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.addView(%s, %s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "افزودن ویو %m.view به %m.view در جایگاه %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setGravity");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setGravity(Gravity.%s | Gravity.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم گراویته %m.view به %m.gravity_v و %m.gravity_h");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setImageIdentifier");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setImageResource(getResources().getIdentifier(%s, \"drawable\","
                        + " getPackageName()));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم تصویر %m.imageview با نام %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setImageCustomRes");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setImageResource(R.drawable.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم تصویر %m.imageview به %m.image");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getRating");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getRating()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن امتیاز %m.ratingbar");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setRating");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setRating((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم امتیاز %m.ratingbar به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setNumStars");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setNumStars((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم تعداد ستاره‌های %m.ratingbar به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setStepSize");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setStepSize((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم گام امتیاز %m.ratingbar به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "timepickerSetIs24Hour");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setIs24HourView(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.timepicker قالب ۲۴ ساعته؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "timepickerSetCurrentHour");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCurrentHour((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم ساعت %m.timepicker به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "timepickerSetCurrentMinute");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCurrentMinute((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم دقیقه %m.timepicker به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "timepickerSetHour");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setHour((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم ساعت %m.timepicker به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "timepickerSetMinute");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setMinute((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم دقیقه %m.timepicker به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "autoComSetData");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setAdapter(new ArrayAdapter<String>(getBaseContext(),"
                        + " android.R.layout.simple_list_item_1, %s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم داده لیست %m.actv به %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setThreshold");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setThreshold(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم آستانه %m.mactv به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setTokenizer");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mactv با جداکننده ویرگول");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "multiAutoComSetData");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setAdapter(new ArrayAdapter<String>(getBaseContext(),"
                        + " android.R.layout.simple_list_item_1, %s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم داده لیست %m.mactv به %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listSetSelector");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setSelector(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم انتخابگر %m.listview به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "gridSetCustomViewData");
        hashMap.put("type", " ");
        hashMap.put("code", "");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم داده ویو سفارشی %m.gridview به %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "gridSetNumColumns");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setNumColumns((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم تعداد ستون‌های %m.gridview به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "gridSetColumnWidth");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setColumnWidth((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم عرض ستون %m.gridview به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "gridSetVerticalSpacing");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setVerticalSpacing((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم فاصله عمودی %m.gridview به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "gridSetHorizontalSpacing");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setHorizontalSpacing((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم فاصله افقی %m.gridview به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "gridSetStretchMode");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setStretchMode(GridView.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم حالت کشیدگی %m.gridview به %m.gridstretchmode");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewSetVideoUri");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setVideoURI(Uri.parse(%s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم آدرس ویدیوی %m.videoview به %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewStart");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.start();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "پخش %m.videoview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewPause");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.pause();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "توقف موقت %m.videoview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewStop");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.stopPlayback();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "متوقف‌کردن %m.videoview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewIsPlaying");
        hashMap.put("type", "b");
        hashMap.put("code", "%s.isPlaying()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "در حال پخش است؟ %m.videoview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewCanPause");
        hashMap.put("type", "b");
        hashMap.put("code", "%s.canPause()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "قابل توقف موقت؟ %m.videoview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewCanSeekForward");
        hashMap.put("type", "b");
        hashMap.put("code", "%s.canSeekForward()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "قابل جلوبردن؟ %m.videoview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewCanSeekBackward");
        hashMap.put("type", "b");
        hashMap.put("code", "%s.canSeekBackward()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "قابل عقب‌بردن؟ %m.videoview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewGetDuration");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getDuration()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن مدت‌زمان %m.videoview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewGetCurrentPosition");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getCurrentPosition()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن موقعیت فعلی %m.videoview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listSetTranscriptMode");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setTranscriptMode(ListView.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم حالت گفتگوی %m.listview به %m.transcriptmode");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listSetStackFromBottom");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setStackFromBottom(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "چیدن %m.listview از پایین؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setElevation");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setElevation((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم ارتفاع سایه %m.view به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setTextSize");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTextSize((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم اندازه متن %m.textview به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setColorFilterView");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.getBackground().setColorFilter(%s, PorterDuff.Mode.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم فیلتر رنگ %m.view به %m.color با حالت %m.porterduff");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setCornerRadiusView");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a,"
                        + " int b) { this.setCornerRadius(a); this.setColor(b); return this; }"
                        + " }.getIns((int)%s, %s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم گردی گوشه %m.view به %d و رنگ %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setGradientBackground");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new"
                        + " int[] {%s,%s}));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم پس‌زمینه گرادیانی %m.view از %m.color تا %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setStrokeView");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a,"
                        + " int b, int c) { this.setStroke(a, b); this.setColor(c); return this; }"
                        + " }.getIns((int)%s, %s, %s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم ضخامت خط دور %m.view به %d و رنگ خط %m.color و پس‌زمینه %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setRadiusAndStrokeView");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a,"
                        + " int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c);"
                        + " this.setColor(d); return this; } }.getIns((int)%s, (int)%s, %s, %s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put(
                "spec",
                "%m.view setCornerRadius %d stroke %d strokeColor %m.color bgColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "showSnackbar");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "com.google.android.material.snackbar.Snackbar.make(%s, %s,"
                        + " com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction(%s,"
                        + " new View.OnClickListener(){\r\n"
                        + "@Override\r\n"
                        + "public void onClick(View _view) {\r\n"
                        + "%s\r\n"
                        + "}\r\n"
                        + "}).show();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "نمایش اسنک‌بار در %m.view با متن %s و دکمه %s و رویداد کلیک");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "addTab");
        hashMap.put("type", " ");
        hashMap.put("code", "%1$s.addTab(%1$s.newTab().setText(%2$s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "افزودن زبانه با عنوان %s به %m.tablayout");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setupWithViewPager");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setupWithViewPager(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "هماهنگ‌سازی %m.tablayout با %m.viewpager");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setInlineLabel");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setInlineLabel(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.tablayout برچسب هم‌خط؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setTabTextColors");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTabTextColors(%s, %s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم رنگ متن زبانه‌های %m.tablayout عادی %m.color و انتخاب‌شده %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setTabRippleColor");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setTabRippleColor(new android.content.res.ColorStateList(new int[][]{new"
                        + " int[]{android.R.attr.state_pressed}}, \r\n\r\n"
                        + "new int[] {%s}));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم رنگ موج کلیک زبانه‌های %m.tablayout به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setSelectedTabIndicatorColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setSelectedTabIndicatorColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم رنگ نشانگر زبانه فعال %m.tablayout به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setSelectedTabIndicatorHeight");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setSelectedTabIndicatorHeight(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم ضخامت نشانگر زبانه فعال %m.tablayout به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnTitle");
        hashMap.put("type", "f");
        hashMap.put("code", "return %s;");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "برگرداندن عنوان %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnFragment");
        hashMap.put("type", "f");
        hashMap.put("code", "return new %s();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "برگرداندن Fragment از %m.activity");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "bottomMenuAddItem");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.getMenu().add(0, %s, 0, %s).setIcon(R.drawable.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "افزودن مورد به %m.bottomnavigation با شناسه %d و عنوان %s و آیکون %m.resource");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "codeviewSetCode");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCode(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم کد %m.codeview به %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "codeviewSetTheme");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTheme(Theme.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم پوسته %m.codeview به %m.cv_theme");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "codeviewSetLanguage");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setLanguage(Language.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم زبان %m.codeview به %m.cv_language");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "codeviewApply");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.apply();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "اعمال %m.codeview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "fabIcon");
        hashMap.put("type", " ");
        hashMap.put("code", "_fab.setImageResource(R.drawable.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم آیکون دکمه شناور به %m.resource");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "fabSize");
        hashMap.put("type", " ");
        hashMap.put("code", "_fab.setSize(FloatingActionButton.SIZE_%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم اندازه دکمه شناور به %m.fabsize");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "fabVisibility");
        hashMap.put("type", " ");
        hashMap.put("code", "_fab.%s();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم نمایش دکمه شناور به %m.fabvisible");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBgDrawable");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBackgroundDrawable(getResources().getDrawable(R.drawable.%s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم پس‌زمینه %m.view به %m.drawable");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setCardBackgroundColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCardBackgroundColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم رنگ پس‌زمینه کارت %m.cardview به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setCardRadius");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setRadius((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم گردی گوشه کارت %m.cardview به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setCardElevation");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCardElevation((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم سایه کارت %m.cardview به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setPreventCornerOverlap");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setPreventCornerOverlap(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.cardview جلوگیری از همپوشانی گوشه‌ها؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setUseCompatPadding");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setUseCompatPadding(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.cardview فاصله سازگار؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "spnSetCustomViewData");
        hashMap.put("type", " ");
        hashMap.put("code", "");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم داده ویو سفارشی %m.spinner به %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "lottieSetAnimationFromAsset");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setAnimation(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم انیمیشن %m.lottie از assets با %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "lottieSetAnimationFromJson");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setAnimationFromJson(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم انیمیشن %m.lottie از JSON با %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "lottieSetAnimationFromUrl");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setAnimationFromUrl(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم انیمیشن %m.lottie از آدرس %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "lottieSetRepeatCount");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setRepeatCount((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم تعداد تکرار %m.lottie به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "lottieSetSpeed");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setSpeed((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم سرعت %m.lottie به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerSetCustomViewData");
        hashMap.put("type", " ");
        hashMap.put("code", "");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم داده ویو سفارشی %m.recyclerview به %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerSetLayoutManager");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setLayoutManager(new LinearLayoutManager(this));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم چیدمان‌دهنده %m.recyclerview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerSetLayoutManagerHorizontal");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,"
                        + " false));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم چیدمان‌دهنده افقی %m.recyclerview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerSetHasFixedSize");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setHasFixedSize(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.recyclerview اندازه ثابت؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerSmoothScrollToPosition");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.smoothScrollToPosition((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "پیمایش نرم %m.recyclerview به موقعیت %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerScrollToPositionWithOffset");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                " ((LinearLayoutManager) %s.getLayoutManager()).scrollToPositionWithOffset((int)%s,"
                        + " (int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "پیمایش %m.recyclerview به موقعیت %d با فاصله %d ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerscrollparam");
        hashMap.put("type", "d");
        hashMap.put("code", "RecyclerView.%s");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "پارامتر پیمایش %m.recyclerview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerscrollparam");
        hashMap.put("type", "d");
        hashMap.put("code", "ViewPager.%s");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "پارامتر پیمایش %m.viewpager");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerSetCustomViewData");
        hashMap.put("type", " ");
        hashMap.put("code", "");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم داده ویو سفارشی %m.viewpager به %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerSetFragmentAdapter");
        hashMap.put("type", " ");
        hashMap.put("code", "%2$s.setTabCount(%3$s);\r\n%1$s.setAdapter(%2$s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم آداپتور Fragment های %m.viewpager به %m.fragmentAdapter با تعداد زبانه %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerGetOffscreenPageLimit");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getOffscreenPageLimit()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن سقف صفحات خارج از دید %m.viewpager");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerSetOffscreenPageLimit");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setOffscreenPageLimit((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم سقف صفحات خارج از دید %m.viewpager به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerGetCurrentItem");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getCurrentItem()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن صفحه فعلی %m.viewpager");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerSetCurrentItem");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCurrentItem((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم صفحه فعلی %m.viewpager به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "onSwipeRefreshLayout");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "%s.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {\r\n"
                        + "@Override\r\n"
                        + "public void onRefresh() {\r\n"
                        + "%s\r\n"
                        + "}\r\n"
                        + "});");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "وقتی %m.swiperefreshlayout بازخوانی شد");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setRefreshing");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setRefreshing(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "حالت بازخوانی %m.swiperefreshlayout؟ %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "viewOnLongClick");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "%s.setOnLongClickListener(new View.OnLongClickListener() {\r\n"
                        + "@Override\r\n"
                        + "public boolean onLongClick(View _view) {\r\n"
                        + "%s\r\n"
                        + "return true;\r\n"
                        + "}\r\n"
                        + "});");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "وقتی %m.view طولانی کلیک شد");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "viewOnTouch");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "%s.setOnTouchListener(new View.OnTouchListener(){\r\n"
                        + "@Override\r\n"
                        + "public boolean onTouch(View _view, MotionEvent _motionEvent){\r\n"
                        + "%s\r\n"
                        + "return true;\r\n"
                        + "}\r\n"
                        + "});");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "وقتی %m.view لمس شد");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "checkboxOnChecked");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "%s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {\r\n"
                        + "@Override\r\n"
                        + "public void onCheckedChanged(CompoundButton cb, boolean isChecked) {\r\n"
                        + "%s\r\n"
                        + "}});");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "وقتی %m.checkbox تیک خورد");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "checkboxIsChecked");
        hashMap.put("type", "b");
        hashMap.put("code", "isChecked");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تیک خورده است؟");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getBadgeCount");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getBadgeCount();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن تعداد نشان %m.badgeview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBadgeNumber");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBadgeCount(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم تعداد نشان %m.badgeview به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBadgeString");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBadgeCount(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم متن نشان %m.badgeview به %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBadgeBackground");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBadgeBackground(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم پس‌زمینه نشان %m.badgeview به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBadgeTextColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTextColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم رنگ متن نشان %m.badgeview به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBadgeTextSize");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTextSize((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم اندازه متن نشان %m.badgeview به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setCustomLetter");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCustomLetter(new String[]%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم حروف سفارشی %m.sidebar با آرایه %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBubbleColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم رنگ حباب %m.view به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleStrokeColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setStrokeColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم رنگ خط دور حباب %m.view به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleStrokeWidth");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setStrokeWidth((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم ضخامت خط دور حباب %m.view به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleCornerRadius");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCornersRadius((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم گردی گوشه حباب %m.view به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleArrowHeight");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setArrowHeight((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم ارتفاع پیکان حباب %m.view به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleArrowWidth");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setArrowWidth((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم عرض پیکان حباب %m.view به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleArrowPosition");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setArrowPosition((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم موقعیت پیکان حباب %m.view به %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternToString");
        hashMap.put("type", "s");
        hashMap.put("code", "PatternLockUtils.patternToString(%s, %s)");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن الگوی %m.patternview از %m.listStr به‌صورت رشته ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternToMD5");
        hashMap.put("type", "s");
        hashMap.put("code", "PatternLockUtils.patternToMD5(%s, %s)");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن الگوی %m.patternview از %m.listStr به MD5");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternToSha1");
        hashMap.put("type", "s");
        hashMap.put("code", "PatternLockUtils.patternToSha1(%s, %s)");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن الگوی %m.patternview از %m.listStr به SHA1");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternSetDotCount");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setDotCount((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم تعداد نقطه‌های %m.patternview به %d ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternSetNormalStateColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setNormalStateColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم رنگ حالت عادی %m.patternview به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternSetCorrectStateColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCorrectStateColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم رنگ حالت درست %m.patternview به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternSetWrongStateColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setWrongStateColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم رنگ حالت غلط %m.patternview به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternSetViewMode");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setViewMode(PatternLockView.PatternViewMode.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم حالت نمایش %m.patternview به %m.patternviewmode");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternLockClear");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.clearPattern();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "پاک‌کردن الگوی %m.patternview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetBoxBgColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBoxBackgroundColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم رنگ پس‌زمینه کادر %m.textinputlayout به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetBoxStrokeColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBoxStrokeColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم رنگ خط دور کادر %m.textinputlayout به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetBoxBgMode");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم حالت پس‌زمینه کادر %m.textinputlayout به %m.til_box_mode");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetBoxCornerRadii");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBoxCornerRadii((float)%s, (float)%s, (float)%s, (float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم گردی گوشه‌های کادر %m.textinputlayout بالا-راست %d بالا-چپ %d پایین-راست %d پایین-چپ %d ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetError");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setError(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم خطای %m.textinputlayout به %s ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetErrorEnabled");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setErrorEnabled(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "فعال‌بودن خطای %m.textinputlayout؟ %b ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetCounterEnabled");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCounterEnabled(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "فعال‌بودن شمارنده %m.textinputlayout؟ %b ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetCounterMaxLength");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCounterMaxLength(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم بیشینه شمارنده %m.textinputlayout به %d ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilGetCounterMaxLength");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getCounterMaxLength()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن بیشینه شمارنده %m.textinputlayout");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "YTPVLifecycle");
        hashMap.put("type", " ");
        hashMap.put("code", "getLifecycle().addObserver(%1$s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن چرخه حیات %m.youtubeview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "YTPVSetListener");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "%1$s.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {\r\n"
                        + "  @Override\r\n"
                        + "  public void onReady(@NonNull YouTubePlayer youTubePlayer) {\r\n"
                        + "    String videoId = %2$s;\r\n"
                        + "    youTubePlayer.cueVideo(videoId, 0);\r\n"
                        + "    %3$s\r\n"
                        + "  }\r\n"
                        + "});");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "افزودن شنونده پخش‌کننده به %m.youtubeview با شناسه ویدیو %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "launchApp");
        hashMap.put("type", " ");
        hashMap.put("code", "%s = getPackageManager().getLaunchIntentForPackage(%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم پکیج برنامه %m.intent به %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "changeStatebarColour");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {\r\n"
                        + "final Window window = %s.this.getWindow();\r\n"
                        + "window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);\r\n"
                        + "window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);\r\n"
                        + "window.setStatusBarColor(%s);\r\n"
                        + "}");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم رنگ نوار وضعیت %m.activity به %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "Dialog SetIcon");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setIcon(R.drawable.%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم آیکون %m.dialog به %m.resource_bg");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ViewPagerNotifyOnDtatChange");
        hashMap.put("type", " ");
        hashMap.put("code", "((PagerAdapter)%s.getAdapter()).notifyDataSetChanged();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "اطلاع‌رسانی تغییر داده به %m.viewpager");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnMap");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return %s;");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "برگرداندن %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnListStr");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return %s;");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "برگرداندن %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnListMap");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return %s;");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "برگرداندن %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnView");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return %s;");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "برگرداندن %m.view");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "repeatKnownNum");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "for (int %2$s = 0; %2$s < (int)(%1$s); %2$s++) {\r\n%3$s\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تکرار %d بار: %s با ++");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "whileLoop");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "while(%s) {\r\n%s\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تا زمانی که %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tryCatch");
        hashMap.put("type", "e");
        hashMap.put("typeName", "");
        hashMap.put("code", "try {\r\n%s\r\n} catch (Exception e) {\r\n%s\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "امتحان");
        hashMap.put("spec2", "catch");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "switchStr");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "switch(%s) {\r\n%s\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "سوییچ روی %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "switchNum");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "switch((int)%s) {\r\n%s\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "سوییچ روی %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "caseStr");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "case %s: {\r\n%s\r\nbreak;\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "حالت %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "caseNum");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "case ((int)%s): {\r\n%s\r\nbreak;\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "حالت %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "defaultSwitch");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "default: {\r\n%s\r\nbreak;\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "پیش‌فرض");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnString");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return (%s);");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "برگرداندن %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnNumber");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return (%s);");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "برگرداندن %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnBoolean");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return (%s);");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "برگرداندن %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "reverseList");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "Collections.reverse(%s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "معکوس‌کردن %m.list");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "shuffleList");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "Collections.shuffle(%s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "بُر زدن %m.list");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "sortList");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "Collections.sort(%s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "مرتب‌سازی %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "sortListnum");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "Collections.sort(%s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "مرتب‌سازی %m.listInt");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "swapInList");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "Collections.swap(%s, (int)(%s), (int)(%s));");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "جابه‌جایی مورد %d با %d در %m.list");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getMapAtPosListmap");
        hashMap.put("type", "a");
        hashMap.put("typeName", "");
        hashMap.put("code", "%2$s.get((int)(%1$s))");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن Map از موقعیت %d از %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setMapAtPosListmap");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%3$s.set((int)(%2$s), %1$s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم %m.varMap در موقعیت %d از %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setAtPosListstr");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%3$s.set((int)%2$s, %1$s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم %s در موقعیت %d از %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setAtPosListnum");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%3$s.set((int)%2$s, %1$s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تنظیم %d در موقعیت %d از %m.listInt");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "GsonListTojsonString");
        hashMap.put("type", "s");
        hashMap.put("typeName", "");
        hashMap.put("code", "new Gson().toJson(%s)");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تبدیل %m.list به رشته JSON");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "GsonStringToListString");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "%2$s = new Gson().fromJson(%1$s, new"
                        + " TypeToken<ArrayList<String>>(){}.getType());");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تبدیل JSON %s به %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "GsonStringToListNumber");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "%2$s = new Gson().fromJson(%1$s, new"
                        + " TypeToken<ArrayList<Double>>(){}.getType());");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تبدیل JSON %s به %m.listInt");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapGetNumber");
        hashMap.put("type", "d");
        hashMap.put("code", "(double)%s.get(%s)");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "گرفتن عدد با کلید %s از %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapPutNumber");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.put(%s, (int)(%s));");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "قرار دادن کلید %s با مقدار عددی %d در %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapPutNumber2");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.put(%s, (double)(%s));");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "قرار دادن کلید %s با مقدار اعشاری %d در %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapGetBoolean");
        hashMap.put("type", "b");
        hashMap.put("code", "(boolean)%s.get(%s)");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "گرفتن بولی با کلید %s از %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapPutBoolean");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.put(%s, %s);");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "قرار دادن کلید %s با مقدار %b در %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapGetMap");
        hashMap.put("type", "a");
        hashMap.put("code", "(HashMap<String,Object>)%s.get(%s)");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "گرفتن Map با کلید %s از %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapPutMap");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.put(%s, %s);");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "قرار دادن کلید %s با مقدار %m.varMap در %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapListstr");
        hashMap.put("type", "l");
        hashMap.put("typeName", "List String");
        hashMap.put("code", "(ArrayList<String>)%s.get(%s)");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "گرفتن لیست رشته با کلید %s از %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapPutListstr");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.put(%s, %s);");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "قرار دادن کلید %s با مقدار %m.listStr در %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapGetListmap");
        hashMap.put("type", "l");
        hashMap.put("typeName", "List Map");
        hashMap.put("code", "(ArrayList<HashMap<String,Object>>)%s.get(%s)");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "گرفتن لیست Map با کلید %s از %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapPutListmap");
        hashMap.put("type", " ");
        hashMap.put("color", "#ee7d15");
        hashMap.put("code", "%s.put(%s, %s);");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "قرار دادن کلید %s با مقدار %m.listMap در %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "addSourceDirectly");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "افزودن مستقیم کد: %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "asdBoolean");
        hashMap.put("type", "b");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "بولی: %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "asdNumber");
        hashMap.put("type", "d");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "عدد: %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "asdString");
        hashMap.put("type", "s");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "رشته: %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "RepeatKnownNumDescending");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "for (int %2$s = ((int) %1$s - 1); %2$s > -1; %2$s--) {\r\n%3$s\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "تکرار %d بار: %s با --");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "interstitialAdLoad");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "{\r\n"
                        + "AdRequest adRequest = new AdRequest.Builder().build();\r\n"
                        + "InterstitialAd.load(%2$s.this, _ad_unit_id, adRequest,"
                        + " _%1$s_interstitial_ad_load_callback);\r\n"
                        + "}");
        hashMap.put("color", "#2aa4e2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "بارگذاری %m.interstitialad در %m.activity");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "interstitialAdShow");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "if (%1$s != null) {\r\n"
                        + "%1$s.show(%2$s.this);\r\n"
                        + "} else {\r\n"
                        + "SketchwareUtil.showMessage(getApplicationContext(), \"Error: InterstitialAd"
                        + " %1$s hasn't been loaded yet!\");\r\n"
                        + "}");
        hashMap.put("color", "#2aa4e2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "نمایش تبلیغ %m.interstitialad در %m.activity");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "interstitialAdIsLoaded");
        hashMap.put("type", "b");
        hashMap.put("typeName", "");
        hashMap.put("code", "%1$s != null");
        hashMap.put("color", "#2aa4e2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "بارگذاری‌شده است؟ %m.interstitialad");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "interstitialAdRegisterFullScreenContentCallback");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "");
        hashMap.put("color", "#2aa4e2");
        hashMap.put("palette", "-1");
        hashMap.put(
                "spec",
                "%m.interstitialad register fullscreen content callbacks (This Block isn't needed"
                        + " anymore, please remove it)");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "rewardedAdRegisterFullScreenContentCallback");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "");
        hashMap.put("color", "#2aa4e2");
        hashMap.put("palette", "-1");
        hashMap.put(
                "spec",
                "%m.videoad register fullscreen content callbacks (This Block isn't needed anymore,"
                        + " please remove it)");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getResString");
        hashMap.put("type", "s");
        hashMap.put("code", "getString(%s)");
        hashMap.put("color", "#7c83db");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "گرفتن رشته از %m.ResString");
        arrayList.add(hashMap);
    }

    private static boolean showAll() {
        return ConfigActivity.isSettingEnabled(ConfigActivity.SETTING_ALWAYS_SHOW_BLOCKS)
                || ConfigActivity.isSettingEnabled(ConfigActivity.SETTING_SHOW_EVERY_SINGLE_BLOCK);
    }

    private static boolean showBuiltIn() {
        return ConfigActivity.isSettingEnabled(ConfigActivity.SETTING_SHOW_BUILT_IN_BLOCKS)
                || ConfigActivity.isSettingEnabled(ConfigActivity.SETTING_SHOW_EVERY_SINGLE_BLOCK);
    }

    public static void primaryBlocksA(
            LogicEditorActivity logicEditorActivity,
            boolean isBoolUsed,
            boolean isIntUsed,
            boolean isStrUsed,
            boolean isMapUsed) {
        logicEditorActivity.a("Blocks", getTitleBgColor(logicEditorActivity));
        if (showAll() || isBoolUsed) {
            logicEditorActivity.a(" ", "setVarBoolean");
        }
        if (showAll() || isIntUsed) {
            logicEditorActivity.a(" ", "setVarInt");
            logicEditorActivity.a(" ", "increaseInt");
            logicEditorActivity.a(" ", "decreaseInt");
        }
        if (showAll() || isStrUsed) {
            logicEditorActivity.a(" ", "setVarString");
        }
        if (showAll() || isMapUsed) {
            logicEditorActivity.a(" ", "mapCreateNew");
            logicEditorActivity.a("Map put values", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a(" ", "mapPut");
        }
        if (showBuiltIn() && (showAll() || isMapUsed)) {
            logicEditorActivity.a(" ", "hashmapPutNumber");
            logicEditorActivity.a(" ", "hashmapPutNumber2");
            logicEditorActivity.a(" ", "hashmapPutBoolean");
            logicEditorActivity.a(" ", "hashmapPutMap");
            logicEditorActivity.a(" ", "hashmapPutListstr");
            logicEditorActivity.a(" ", "hashmapPutListmap");
        }
        if (showAll() || isMapUsed) {
            logicEditorActivity.a("Map get values", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a("s", "mapGet");
        }
        if (showBuiltIn() && (showAll() || isMapUsed)) {
            logicEditorActivity.a("d", "hashmapGetNumber");
            logicEditorActivity.a("b", "hashmapGetBoolean");
            logicEditorActivity.a("a", "hashmapGetMap");
            logicEditorActivity.a("", "l", "List String", "hashmapListstr");
            logicEditorActivity.a("", "l", "List Map", "hashmapGetListmap");
        }
        if (showAll() || isMapUsed) {
            logicEditorActivity.a("Map general", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a("b", "mapIsEmpty");
            logicEditorActivity.a("b", "mapContainKey");
            logicEditorActivity.a("b", "mapContainValue");
            logicEditorActivity.a("d", "mapSize");
            logicEditorActivity.a(" ", "mapRemoveKey");
            logicEditorActivity.a(" ", "mapClear");
            logicEditorActivity.a(" ", "mapGetAllKeys");
        }
    }

    public static void primaryBlocksB(
            LogicEditorActivity logicEditorActivity,
            boolean isListNumUsed,
            boolean isListStrUsed,
            boolean isListMapUsed) {
        String eventName = logicEditorActivity.eventName;
        boolean inOnBindCustomViewEvent = eventName.equals("onBindCustomView");
        boolean inOnFilesPickedEvent = eventName.equals("onFilesPicked");
        if (showAll() || isListNumUsed) {
            logicEditorActivity.a("List Number", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a("b", "containListInt");
            logicEditorActivity.a("d", "getAtListInt");
            logicEditorActivity.a("d", "indexListInt");
            logicEditorActivity.a(" ", "addListInt");
            logicEditorActivity.a(" ", "insertListInt");
        }
        if (showBuiltIn() && (showAll() || isListNumUsed)) {
            logicEditorActivity.a(" ", "setAtPosListnum");
        }
        if (showBuiltIn() && (showAll() || isListNumUsed)) {
            logicEditorActivity.a(" ", "sortListnum");
        }
        if (showAll() || isListStrUsed || inOnFilesPickedEvent) {
            logicEditorActivity.a("List String", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a("b", "containListStr");
            logicEditorActivity.a("d", "indexListStr");
            logicEditorActivity.a("s", "getAtListStr");
            logicEditorActivity.a(" ", "addListStr");
            logicEditorActivity.a(" ", "insertListStr");
        }
        if (showBuiltIn() && (showAll() || isListStrUsed)) {
            logicEditorActivity.a(" ", "setAtPosListstr");
        }
        if (showAll() || isListStrUsed) {
            logicEditorActivity.a(" ", "sortList");
        }
        if (showAll() || isListMapUsed || inOnBindCustomViewEvent) {
            logicEditorActivity.a("List Map", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a("b", "containListMap");
            logicEditorActivity.a("s", "getAtListMap");
            if (showBuiltIn()) {
                logicEditorActivity.a("a", "getMapAtPosListmap");
            }
            logicEditorActivity.a(" ", "addListMap");
            logicEditorActivity.a(" ", "insertListMap");
            logicEditorActivity.a(" ", "setListMap");
            logicEditorActivity.a(" ", "setMapAtPosListmap");
        }
        if (showAll() || isListMapUsed) {
            logicEditorActivity.a(" ", "addMapToList");
            logicEditorActivity.a(" ", "insertMapToList");
            logicEditorActivity.a(" ", "getMapInList");
            logicEditorActivity.a(" ", "deleteMapFromListmap");
            logicEditorActivity.a(" ", "sortListmap");
        }
        if (showAll()
                || isListMapUsed
                || isListStrUsed
                || isListNumUsed
                || inOnBindCustomViewEvent
                || inOnFilesPickedEvent) {
            logicEditorActivity.a("General", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a(" ", "listAddAll");
            logicEditorActivity.a("d", "lengthList");
            logicEditorActivity.a(" ", "deleteList");
            logicEditorActivity.a(" ", "clearList");
            logicEditorActivity.a(" ", "reverseList");
            if (showBuiltIn()) {
                logicEditorActivity.a(" ", "shuffleList");
                logicEditorActivity.a(" ", "swapInList");
            }
        }
    }

    public static void primaryBlocksC(LogicEditorActivity logicEditorActivity) {
        logicEditorActivity.a("c", "repeat");
        if (showBuiltIn()) {
            logicEditorActivity.a("c", "repeatKnownNum");
            logicEditorActivity.a("c", "RepeatKnownNumDescending");
        }
        logicEditorActivity.a("c", "forever");
        if (showBuiltIn()) {
            logicEditorActivity.a("c", "whileLoop");
        }
        logicEditorActivity.a("c", "if");
        logicEditorActivity.a("e", "ifElse");
        if (showBuiltIn()) {
            logicEditorActivity.a("b", "instanceOfOperator");
            logicEditorActivity.a("b", "isEmpty");
            logicEditorActivity.a("c", "switchStr");
            logicEditorActivity.a(" ", "caseStrAnd");
            logicEditorActivity.a("c", "caseStr");
            logicEditorActivity.a("c", "switchNum");
            logicEditorActivity.a(" ", "caseNumAnd");
            logicEditorActivity.a("c", "caseNum");
            logicEditorActivity.a("c", "defaultSwitch");
            logicEditorActivity.a("e", "tryCatch");
            logicEditorActivity.a("s", "ternaryString");
            logicEditorActivity.a("d", "ternaryNumber");
            logicEditorActivity.a("f", "returnString");
            logicEditorActivity.a("f", "returnNumber");
            logicEditorActivity.a("f", "returnBoolean");
            logicEditorActivity.a("f", "returnMap");
            logicEditorActivity.a("f", "returnListStr");
            logicEditorActivity.a("f", "returnListMap");
            logicEditorActivity.a("f", "returnView");
            logicEditorActivity.a("f", "break");
            logicEditorActivity.a("f", "continue");
        }
    }

    public static void primaryBlocksD(LogicEditorActivity logicEditorActivity) {
        logicEditorActivity.a("b", "true");
        logicEditorActivity.a("b", "false");
        logicEditorActivity.a("b", "<");
        logicEditorActivity.a("b", "=");
        logicEditorActivity.a("b", ">");
        logicEditorActivity.a("b", "&&");
        logicEditorActivity.a("b", "||");
        logicEditorActivity.a("b", "not");
        logicEditorActivity.a("d", "+");
        logicEditorActivity.a("d", "-");
        logicEditorActivity.a("d", "*");
        logicEditorActivity.a("d", "/");
        logicEditorActivity.a("d", "%");
        logicEditorActivity.a("d", "random");
        logicEditorActivity.a("d", "stringLength");
        logicEditorActivity.a("s", "stringJoin");
        logicEditorActivity.a("d", "stringIndex");
        logicEditorActivity.a("d", "stringLastIndex");
        logicEditorActivity.a("s", "stringSub");
        if (showBuiltIn()) {
            logicEditorActivity.a("s", "stringSubSingle");
        }
        logicEditorActivity.a("b", "stringEquals");
        logicEditorActivity.a("b", "stringContains");
        if (showBuiltIn()) {
            logicEditorActivity.a("b", "stringMatches");
        }
        logicEditorActivity.a("s", "stringReplace");
        if (showBuiltIn()) {
            logicEditorActivity.a("s", "stringReplaceFirst");
            logicEditorActivity.a("s", "stringReplaceAll");
            logicEditorActivity.a("s", "reverse");
            logicEditorActivity.a("s", "html");
        }
        logicEditorActivity.a("s", "trim");
        logicEditorActivity.a("s", "toUpperCase");
        logicEditorActivity.a("s", "toLowerCase");
        logicEditorActivity.a("d", "toNumber");
        logicEditorActivity.a("d", "strParseInteger");
        logicEditorActivity.a("d", "toHashCode");
        logicEditorActivity.a("s", "toString");
        logicEditorActivity.a("s", "toStringWithDecimal");
        logicEditorActivity.a("s", "toStringFormat");
        logicEditorActivity.a(" ", "strToMap");
        logicEditorActivity.a("s", "mapToStr");
        logicEditorActivity.a(" ", "strToListMap");
        logicEditorActivity.a("s", "listMapToStr");
        if (showBuiltIn()) {
            logicEditorActivity.a(" ", "GsonStringToListString");
            logicEditorActivity.a(" ", "GsonStringToListNumber");
            logicEditorActivity.a("s", "GsonListTojsonString");
            logicEditorActivity.a(" ", "stringSplitToList");
        }
        logicEditorActivity.a("add source directly", getTitleBgColor(logicEditorActivity));
        logicEditorActivity.a(" ", "addSourceDirectly");
        logicEditorActivity.a("b", "asdBoolean");
        logicEditorActivity.a("d", "asdNumber");
        logicEditorActivity.a("s", "asdString");
    }

    private static @ColorInt int getTitleBgColor(LogicEditorActivity logicEditorActivity) {
        return ThemeUtils.getColor(logicEditorActivity, ThemeUtils.isDarkThemeEnabled(logicEditorActivity) ? R.attr.colorSurfaceContainerHigh : R.attr.colorSurfaceInverse);
    }
}
