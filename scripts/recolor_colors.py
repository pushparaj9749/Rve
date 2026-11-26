#!/usr/bin/env python3
"""Recolor only the app chrome palette in an apktool-decoded reference APK.

Usage: python3 scripts/recolor_colors.py <decoded_dir>
No layout, code, strings, icons or flow files are touched.
"""
import pathlib
import re
import sys

# AARRGGBB values from the reference palette -> deep navy / blue palette.
REPLACEMENTS = {
    # Accent (reference green -> blue)
    "ff00ffa8": "ff4da3ff",
    "8000ffa8": "804da3ff",
    # App chrome surfaces
    "ff191c25": "ff0b1020",
    "ff191b27": "ff111a2e",
    "ff141620": "ff0f1830",
    "66141620": "660f1830",
    "cc141620": "cc0f1830",
    "ff0c0d13": "ff070b16",
    "ff1e2239": "ff16203a",
    "ff242636": "ff1b2740",
    "ff2b2f39": "ff243456",
    "ff2a2f36": "ff223456",
    "ff363942": "ff2c3c5e",
    "ff2c3046": "ff223a5e",
    "ff202b36": "ff14264a",
    "ff202332": "ff152244",
    "ff2b2e3c": "ff243456",
    "7f202332": "7f152244",
    "ff292d40": "ff182448",
    "4d292d40": "4d182448",
    "ff333750": "ff1b2740",
    "ff262a3c": "ff111a2e",
    "ff191c29": "ff0b1020",
    "ff0f1418": "ff070b16",
    "ff1b202a": "ff111a2e",
}


def patch_file(path: pathlib.Path) -> int:
    text = path.read_text(encoding="utf-8", errors="strict")
    count = 0

    def repl(match: re.Match) -> str:
        nonlocal count
        raw = match.group(1).lstrip("#").lower()
        # accept #AARRGGBB or #RRGGBB
        if len(raw) == 6:
            raw = "ff" + raw
        new = REPLACEMENTS.get(raw)
        if new is None:
            return match.group(0)
        count += 1
        return '#' + new

    patched = re.sub(r'#[0-9a-fA-F]{6}(?:[0-9a-fA-F]{2})?', repl, text)
    if count:
        path.write_text(patched, encoding="utf-8")
    return count


def main() -> None:
    if len(sys.argv) != 2:
        raise SystemExit("usage: recolor_colors.py <decoded_dir>")
    root = pathlib.Path(sys.argv[1])
    files = sorted(root.glob("res/values*/colors.xml"))
    if not files:
        raise SystemExit("no colors.xml found under res/values*")
    total = sum(patch_file(f) for f in files)
    print(f"Recolored {total} color values in {len(files)} file(s)")
    if total == 0:
        raise SystemExit("no known palette values found")


if __name__ == "__main__":
    main()
