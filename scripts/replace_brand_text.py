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


TEXT_RE = re.compile(r"(<(?:string|item)[^>]*>)(.*?)(</(?:string|item)>)", re.S)


def patch(path: pathlib.Path) -> int:
    try:
        text = path.read_text(encoding="utf-8")
    except (UnicodeDecodeError, OSError):
        return 0

    count = 0

    def replace_value(match: re.Match) -> str:
        nonlocal count
        value = match.group(2)
        for old, new in REPLACEMENTS:
            hits = value.count(old)
            if hits:
                count += hits
                value = value.replace(old, new)
        return match.group(1) + value + match.group(3)

    patched = TEXT_RE.sub(replace_value, text)
    if count:
        path.write_text(patched, encoding="utf-8")
    return count


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
