# -*- coding: utf-8 -*-
"""Round 6: toast/message literals. Keep code-gen snippets (Toast.makeText..., SketchwareUtil.CustomToast(...),
copyToClipboard, setTitle, intentSetAction/Data, gravity_t, customToast, SketchwareUtil) untouched."""

import re, os

ROOT = '/root/sw-fa/app/src/main/java'

T = {
 " as Activity to AndroidManifest": " به‌عنوان Activity در AndroidManifest",
 " as Service to AndroidManifest": " به‌عنوان Service در AndroidManifest",
 " from AndroidManifest": " از AndroidManifest",
 "APK doesn't exist anymore": "APK دیگر وجود ندارد",
 "Activity removed": "اکتیویتی حذف شد",
 "Activity was not defined in AndroidManifest.": "اکتیویتی در AndroidManifest تعریف نشده است.",
 "An item with this name already exists": "موردی با این نام از قبل وجود دارد",
 "Api key can't be empty!": "کلید API نمی‌تواند خالی باشد!",
 "Blocks imported!": "بلوک‌ها وارد شدند!",
 "Compile logs have been cleared.": "لاگ‌های کامپایل پاک شدند.",
 "Configure Firebase settings first, either by importing google-services.json, ": "ابتدا تنظیمات Firebase را انجام دهید؛ یا google-services.json را وارد کنید، ",
 "Copied to clipboard": "در کلیپ‌بورد کپی شد",
 "Couldn't acquire root access": "دسترسی روت دریافت نشد",
 "Couldn't load font: ": "بارگذاری فونت ناموفق: ",
 "Couldn't restore: ": "بازیابی ناموفق: ",
 "Created file successfully": "فایل با موفقیت ساخته شد",
 "Created folder successfully": "پوشه با موفقیت ساخته شد",
 "Deleted successfully": "با موفقیت حذف شد",
 "Don't forget to enable D8 to be able to compile Java 8+ code": "فراموش نکنید برای کامپایل کد Java 8+ باید D8 را فعال کنید",
 "Done cleaning temporary files!": "پاک کردن فایل‌های موقت تمام شد!",
 "Exported in ": "خروجی گرفته شد در ",
 "Failed to copy backup file to temporary location: ": "کپی فایل پشتیبان به محل موقت ناموفق بود: ",
 "Failed to format XML file": "قالب‌بندی فایل XML ناموفق بود",
 "Failed to generate source.": "تولید سورس ناموفق بود.",
 "Failed to toast regular message, ": "نمایش پیام توست ناموفق بود، ",
 "File was created successfully": "فایل با موفقیت ساخته شد",
 "Folder was created successfully": "پوشه با موفقیت ساخته شد",
 "Gravity Toast": "توست گراویته‌دار",
 "Imported successfully": "با موفقیت وارد شد",
 "Imported!": "وارد شد!",
 "Invalid DEX file path of enabled Local library #": "مسیر فایل DEX کتابخانه محلی فعال نامعتبر است، شماره ",
 "Invalid DEX path of enabled Local library #": "مسیر DEX کتابخانه محلی فعال نامعتبر است، شماره ",
 "Invalid ID entry at Custom Component #": "شناسه کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid ID entry for Custom Component #": "شناسه کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid ID entry in Custom Component #": "شناسه کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid JAR path of enabled Local library #": "مسیر JAR کتابخانه محلی فعال نامعتبر است، شماره ",
 "Invalid ProGuard path of enabled Local library #": "مسیر ProGuard کتابخانه محلی فعال نامعتبر است، شماره ",
 "Invalid URL entry for Custom Component #": "آدرس اینترنتی کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid additional variable entry at Custom Component #": "ورودی متغیر اضافی کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid additional variable entry in Custom Component #": "ورودی متغیر اضافی کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid assets path of enabled Local library #": "مسیر assets کتابخانه محلی فعال نامعتبر است، شماره ",
 "Invalid build class entry for Custom Component #": "ورودی کلاس build کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid class entry for Custom Component #": "ورودی کلاس کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid description entry for Custom Component #": "ورودی توضیحات کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid icon entry for Custom Component #": "ورودی آیکون کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid imports entry in Custom Component #": "ورودی ایمپورت‌های کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid name entry at Custom Component #": "ورودی نام کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid name entry for Custom Component #": "ورودی نام کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid name of enabled Local library #": "نام کتابخانه محلی فعال نامعتبر است، شماره ",
 "Invalid package name of enabled Local library #": "نام پکیج کتابخانه محلی فعال نامعتبر است، شماره ",
 "Invalid res/ folder path of enabled Local library #": "مسیر پوشه res/ کتابخانه محلی فعال نامعتبر است، شماره ",
 "Invalid type name entry at Custom Component #": "ورودی نام نوع کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid type name entry for Custom Component #": "ورودی نام نوع کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid type name entry in Custom Component #": "ورودی نام نوع کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid variable name entry for Custom Component #": "ورودی نام متغیر کامپوننت سفارشی نامعتبر است، شماره ",
 "Invalid variable name entry in Custom Component #": "ورودی نام متغیر کامپوننت سفارشی نامعتبر است، شماره ",
 "Library downloaded successfully": "کتابخانه با موفقیت دانلود شد",
 "Logcat exported successfully: ": "خروجی Logcat با موفقیت گرفته شد: ",
 "Logs are available in /Internal storage/.sketchware/debug.txt": "لاگ‌ها در /Internal storage/.sketchware/debug.txt موجودند",
 "Main activity cannot be deleted": "اکتیویتی اصلی قابل حذف نیست",
 "NOTE: Removed Activity from manifest": "توجه: اکتیویتی از مانیفست حذف شد",
 "Name cannot be empty": "نام نمی‌تواند خالی باشد",
 "New Activity added": "اکتیویتی جدید اضافه شد",
 "No changes to save": "تغییری برای ذخیره نیست",
 "No compile logs found.": "لاگ کامپایلی یافت نشد.",
 "Note that this option may cause issues if RequestNetwork component is used": "توجه: اگر از کامپوننت RequestNetwork استفاده کنید، این گزینه ممکن است مشکل‌ساز شود",
 "Nothing changed": "چیزی تغییر نکرد",
 "Only Java and XML files can be formatted": "فقط فایل‌های Java و XML قابل قالب‌بندی هستند",
 "Only XML files can be edited": "فقط فایل‌های XML قابل ویرایش هستند",
 "Package installed successfully!": "پکیج با موفقیت نصب شد!",
 "Please enter a valid HEX color": "لطفاً یک رنگ HEX معتبر وارد کنید",
 "Please fill in all fields": "لطفاً همه فیلدها را پر کنید",
 "Please select an APK file to sign": "لطفاً فایل APK را برای امضا انتخاب کنید",
 "Please type the selector's name": "لطفاً نام انتخابگر را بنویسید",
 "Please type the selector's title": "لطفاً عنوان انتخابگر را بنویسید",
 "Renamed successfully": "با موفقیت تغییر نام یافت",
 "Reset to default complete.": "بازنشانی به پیش‌فرض انجام شد.",
 "Restored successfully": "با موفقیت بازیابی شد",
 "Restored successfully. Refresh to see the project": "با موفقیت بازیابی شد. برای دیدن پروژه، بازخوانی کنید",
 "Save completed": "ذخیره انجام شد",
 "Saved image to /Internal storage/sketchware/saved_block/": "تصویر در /Internal storage/sketchware/saved_block/ ذخیره شد",
 "Select a file type": "نوع فایل را انتخاب کنید",
 "Select gravity toast": "انتخاب موقعیت توست",
 "Service was not defined in AndroidManifest.": "سرویس در AndroidManifest تعریف نشده است.",
 "Show compile log": "نمایش لاگ کامپایل",
 "Some required fields are empty!": "برخی فیلدهای ضروری خالی‌اند!",
 "Successfully added ": "با موفقیت اضافه شد: ",
 "Successfully created backup to: ": "پشتیبان با موفقیت ساخته شد در: ",
 "Successfully exported blocks to:\\n": "بلوک‌ها با موفقیت خروجی گرفته شدند در:\\n",
 "Successfully exported event to:\\n": "رویداد با موفقیت خروجی گرفته شد در:\\n",
 "Successfully exported events to:\\n": "رویدادها با موفقیت خروجی گرفته شدند در:\\n",
 "Successfully imported events": "رویدادها با موفقیت وارد شدند",
 "Successfully removed Activity ": "اکتیویتی با موفقیت حذف شد: ",
 "Successfully removed Service ": "سرویس با موفقیت حذف شد: ",
 "Successfully saved signed APK to: /Internal storage/sketchware/signed_apk/": "APK امضاشده در /Internal storage/sketchware/signed_apk/ ذخیره شد",
 "You cannot change the name of this selector": "نام این انتخابگر قابل تغییر نیست",
 "Your device doesn't support the crop action!": "دستگاه شما از برش تصویر پشتیبانی نمی‌کند!",
 "CustomToast %s textColor %m.color textSize %d bgColor %m.color cornerRadius %d": "CustomToast %s رنگ متن %m.color اندازه متن %d رنگ پس‌زمینه %m.color گردی گوشه %d",
}

KEEP = {
 'Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();',
 'SketchwareUtil.CustomToast(getApplicationContext(), %s, %s, %s, %s, %s,',
 'com.google.android.material.snackbar.Snackbar.make(%s, %s,',
 'Toast', 'copyToClipboard', 'setTitle', 'customToast', 'gravity_t',
 'intentSetAction', 'intentSetData', 'SketchwareUtil',
 '/Internal storage/.sketchware/data/system/export/events',
}

def je(s):
    return s.replace('\\', '\\\\').replace('"', '\\"')

disp = re.compile(r'(showToast|ShowToast|toast|Toast|Helper\.showToast|Helper\.showError|Snackbar\.make|setSnack)\b')
lit = re.compile(r'"((?:[^"\\]|\\.){8,})"')
n = 0
for dp,_,fs in os.walk(ROOT):
    for fn in fs:
        if not fn.endswith('.java'): continue
        p = os.path.join(dp,fn)
        src = open(p,encoding='utf-8',errors='replace').read()
        orig = src
        out = []
        for line in src.splitlines(keepends=True):
            if disp.search(line):
                def rl(m):
                    global n
                    s = m.group(1)
                    if s in KEEP: return m.group(0)
                    if s in T:
                        n += 1
                        return '"' + je(T[s]) + '"'
                    return m.group(0)
                line = lit.sub(rl, line)
            out.append(line)
        src = ''.join(out)
        if src != orig:
            open(p,'w',encoding='utf-8').write(src)
print('round6 replacements:', n)
