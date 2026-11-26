#!/usr/bin/env python3
"""Replace all reference app brand names in decoded resources with our name.

Usage: python3 scripts/replace_brand_text.py <decoded_dir>
Only XML text under res/ and the manifest is touched.
"""
import pathlib
import re
import sys

# Ordered longest-first so "After Motion Z+" is not shortened by an earlier rule.
REPLACEMENTS = [
    ("support-android@alightmotion.com", "support@ankitmotion.app"),
    ("After Motion Z+", "Ankit motion+"),
    ("After Motion Z", "Ankit motion+"),
    ("After Motion", "Ankit motion+"),
    ("ALIGHT MOTION", "ANKIT MOTION+"),
    ("Alight Motion", "Ankit motion+"),
    ("Alight motion", "Ankit motion+"),
    ("alight motion", "Ankit motion+"),
    ("Alight Creative", "Ankit motion+"),
    ("Alight Cloud", "Ankit motion+ Cloud"),
    ("alightmotion.com", "ankitmotion.app"),
    ("alightmotion", "ankitmotion"),
    ("ALIGHT", "ANKIT"),
    ("Alight", "Ankit"),
]


def patch(path: pathlib.Path) -> int:
    try:
        text = path.read_text(encoding="utf-8")
    except (UnicodeDecodeError, OSError):
        return 0
    original = text
    for old, new in REPLACEMENTS:
        text = text.replace(old, new)
    if text != original:
        path.write_text(text, encoding="utf-8")
        return sum(original.count(old) for old, _ in REPLACEMENTS)
    return 0


def main() -> None:
    if len(sys.argv) != 2:
        raise SystemExit("usage: replace_brand_text.py <decoded_dir>")
    root = pathlib.Path(sys.argv[1])
    files = sorted(root.glob("res/**/*.xml")) + [root / "AndroidManifest.xml"]
    total = sum(patch(path) for path in files if path.exists())
    print(f"Replaced {total} brand name occurrences")
    if total == 0:
        raise SystemExit("no brand names found")


if __name__ == "__main__":
    main()
