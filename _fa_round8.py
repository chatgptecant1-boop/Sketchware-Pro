# -*- coding: utf-8 -*-
"""Round 5: values-fa remaining English entries.
TRANSLATE: block labels (block_*_head/tail/body with method-like names get Persian descriptions),
event_* (event names shown in Events list get Persian), property titles, common words.
KEEP: URLs, app name, block category names used in code-gen? NO — block_* are palette labels (user-visible).

CAREFUL: block_* head/tail/body strings are assembled into the block label shown in the palette.
They are labels, safe to translate. Their content like 'getNow(ms)' → 'گرفتن زمان فعلی (میلی‌ثانیه)'.
BUT: xB.a(Resources,int) uses the string only if map b (custom file) missing; else Resources.getString — locale-aware, so fa shows.
"""

import re, xml.etree.ElementTree as ET

P = '/root/sw-fa/app/src/main/res/values-fa/strings.xml'

T = {
 # block_* method-like labels → Persian
 'block_calendar_get_now_tail': 'گرفتن تاریخ امروز',
 'block_calendar_get_time_tail': 'گرفتن زمان (میلی‌ثانیه)',
 'block_calendar_set_time_body_1': 'تنظیم زمان',
 'block_calendarview_get_date_tail': 'گرفتن تاریخ',
 'block_calendarview_set_date_body_1': 'تنظیم تاریخ',
 'block_calendarview_set_max_date_body_1': 'تنظیم بیشینه تاریخ',
 'block_calendarview_set_min_date_body_1': 'تنظیم کمینه تاریخ',
 'block_close_drawer_head': 'بستن کشو',
 'block_copy_to_clipboard_head': 'کپی در کلیپ‌بورد',
 'block_do_toast_head': 'نمایش توست',
 'block_false_head': 'غلط',
 'block_firebaseauth_get_email_tail': 'دریافت ایمیل Firebase Auth',
 'block_firebaseauth_get_uid_tail': 'دریافت شناسه کاربر Firebase',
 'block_firebaseauth_signin_anonymously_tail': 'ورود ناشناس Firebase',
 'block_get_alpha_tail': 'دریافت شفافیت',
 'block_get_checked_tail': 'دریافت وضعیت انتخاب',
 'block_get_enable_tail': 'دریافت فعال بودن',
 'block_get_location_x_tail': 'دریافت مختصات X',
 'block_get_location_y_tail': 'دریافت مختصات Y',
 'block_get_rotate_tail': 'دریافت چرخش',
 'block_get_scale_x_tail': 'دریافت مقیاس X',
 'block_get_scale_y_tail': 'دریافت مقیاس Y',
 'block_get_text_tail': 'دریافت متن',
 'block_get_translation_x_tail': 'دریافت جابه‌جایی X',
 'block_get_translation_y_tail': 'دریافت جابه‌جایی Y',
 'block_intent_set_action_body_1': 'تنظیم اکشن',
 'block_intent_set_data_body_1': 'تنظیم داده',
 'block_intent_set_flags_body_1': 'تنظیم فلگ‌ها',
 'block_intent_set_screen_body_1': 'تنظیم صفحه',
 'block_is_drawer_open_head': 'کشو باز است',
 'block_list_get_checked_count_tail': 'تعداد انتخاب‌شده‌ها',
 'block_list_get_checked_position_tail': 'موقعیت انتخاب‌شده',
 'block_list_refresh_tail': 'بازخوانی داده',
 'block_list_set_custom_view_data_body_1': 'تنظیم داده ویجت سفارشی',
 'block_list_set_data_body_1': 'تنظیم داده لیست',
 'block_list_smooth_scrollto_body_1': 'پیمایش نرم به موقعیت',
 'block_true_head': 'درست',
 # property_* labels
 'property_first_day_of_week': 'اولین روز هفته',
 'property_gravity': 'گراویته',
 'property_layout_gravity': 'گراویته لی‌اوت',
 'property_scale_x': 'مقیاس X',
 'property_scale_y': 'مقیاس Y',
 'property_translation_x': 'جابه‌جایی X',
 'property_translation_y': 'جابه‌جایی Y',
 'property_custom_view_listview': 'ویجت سفارشی',
 # common words
 'common_word_custom_view': 'ویجت سفارشی',
 'common_word_moreblock': 'موربلاک',
 'logic_variable_type_map': 'Map',
 # event names — shown in the Events list; keep the onXxx signature but add Persian? 
 # These are FUNCTION names in generated code; renaming them would break code-gen.
 # They appear as event titles — user-facing. We'll Persianize display, but the value IS used for code-gen!
 # SAFE: keep event_* as-is (they map to actual Java callbacks). Add note below.
 # titles
 'main_drawer_title_sketchware_for_arduino': 'Sketchware برای Arduino',
 'title_activity_icon_creator': 'سازنده آیکون',
 'system_information_dpi': 'DPI',
}

# NOTE: event_on* and block method names used in CODE-GEN stay English (renaming breaks compilation).
# We keep all event_on* as-is deliberately.

tree = ET.parse(P)
root = tree.getroot()
n = 0
for s in root.findall('string'):
    key = s.get('name')
    if key in T:
        s.text = T[key]
        n += 1
tree.write(P, encoding='utf-8', xml_declaration=True)
print('round5 values-fa replacements:', n)
EOF_MARKER = None
