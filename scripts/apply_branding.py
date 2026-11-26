#!/usr/bin/env python3
"""Apply the Ankit motion+ name and launcher logo to an apktool-decoded APK.

Only strings named app_name and launcher icon assets are touched.
Usage: python3 scripts/apply_branding.py <decoded_dir>
"""
import pathlib
import re
import shutil
import sys

APP_NAME = "Ankit motion+"
BRAND = pathlib.Path(__file__).resolve().parent.parent / "brand"
BITMAP_XML = """<?xml version="1.0" encoding="utf-8"?>
<bitmap xmlns:android="http://schemas.android.com/apk/res/android"
    android:src="@drawable/ic_launcher_logo" />
"""


def patch_names(root: pathlib.Path) -> int:
    total = 0
    pattern = re.compile(r'(<string\s+name="app_name"[^>]*>)(.*?)(</string>)', re.S)
    for path in sorted(root.glob("res/values*/strings.xml")):
        text = path.read_text(encoding="utf-8", errors="strict")
        patched, count = pattern.subn(lambda m: m.group(1) + APP_NAME + m.group(3), text)
        if count:
            path.write_text(patched, encoding="utf-8")
            total += count
    return total


def apply_icons(root: pathlib.Path) -> None:
    drawable = root / "res" / "drawable"
    drawable.mkdir(parents=True, exist_ok=True)
    shutil.copyfile(BRAND / "ic_launcher_logo.png", drawable / "ic_launcher_logo.png")

    for density in ("mdpi", "hdpi", "xhdpi", "xxhdpi", "xxxhdpi"):
        src_dir = BRAND / f"mipmap-{density}"
        dst_dir = root / "res" / f"mipmap-{density}"
        dst_dir.mkdir(parents=True, exist_ok=True)
        for name in ("ic_launcher.webp", "ic_launcher_round.webp", "ic_launcher_foreground.webp"):
            shutil.copyfile(src_dir / name, dst_dir / name)

    # Use the full logo bitmap instead of the adaptive mask so the supplied
    # artwork (including the wordmark) is what the launcher shows.
    v26 = root / "res" / "mipmap-anydpi-v26"
    v26.mkdir(parents=True, exist_ok=True)
    for name in ("ic_launcher.xml", "ic_launcher_round.xml"):
        (v26 / name).write_text(BITMAP_XML, encoding="utf-8")


def main() -> None:
    if len(sys.argv) != 2:
        raise SystemExit("usage: apply_branding.py <decoded_dir>")
    root = pathlib.Path(sys.argv[1])
    count = patch_names(root)
    if count == 0:
        raise SystemExit("app_name string not found")
    apply_icons(root)
    print(f"Applied app name to {count} strings and replaced launcher icons")


if __name__ == "__main__":
    main()
