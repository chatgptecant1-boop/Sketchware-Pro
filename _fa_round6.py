# -*- coding: utf-8 -*-
"""Round 2: translate remaining hardcoded strings. This handles Java string CONCATENATION
patterns by translating the literal prefix parts (e.g. "Are you sure you want to delete ").

IMPORTANT SAFETY: technical identifiers (class names like Fragment/DialogFragment/BottomSheetDialogFragment,
widget names TextView/WebView/MapView/ViewPager/Spinner, resource dirs strings/colors/styles,
attribute names, NONE, TRANSPARENT, android:attr=..., .xml) are deliberately kept English —
translating them would break code or is standard terminology."""

import re, os, json

ROOT_J = '/root/sw-fa/app/src/main/java'
ROOT_R = '/root/sw-fa/app/src/main/res'

T = {
 # ---- short buttons/common ----
 "Actions": "عملگرها",
 "Active": "فعال",
 "Inactive": "غیرفعال",
 "All": "همه",
 "Apply": "اعمال",
 "Attention": "توجه",
 "Blocks: ": "بلوک‌ها: ",
 "Boolean": "بولی",
 "Both": "هر دو",
 "Cancel": "لغو",
 "Code": "کد",
 "Color": "رنگ",
 "Component.": "کامپوننت.",
 "Confirmation": "تأیید",
 "Continue": "ادامه",
 "Contributor": "مشارکت‌کننده",
 "Copy": "کپی",
 "Create": "ایجاد",
 "Custom": "سفارشی",
 "Dark": "تاریک",
 "Light": "روشن",
 "Defaults": "پیش‌فرض‌ها",
 "Delete": "حذف",
 "Delete ": "حذف ",
 "Description": "توضیحات",
 "Dismiss": "بستن",
 "Distance": "فاصله",
 "Downloads: ": "دانلودها: ",
 "Edit": "ویرایش",
 "Edit ": "ویرایش ",
 "Empty": "خالی",
 "Enter a name for the new ": "نامی برای مورد جدید وارد کنید: ",
 "Error: '%m' must be followed by '.param' at position ": "خطا: '%m' باید با '.param' در موقعیت ",
 "Export path: ": "مسیر خروجی: ",
 "Failed to parse ": "تجزیه ناموفق: ",
 "Frontend": "فرانت‌اند",
 "Backend": "بک‌اند",
 "General": "همگانی",
 "Hidden": "مخفی",
 "Icon": "آیکون",
 "Import": "وارد کردن",
 "Landscape": "افقی",
 "Portrait": "عمودی",
 "Unspecified": "نامشخص",
 "Managers": "مدیریت‌ها",
 "Map": "Map",
 "Move": "انتقال",
 "Name": "نام",
 "Number": "عدد",
 "Okay": "باشه",
 "Overwrite": "بازنویسی",
 "Parameter": "پارامتر",
 "Parameters": "پارامترها",
 "Preview": "پیش‌نمایش",
 "Reference": "مرجع",
 "Reference: ": "مرجع: ",
 "Released on: ": "منتشرشده در: ",
 "Released: ": "منتشر شده: ",
 "Rename": "تغییر نام",
 "Rename ": "تغییر نام ",
 "Rename occurrences of \\\"": "تغییر نام همه موارد \"",
 "Reset": "بازنشانی",
 "Restore": "بازیابی",
 "Restoring...": "در حال بازیابی…",
 "Reverse": "معکوس",
 "Save": "ذخیره",
 "Search": "جستجو",
 "Search...": "جستجو…",
 "Select backups to restore (": "انتخاب پشتیبان‌ها برای بازیابی (",
 "Size: ": "اندازه: ",
 "Skip": "رد کردن",
 "Slider": "اسلایدر",
 "Spec": "مشخصات",
 "Spec2": "مشخصات ۲",
 "String": "رشته",
 "Tab 1": "تب ۱",
 "Tab 2": "تب ۲",
 "Tab 3": "تب ۳",
 "Text": "متن",
 "Title": "عنوان",
 "Type": "نوع",
 "Understood": "متوجه شدم",
 "Value": "مقدار",
 "Visible": "نمایان",
 "Void": "Void",
 "Warning": "هشدار",
 "Yes": "بله",
 "left": "چپ",
 "right": "راست",
 "top": "بالا",
 "bottom": "پایین",
 "left: ": "چپ: ",
 "An APK named ": "یک APK با نام ",
 "An error occurred while running Sketchware Pro. ": "خطایی هنگام اجرای Sketchware Pro رخ داد. ",
 "Are you sure you want to delete ": "مطمئنید که می‌خواهید حذف کنید: ",
 "Are you sure you want to delete this ": "مطمئنید که می‌خواهید این ",
 "Are you sure you want to empty the recycle bin? ": "مطمئنید که می‌خواهید سطل بازیافت خالی شود؟ ",
 "Are you sure you want to reset appcompat attributes for ": "مطمئنید که می‌خواهید ویژگی‌های appcompat این مورد بازنشانی شود: ",
 "A directory important for building is missing. ": "پوشه‌ای مهم برای ساخت وجود ندارد. ",
 "A file needed for building is missing. ": "فایلی ضروری برای ساخت وجود ندارد. ",
 "Couldn't get ": "دریافت ناموفق بود: ",
 "Somehow couldn't get package info. Stack trace:\\n": "اطلاعات پکیج دریافت نشد. جزئیات خطا:\\n",
 "Starting with Android 11, Sketchware Pro needs a new permission to avoid ": "از اندروید ۱۱ به بعد، Sketchware Pro برای جلوگیری از ",
 "We've messed something up, sorry for the inconvenience!\\n": "مشکلی پیش آمد، عذرخواهی ما!\\n",
 "You can find the generated, signed AAB file at:\\n": "فایل AAB امضاشده اینجاست:\\n",
 "The generated .aab file must be signed.\\nCopy your keystore to /Internal storage/sketchware/keystore/release_key.jks and enter the alias' password.": "فایل .aab تولیدشده باید امضا شود.\\nکی‌استور خود را در /Internal storage/sketchware/keystore/release_key.jks کپی کنید و رمز alias را وارد کنید.",
 "This defines how SWB backup files get named.\\n": "این گزینه تعیین می‌کند فایل‌های پشتیبان SWB چگونه نام‌گذاری شوند.\\n",
 "Would you like to enable the new XML Command? It will speed up XML generation and compilation, but this change cannot be undone. Don’t worry, your previous changes with the XML Command Block will transfered here so it will remain unaffected.": "فعال‌سازی دستور جدید XML؟ سرعت تولید و کامپایل XML را بالا می‌برد، اما این تغییر قابل بازگشت نیست. نگران نباشید، تغییرات قبلی شما با بلوک XML Command به اینجا منتقل می‌شوند و دست‌نخورده می‌مانند.",
 "This library \\\"": "این کتابخانه \"",
 "Toolbar": "نوار ابزار",
 # NOTE: kept English on purpose: Fragment, DialogFragment, BottomSheetDialogFragment, TextView, WebView, MapView,
 # ViewPager, Spinner, MapView, GitHub, Discord, Telegram, Dexer, NONE, TRANSPARENT, android, res/values dirs,
 # arrays/colors/strings/styles/themes/attr/item/name/value/permission/main/fab/regular
}

KEEP_EN = {
 'Fragment','DialogFragment','BottomSheetDialogFragment','TextView','WebView','MapView','ViewPager','Spinner',
 'GitHub','Discord','Telegram','Dexer','NONE','TRANSPARENT','android','Toolbar','.xml','#FFFFFF','attr','item',
 'name','value','permission','main','fab','regular','arrays','colors','strings','styles','themes','values','res','bottom','top','left','right'
}

def java_escape(s):
    return s.replace('\\', '\\\\').replace('"', '\\"')

def xml_escape(s):
    return s.replace('&', '&amp;').replace('<', '&lt;').replace('>', '&gt;').replace('"', '&quot;')

stats = {'java': 0, 'xml': 0}

# ---------- Java ----------
pat = re.compile(r'((?:setTitle|setMessage|setText|setHint|setPositiveButton|setNegativeButton|setNeutralButton|setSubtitle|setContentDescription)\()\s*"((?:[^"\\]|\\.)*)"')
for dirpath, _, files in os.walk(ROOT_J):
    for fn in files:
        if not fn.endswith('.java'): continue
        p = os.path.join(dirpath, fn)
        src = open(p, encoding='utf-8', errors='replace').read()
        orig = src
        def rp(m):
            call, val = m.group(1), m.group(2)
            key = val.replace('\\"', '"').replace('\\n', '\n')
            if key in T:
                stats['java'] += 1
                return f'{call}"{java_escape(T[key])}"'
            return m.group(0)
        src = pat.sub(rp, src)
        if src != orig:
            open(p, 'w', encoding='utf-8').write(src)

# ---------- XML ----------
xpat = re.compile(r'((?:android|app):(?:title|summary|description|dialogTitle|dialogMessage|text|hint|contentDescription|positiveButtonText|negativeButtonText|titleCondensed))="([^"@][^"]*)"')
for dirpath, _, files in os.walk(ROOT_R):
    for fn in files:
        if not fn.endswith('.xml'): continue
        p = os.path.join(dirpath, fn)
        src = open(p, encoding='utf-8', errors='replace').read()
        orig = src
        def rp(m):
            a, v = m.group(1), m.group(2)
            if v.startswith('@'): return m.group(0)
            if v in T:
                stats['xml'] += 1
                return f'{a}="{xml_escape(T[v])}"'
            return m.group(0)
        src = xpat.sub(rp, src)
        if src != orig:
            open(p, 'w', encoding='utf-8').write(src)

print('round2 java:', stats['java'], '| xml:', stats['xml'])
