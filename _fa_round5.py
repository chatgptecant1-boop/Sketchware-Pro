# -*- coding: utf-8 -*-
"""Translate hardcoded English UI strings in Java files + res XMLs to Persian.
Handles escaped java strings properly. Preserves placeholders, technical tokens."""

import re, os, json, html

ROOT_J = '/root/sw-fa/app/src/main/java'
ROOT_R = '/root/sw-fa/app/src/main/res'

# ===================== TRANSLATION MAP (EN -> FA) =====================
T = {
 "(Invalid block name entry)": "(نام بلوک نامعتبر است)",
 "(Invalid block spec entry)": "(مشخصات بلوک نامعتبر است)",
 "(Invalid code block data)": "(داده بلوک کد نامعتبر است)",
 "Activity event": "رویداد اکتیویتی",
 "Activity name": "نام اکتیویتی",
 "Add a new block": "افزودن بلوک جدید",
 "Add a new custom List": "افزودن لیست سفارشی جدید",
 "Add a new custom variable": "افزودن متغیر سفارشی جدید",
 "Add new attribute": "افزودن ویژگی جدید",
 "Add new component": "افزودن کامپوننت جدید",
 "Advanced Version Control": "کنترل نسخه پیشرفته",
 "All variable blocks will be visible, even if you don't have variables for them.": "همه بلوک‌های متغیر نمایش داده می‌شوند، حتی اگر متغیری نداشته باشید.",
 "An error occurred. Check the log for more details.": "خطایی رخ داد. جزئیات بیشتر را در لاگ ببینید.",
 "Android 11 storage access": "دسترسی حافظه اندروید ۱۱",
 "AndroidManifest Manager": "مدیریت AndroidManifest",
 "App Settings": "تنظیمات برنامه",
 "AppCompat Manager": "مدیریت AppCompat",
 "AppCompat is disabled!": "AppCompat غیرفعال است!",
 "AppCompat is disabled.": "AppCompat غیرفعال است.",
 "Please enable AppCompat in the Library Manager to use it.": "برای استفاده، لطفاً AppCompat را در مدیریت کتابخانه فعال کنید.",
 "Are you sure you want to delete this block?": "مطمئنید که می‌خواهید این بلوک را حذف کنید؟",
 "Are you sure you want to delete this file permanently? This cannot be undone.": "مطمئنید که می‌خواهید این فایل را برای همیشه حذف کنید؟ این کار قابل بازگشت نیست.",
 "Are you sure you want to delete this item?": "مطمئنید که می‌خواهید این مورد را حذف کنید؟",
 "Are you sure you want to reset all permissions? This cannot be undone!": "مطمئنید که می‌خواهید همه دسترسی‌ها را بازنشانی کنید؟ این کار قابل بازگشت نیست!",
 "Array header value ( optional )": "مقدار سربرگ آرایه (اختیاری)",
 "Array name": "نام آرایه",
 "Array type": "نوع آرایه",
 "Automatically installs project APKs after building using root access.": "پس از ساخت، APK پروژه به‌طور خودکار با دسترسی روت نصب می‌شود.",
 "Back up": "پشتیبان‌گیری",
 "Backup Options": "گزینه‌های پشتیبان‌گیری",
 "Backup directory": "پوشه پشتیبان‌گیری",
 "Backup filename format": "قالب نام فایل پشتیبان",
 "Badge text": "متن نشان",
 "Block Manager": "مدیریت بلوک‌ها",
 "Block configuration": "پیکربندی بلوک",
 "Block type": "نوع بلوک",
 "Built-in blocks": "بلوک‌های داخلی",
 "Choose an attributes": "یک ویژگی انتخاب کنید",
 "Choose an id": "یک شناسه انتخاب کنید",
 "Classpath 'separated by :'": "مسیر کلاس (با : جدا می‌شود)",
 "Click on Confirm to delete the selected Event.": "برای حذف رویداد انتخاب‌شده، روی تأیید بزنید.",
 "Code (### => variable name)": "کد (### یعنی نام متغیر)",
 "Code Editor": "ویرایشگر کد",
 "Code Shrinking Manager": "مدیریت کوچک‌سازی کد",
 "Color hex code": "کد هگز رنگ",
 "Color name": "نام رنگ",
 "Color value": "مقدار رنگ",
 "Compile log": "لاگ کامپایل",
 "Configure parent attributes": "پیکربندی ویژگی‌های والد",
 "Confirm Delete": "تأیید حذف",
 "Core Team": "تیم اصلی",
 "Couldn't load font": "بارگذاری فونت ممکن نشد",
 "Create a new folder": "ساخت پوشه جدید",
 "Create a new palette": "ساخت پالت جدید",
 "Create new": "ایجاد جدید",
 "Create new array": "آرایه جدید",
 "Create new color": "رنگ جدید",
 "Create new palette": "پالت جدید",
 "Create new string": "رشته جدید",
 "Create new style": "استایل جدید",
 "Create new theme": "تم جدید",
 "Create or import": "ایجاد یا وارد کردن",
 "Create view": "ساخت ویجت",
 "Creating backup...": "در حال تهیه پشتیبان…",
 "Current Version": "نسخه فعلی",
 "Custom Activities": "اکتیویتی‌های سفارشی",
 "Custom Import": "وارد کردن سفارشی",
 "Custom android.jar": "android.jar سفارشی",
 "Custom import": "وارد کردن سفارشی",
 'Default is &quot;$projectName v$versionName ($pkgName, $versionCode) $time(yyyy-MM-dd\'T\'HHmmss)&quot;': "پیش‌فرض: &quot;$projectName v$versionName ($pkgName, $versionCode) $time(yyyy-MM-dd'T'HHmmss)&quot;",
 "Delete block?": "بلوک حذف شود؟",
 "Delete file?": "فایل حذف شود؟",
 "Delete listener": "حذف شنونده",
 "Delete permanently": "حذف همیشگی",
 "Delete this attribute?": "این ویژگی حذف شود؟",
 "Delete this event?": "این رویداد حذف شود؟",
 "Directory inside /Internal storage/, e.g. .sketchware/backups": "پوشه‌ای داخل /Internal storage/، مثلاً .sketchware/backups",
 "Don't copy": "کپی نکن",
 "Don't show anymore": "دیگر نشان نده",
 "Drag here to delete": "برای حذف اینجا رها کنید",
 "Drag here to see the Actions": "برای دیدن عملگرها اینجا رها کنید",
 "Edit Value": "ویرایش مقدار",
 "Edit array": "ویرایش آرایه",
 "Edit block": "ویرایش بلوک",
 "Edit color": "ویرایش رنگ",
 "Edit string": "ویرایش رشته",
 "Edit style": "ویرایش استایل",
 "Edit theme": "ویرایش تم",
 "Enable block text input highlighting": "فعال‌سازی هایلایت ورودی متنی بلوک",
 "Enables custom version code and name for projects.": "امکان تعیین کد و نام نسخه سفارشی برای پروژه‌ها.",
 "Enables syntax highlighting while editing blocks' text parameters.": "هنگام ویرایش پارامترهای متنی بلوک‌ها، هایلایت نحوی فعال می‌شود.",
 "Enter Attribute Name": "نام ویژگی را وارد کنید",
 "Enter Attribute Value": "مقدار ویژگی را وارد کنید",
 "Enter Item Name": "نام مورد را وارد کنید",
 "Enter Item Value": "مقدار مورد را وارد کنید",
 "Enter a dependency": "وابستگی را وارد کنید",
 "Enter icon name": "نام آیکون را وارد کنید",
 "Enter imports line by line": "ایمپورت‌ها را خط به خط وارد کنید",
 "Enter name": "نام را وارد کنید",
 "Enter new attribute": "ویژگی جدید را وارد کنید",
 "Enter sound name": "نام صدا را وارد کنید",
 "Enter the name of the new folder": "نام پوشه جدید را وارد کنید",
 "Enter the new name": "نام جدید را وارد کنید",
 "Enter value": "مقدار را وارد کنید",
 "Entre your custom attr": "ویژگی سفارشی خود را وارد کنید",
 "Event Details": "جزئیات رویداد",
 "Event Name": "نام رویداد",
 "Event Properties": "ویژگی‌های رویداد",
 "Event code (### ==> Variable name)": "کد رویداد (### یعنی نام متغیر)",
 "Every single available block will be shown. Will slow down opening palettes!": "همه بلوک‌های موجود نشان داده می‌شوند. باز شدن پالت‌ها کند می‌شود!",
 "Exclude built-in libraries": "مستثنا کردن کتابخانه‌های داخلی",
 "File exists": "فایل موجود است",
 "File extension will be added automatically based on the file type you select": "پسوند فایل به‌طور خودکار بر اساس نوع انتخابی اضافه می‌شود",
 "Filter by package name": "فیلتر بر اساس نام پکیج",
 "Filter icons": "فیلتر آیکون‌ها",
 "Finished exporting AAB": "خروجی AAB تمام شد",
 "Folder name": "نام پوشه",
 "For multiple package names, separate them with a comma (,).": "برای چند نام پکیج، آن‌ها را با کاما (,) جدا کنید.",
 "GoogleMap Settings": "تنظیمات GoogleMap",
 "If you're creating a file, make sure to add an extension.": "اگر فایل می‌سازید، حتماً پسوند آن را وارد کنید.",
 "Import Custom blocks to": "وارد کردن بلوک‌های سفارشی به",
 "Import Native Libraries": "وارد کردن کتابخانه‌های Native",
 "Import blocks": "وارد کردن بلوک‌ها",
 "Import library": "وارد کردن کتابخانه",
 "Important note": "نکته مهم",
 "Include used Custom Blocks": "بلوک‌های سفارشی استفاده‌شده لحاظ شود",
 "Include used Local libraries": "کتابخانه‌های محلی استفاده‌شده لحاظ شود",
 "Initializer, e.g. new File() (optional)": "مقداردهی اولیه، مثلاً new File() (اختیاری)",
 "Input code": "ورودی کد",
 "Insert block": "درج بلوک",
 "Install projects with root access": "نصب پروژه‌ها با دسترسی روت",
 "Java/Kotlin Manager": "مدیریت Java/Kotlin",
 "Last Compile Log": "آخرین لاگ کامپایل",
 "Last compile log": "آخرین لاگ کامپایل",
 "Launch projects after installing": "باز شدن پروژه بعد از نصب",
 "Layout Preview": "پیش‌نمایش لی‌اوت",
 "Library Manager": "مدیریت کتابخانه",
 "List Map": "لیست Map",
 "List String": "لیست String",
 "Listener Code (### ==> variable name)": "کد شنونده (### یعنی نام متغیر)",
 "Logcat Reader": "خواندن Logcat",
 "Looking for dependency...": "در حال جستجوی وابستگی…",
 "Major changes in v7.0.0": "تغییرات اصلی نسخه 7.0.0",
 "Manage Block": "مدیریت بلوک",
 "Manage Custom Attribute": "مدیریت ویژگی سفارشی",
 "May slow down loading blocks in Logic Editor.": "ممکن است بارگذاری بلوک‌ها در ویرایشگر منطق را کند کند.",
 "Missing directory detected": "پوشه‌ای یافت نشد",
 "Missing file detected": "فایلی یافت نشد",
 "Modern Material design with adaptive dynamic theming": "طراحی مدرن Material با تم دینامیک تطبیقی",
 "Move to": "انتقال به",
 "Name, e.g. dataList": "نام، مثلاً dataList",
 "Name, e.g. file": "نام، مثلاً file",
 "Native Library Manager": "مدیریت کتابخانه Native",
 "New Activity Event": "رویداد جدید اکتیویتی",
 "New Event": "رویداد جدید",
 "New Selector Item": "مورد جدید انتخابگر",
 "New Update": "به‌روزرسانی جدید",
 "New folder": "پوشه جدید",
 "No Parent": "بدون والد",
 "No palettes": "پالتی وجود ندارد",
 "Old Version": "نسخه قبلی",
 "Open code editor": "باز کردن ویرایشگر کد",
 "Opens projects automatically after auto-installation using root.": "پس از نصب خودکار با روت، پروژه‌ها خودکار باز می‌شوند.",
 "Palette name": "نام پالت",
 "Permissions Manager": "مدیریت دسترسی‌ها",
 "Please enable AppCompat first to use this feature": "برای استفاده از این قابلیت، ابتدا AppCompat را فعال کنید",
 "Please wait": "لطفاً صبر کنید",
 "Project Settings": "تنظیمات پروژه",
 "Recycle Bin": "سطل بازیافت",
 "Recycle bin": "سطل بازیافت",
 "Remove all blocks related to this palette?": "همه بلوک‌های مرتبط با این پالت حذف شوند؟",
 "Remove permanently": "حذف همیشگی",
 "Reset excluded built-in libraries? This action cannot be undone.": "مستثنا شده‌های کتابخانه داخلی بازنشانی شوند؟ این کار قابل بازگشت نیست.",
 "Reset permissions": "بازنشانی دسترسی‌ها",
 "Resource Manager": "مدیریت منابع",
 "Restore to": "بازیابی به",
 "Save changes": "ذخیره تغییرات",
 "Search for libraries": "جستجوی کتابخانه‌ها",
 "Search for permissions": "جستجوی دسترسی‌ها",
 "Search log": "جستجو در لاگ",
 "Select .json selector file": "فایل انتخابگر .json را انتخاب کنید",
 "Select .json widgets files": "فایل‌های ویجت .json را انتخاب کنید",
 "Select Array Type": "نوع آرایه را انتخاب کنید",
 "Select Java/Kotlin file(s)": "فایل(های) Java/Kotlin را انتخاب کنید",
 "Select Language": "انتخاب زبان",
 "Select Local libraries": "انتخاب کتابخانه‌های محلی",
 "Select Theme": "انتخاب تم",
 "Select a .txt file": "یک فایل .txt انتخاب کنید",
 "Select a JSON file": "یک فایل JSON انتخاب کنید",
 "Select a Native library": "یک کتابخانه Native انتخاب کنید",
 "Select a more block": "یک بلوک More انتخاب کنید",
 "Select an Asset": "یک Asset انتخاب کنید",
 "Select an XML": "یک XML انتخاب کنید",
 "Select an action": "یک عمل انتخاب کنید",
 "Select an asset file": "یک فایل Asset انتخاب کنید",
 "Select an entry to modify": "یک مورد را برای ویرایش انتخاب کنید",
 "Select an icon": "یک آیکون انتخاب کنید",
 "Select built-in libraries": "انتخاب کتابخانه‌های داخلی",
 "Select category": "انتخاب دسته",
 "Select command": "انتخاب دستور",
 "Select font size": "اندازه فونت را انتخاب کنید",
 "Select json file": "فایل json را انتخاب کنید",
 "Select resource files": "فایل‌های منبع را انتخاب کنید",
 "Select widget type": "نوع ویجت را انتخاب کنید",
 "Select your google-services.json": "فایل google-services.json خود را انتخاب کنید",
 "Selector name": "نام انتخابگر",
 "Selector title (ex: Select View:)": "عنوان انتخابگر (مثلاً: انتخاب ویجت:)",
 "Show all blocks of palettes": "نمایش همه بلوک‌های پالت‌ها",
 "Show all variable blocks": "نمایش همه بلوک‌های متغیر",
 "Show error": "نمایش خطا",
 "Sign APK with testkey": "امضای APK با testkey",
 "Signing APK...": "در حال امضای APK…",
 "Sort options": "گزینه‌های مرتب‌سازی",
 "Sound Manager": "مدیریت صداها",
 "Spec  (### => Variable name)": "مشخصات (### یعنی نام متغیر)",
 "String header value ( optional )": "مقدار سربرگ رشته (اختیاری)",
 "String key": "کلید رشته",
 "String value": "مقدار رشته",
 "StringFog is disabled": "StringFog غیرفعال است",
 "StringFog is enabled": "StringFog فعال است",
 "Style Parent": "والد استایل",
 "Style header value ( optional )": "مقدار سربرگ استایل (اختیاری)",
 "Style name": "نام استایل",
 "The default directory is /Internal storage/.sketchware/backups/.": "پوشه پیش‌فرض: /Internal storage/.sketchware/backups/.",
 "The generated .aab file must be signed.\\nCopy your keystore to /Internal storage/sketchware/keystore/release_key.jks and enter the alias' password.": "فایل .aab تولیدشده باید امضا شود.\\nکی‌استور خود را در /Internal storage/sketchware/keystore/release_key.jks کپی کنید و رمز alias را وارد کنید.",
 "Theme Settings": "تنظیمات تم",
 "This Block Menu was initially used to parse resource values, but was too I/O heavy and has been removed due to that. Please use the Code Editor instead.": "این منوی بلوک در ابتدا برای تحلیل مقادیر منابع بود، اما به‌دلیل فشار زیاد ورودی/خروجی حذف شد. لطفاً به‌جای آن از ویرایشگر کد استفاده کنید.",
 "This action cannot be undone.": "این کار قابل بازگشت نیست.",
 "Type name": "نام نوع",
 "Type, e.g. ArrayList&lt;Data&gt;": "نوع، مثلاً ArrayList&lt;Data&gt;",
 "Type, e.g. ArrayList<Data>": "نوع، مثلاً ArrayList<Data>",
 "Type, e.g. File": "نوع، مثلاً File",
 "Use new Version Control": "استفاده از کنترل نسخه جدید",
 "Version code": "کد نسخه",
 "Version name": "نام نسخه",
 "Version name extra": "نسخه نام اضافه",
 "View changes": "مشاهده تغییرات",
 "Widget class name": "نام کلاس ویجت",
 "Widget title": "عنوان ویجت",
 "Widget/Component name": "نام ویجت/کامپوننت",
 "XML Command Manager": "مدیریت دستورات XML",
 "XML Editor": "ویرایشگر XML",
 "XML attributes": "ویژگی‌های XML",
 "XML name(with .xml)": "نام XML (با .xml)",
 "You haven't used any custom blocks in this project": "در این پروژه از بلوک سفارشی استفاده نکرده‌اید",
 "private, public or public static (optional)": "private یا public یا public static (اختیاری)",
 "Show last compile error": "نمایش آخرین خطای کامپایل",
 "Build Settings": "تنظیمات ساخت",
 "Clean temporary files": "پاک کردن فایل‌های موقت",
 "Show source code": "نمایش کد منبع",
 "Direct XML editor": "ویرایش مستقیم XML",
 "AppCompat and Design": "AppCompat و Design",
 "Drawer Layout + Floating Action Button": "Drawer Layout + Floating Action Button",
 "Use custom Library versions": "استفاده از نسخه‌های سفارشی کتابخانه",
 "Add custom Permissions to the app": "افزودن دسترسی‌های سفارشی به برنامه",
 "Change the default Launcher Activity": "تغییر اکتیویتی پیش‌فرض راه‌انداز",
 "Add attributes for all Activities": "افزودن ویژگی برای همه اکتیویتی‌ها",
 "Add extra components": "افزودن کامپوننت‌های اضافی",
 "Default properties for the app": "ویژگی‌های پیش‌فرض برنامه",
 "Add a Native library (.so)": "افزودن کتابخانه Native (.so)",
 "Add local libraries": "افزودن کتابخانه‌های محلی",
 "Local Library": "کتابخانه محلی",
 "Add library": "افزودن کتابخانه",
 "components": "کامپوننت‌ها",
 "Events": "رویدادها",
 "View": "نما",
 "Component": "کامپوننت",
 "Run": "اجرا",
 "Create a widget": "ساخت ویجت",
}

# Java-escape a Persian string for inserting into a Java string literal
def java_escape(s):
    return s.replace('\\', '\\\\').replace('"', '\\"')

# XML-escape
def xml_escape(s):
    return s.replace('&', '&amp;').replace('<', '&lt;').replace('>', '&gt;').replace('"', '&quot;')

changed = {'java': 0, 'xml': 0}
report = []

# ---------- Pass 1: XML files ----------
for dirpath, _, files in os.walk(ROOT_R):
    for fn in files:
        if not fn.endswith('.xml'): continue
        p = os.path.join(dirpath, fn)
        src = open(p, encoding='utf-8', errors='replace').read()
        orig = src
        def repl_xml(m):
            ns, attr, val = m.group(1), m.group(2), m.group(3)
            if val.startswith('@'): return m.group(0)
            key = html.unescape(val)
            if key in T:
                changed['xml'] += 1
                report.append(('xml', fn, val[:50], T[key][:50]))
                return f'{ns}:{attr}="{xml_escape(T[key])}"'
            return m.group(0)
        src = re.sub(r'(?<![\w-])((?:android|app):(?:title|summary|description|dialogTitle|dialogMessage|text|hint|contentDescription|positiveButtonText|negativeButtonText|titleCondensed))="([^"@][^"]*)"', lambda m: repl_xml_wrapper(m), src) if False else src
        # simpler: two-group regex
        src = re.sub(r'((?:android|app):(?:title|summary|description|dialogTitle|dialogMessage|text|hint|contentDescription|positiveButtonText|negativeButtonText|titleCondensed))="([^"@][^"]*)"',
                     lambda m: (lambda a, v: f'{a}="{xml_escape(T[html.unescape(v)])}"' if (not v.startswith('@') and html.unescape(v) in T) else m.group(0))(m.group(1), m.group(2)),
                     src)
        if src != orig:
            open(p, 'w', encoding='utf-8').write(src)

def repl_xml_wrapper(m):  # placeholder, unused
    return m.group(0)

# ---------- Pass 2: Java files — handle setTitle("..."), setText("..."), etc.
pat = re.compile(r'((?:setTitle|setMessage|setText|setHint|setPositiveButton|setNegativeButton|setNeutralButton|setSubtitle|setTitleCondensed|setContentDescription)\()\s*"((?:[^"\\]|\\.)*)"')

for dirpath, _, files in os.walk(ROOT_J):
    for fn in files:
        if not fn.endswith('.java'): continue
        p = os.path.join(dirpath, fn)
        src = open(p, encoding='utf-8', errors='replace').read()
        orig = src
        def repl_java(m):
            call, val = m.group(1), m.group(2)
            # unescape java literal
            key = val.replace('\\"', '"').replace('\\\\', '\\').replace('\\n', '\n')
            if key in T:
                changed['java'] += 1
                rep = java_escape(T[key])
                report.append(('java', fn, key[:40], T[key][:40]))
                return f'{call}"{rep}"'
            return m.group(0)
        src = pat.sub(repl_java, src)
        if src != orig:
            open(p, 'w', encoding='utf-8').write(src)

print('XML replacements:', changed['xml'])
print('Java replacements:', changed['java'])
json.dump(report, open('/root/_fa_round5_report.json','w'), indent=1, ensure_ascii=False)
