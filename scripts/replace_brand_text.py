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
REF_RE = re.compile(r"@[A-Za-z_][\w.]*/[A-Za-z_][\w.]*")


def replace_outside_refs(value: str) -> tuple[str, int]:
    """Only replace text outside @style/Foo style resource references."""
    segments: list[tuple[bool, str]] = []
    last = 0
    for match in REF_RE.finditer(value):
        if match.start() > last:
            segments.append((False, value[last:match.start()]))
        segments.append((True, match.group(0)))
        last = match.end()
    if last < len(value):
        segments.append((False, value[last:]))

    count = 0
    output = []
    for is_ref, segment in segments:
        if is_ref:
            output.append(segment)
            continue
        for old, new in REPLACEMENTS:
            hits = segment.count(old)
            if hits:
                count += hits
                segment = segment.replace(old, new)
        output.append(segment)
    return "".join(output), count


def patch(path: pathlib.Path) -> int:
    try:
        text = path.read_text(encoding="utf-8")
    except (UnicodeDecodeError, OSError):
        return 0

    count = 0

    def replace_value(match: re.Match) -> str:
        nonlocal count
        value, hits = replace_outside_refs(match.group(2))
        count += hits
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
