# -*- coding: utf-8 -*-
"""Round 4 XML pass: translate remaining English android:text etc. in layouts.
Demo/placeholder texts inside <TextView android:text> of PREVIEW/DEMO layouts that mirror
real content (about screens, changelog) get translated; technical IDs (linear1, button1,
initializeLogic, class names, packages, versions) stay as-is."""

import re, os

ROOT = '/root/sw-fa/app/src/main/res'

T = {
 "A contributor": "یک مشارکت‌کننده",
 "A version that's newer than v6.3.0. That's it.": "نسخه‌ای جدیدتر از 6.3.0. همین!",
 "App Settings": "تنظیمات برنامه",
 "Back up": "پشتیبان‌گیری",
 "Black": "مشکی",
 "Block ID": "شناسه بلوک",
 "Boolean": "بولی",
 "Building your awesome app...": "در حال ساخت برنامه‌ی عالی شما…",
 "Can we use Ketchup on Pizza?": "می‌شود روی پیتزا سس گوجه گذاشت؟",
 "Cancel": "لغو",
 "Collection": "مجموعه",
 "Component Manager": "مدیریت کامپوننت‌ها",
 "Core Team": "تیم اصلی",
 "Custom view": "ویجت سفارشی",
 "Date header": "سربرگ تاریخ",
 "Default": "پیش‌فرض",
 "Delete": "حذف",
 "Description": "توضیحات",
 "Detail": "جزئیات",
 "Duplicate": "تکثیر",
 "Errors will show up here": "خطاها اینجا نمایش داده می‌شوند",
 "Event Properties": "ویژگی‌های رویداد",
 "External libraries": "کتابخانه‌های خارجی",
 "File is used to save data locally": "فایل برای ذخیره داده به‌صورت محلی استفاده می‌شود",
 "File name": "نام فایل",
 "Firebase DB": "پایگاه‌داده Firebase",
 "Go To Firebase Console": "رفتن به کنسول Firebase",
 "Header": "سربرگ",
 "Hello, this project is so cool!": "سلام، این پروژه خیلی باحاله!",
 "Logger got killed": "لاگر متوقف شد",
 "Main contributors": "مشارکت‌کنندگان اصلی",
 "Map": "Map",
 "Material Purple": "بنفش Material",
 "Meet Sketchware Pro v7.0.0!\\nFinally, the long-awaited version has been released!": "با Sketchware Pro نسخه 7.0.0 آشنا شوید!\\nبالاخره نسخه‌ای که منتظرش بودید منتشر شد!",
 "Modders Team": "تیم مادها",
 "New update": "به‌روزرسانی جدید",
 "New version is out!": "نسخه جدید منتشر شد!",
 "No events to display": "رویدادی برای نمایش نیست",
 "Official / Beta": "رسمی / بتا",
 "Okay": "باشه",
 "On activity create": "هنگام ساخت اکتیویتی",
 "Operator 2": "عملگر ۲",
 "Program Info Item": "مورد اطلاعات برنامه",
 "Project name": "نام پروژه",
 "Property": "ویژگی",
 "Released on: ----- (= never ¯\\\\_(ツ)_/¯)": "منتشرشده در: ----- (= هرگز ¯\\\\_(ツ)_/¯)",
 "Remaker": "Remaker",
 "Shared Preferences": "SharedPreferences",
 "Signing APK": "در حال امضای APK",
 "Sketchware Pro - a new place to create android apps!": "Sketchware Pro — مکان جدیدی برای ساخت اپ‌های اندروید!",
 "Sketchware Pro's sources in Java. Now anyone can contribute to Sketchware Pro.": "سورس‌های Sketchware Pro به زبان Java. حالا هر کسی می‌تواند در توسعه آن مشارکت کند.",
 "Something something something": "متن نمونه",
 "Sound Name": "نام صدا",
 "String key": "کلید رشته",
 "String value": "مقدار رشته",
 "Surface Colors :": "رنگ‌های سطح :",
 "Test 123": "تست ۱۲۳",
 "Test 123 Title": "عنوان تست ۱۲۳",
 "Their commit description": "توضیحات کامیت مشارکت‌کننده",
 "Their description": "توضیحات",
 "Today Changes": "تغییرات امروز",
 "ToolBar": "نوار ابزار",
 "Uploaded: 26.09.2024": "آپلودشده: 1403/07/05",
 "View": "نما",
 "Warning!": "هشدار!",
 "Yes": "بله",
 "You haven't used any custom blocks in this project.": "در این پروژه از بلوک سفارشی استفاده نکرده‌اید.",
 "Your phone doesn't support gyroscope.": "گوشی شما ژیروسکوپ ندارد.",
 "Blocks: 22": "بلوک‌ها: ۲۲",
 "Blocks: 23": "بلوک‌ها: ۲۳",
 "Events: 1": "رویدادها: ۱",
 "toast!": "توست!",
 "gaming Block": "بلوک gaming",
 "BLUE": "آبی",
 "Button": "دکمه",
 "Size: 112 MB": "حجم: ۱۱۲ مگابایت",
}

KEEP = {'Fragment','DialogFragment','BottomSheetDialogFragment','TextView','MapView','Void','Dexer','GitHub','Discord','Telegram',
        'Roboto','main.xml','MainActivity.java','linear1','button1','initializeLogic','onChildAdded','onClick','amogus','some_sound',
        'status','InternalDemo','Sketchware Pro Demo','com.jbk.internal.demo','InternalDemo (1.4)','Sketchware 2022 is real',
        'android.permission.WRITE_EXTERNAL_STORAGE','appcompat-v1.7.0','material-1.14.0-alpha01','com.google.android.material:material:1.14.0-alpha01',
        'firebase-common-19.3.1, firebase-database-19.3.1','v7.0.0-SNAPSHOT-xxxxxx','ThemeOverlay.MaterialComponents.MaterialAlertDialog',
        'colorOnSurface','height','value','match_parent','wrap_content','center','center_horizontal','center_vertical','DayNight',
        'SharedPreferences','Sketchware Pro','App ID : ca-app-pub-3940256099942544/1033173712'}

def xe(s):
    return s.replace('&','&amp;').replace('<','&lt;').replace('>','&gt;').replace('"','&quot;')

n = 0
xpat = re.compile(r'((?:android|app|tools):(?:title|summary|description|dialogTitle|dialogMessage|text|hint|contentDescription|positiveButtonText|negativeButtonText|titleCondensed))="([^"@][^"]*)"')
for dirpath, _, files in os.walk(ROOT):
    for fn in files:
        if not fn.endswith('.xml'): continue
        p = os.path.join(dirpath, fn)
        src = open(p, encoding='utf-8', errors='replace').read(); orig = src
        def rp(m):
            global n
            a, v = m.group(1), m.group(2)
            if v.startswith('@') or v in KEEP: return m.group(0)
            if v in T:
                n += 1
                return f'{a}="{xe(T[v])}"'
            return m.group(0)
        src = xpat.sub(rp, src)
        if src != orig: open(p,'w',encoding='utf-8').write(src)
print('round4 xml replacements:', n)
