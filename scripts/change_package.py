#!/usr/bin/env python3
"""Give the repacked APK its own application id.

The reference APK keeps the package com.alightcreative.motion. With the same
package Android/Play treats a re-signed build as an update of the installed
app. This script renames the package in the apktool-decoded manifest, smali
classes and XML resources.

Usage: python3 scripts/change_package.py <decoded_dir>
"""
import pathlib
import shutil
import sys

OLD = "com.alightcreative.motion"
OLD_PATH = "com/alightcreative/motion"
NEW = "com.ankitmotion.plus"
NEW_PATH = "com/ankitmotion/plus"


def replace_in_file(path: pathlib.Path, old: str, new: str) -> int:
    try:
        text = path.read_text(encoding="utf-8")
    except (UnicodeDecodeError, OSError):
        return 0
    count = text.count(old)
    if count:
        path.write_text(text.replace(old, new), encoding="utf-8")
    return count


def move_smali_dirs(root: pathlib.Path) -> int:
    moved = 0
    for smali_root in sorted(root.glob("smali*")):
        if not smali_root.is_dir():
            continue
        old_dir = smali_root / OLD_PATH
        if not old_dir.exists():
            continue
        new_dir = smali_root / NEW_PATH
        new_dir.parent.mkdir(parents=True, exist_ok=True)
        if new_dir.exists():
            shutil.rmtree(new_dir)
        shutil.move(str(old_dir), str(new_dir))
        moved += 1
    return moved


def main() -> None:
    if len(sys.argv) != 2:
        raise SystemExit("usage: change_package.py <decoded_dir>")
    root = pathlib.Path(sys.argv[1])

    manifest = root / "AndroidManifest.xml"
    if not manifest.exists():
        raise SystemExit("AndroidManifest.xml not found")
    manifest_count = replace_in_file(manifest, OLD, NEW)
    if manifest_count == 0:
        raise SystemExit(f"package {OLD} not found in manifest")

    xml_count = 0
    for path in root.glob("res/**/*.xml"):
        xml_count += replace_in_file(path, OLD, NEW)

    smali_count = 0
    for path in root.glob("smali*/**/*.smali"):
        smali_count += replace_in_file(path, OLD_PATH, NEW_PATH)
    moved = move_smali_dirs(root)

    print(
        f"Package changed: manifest={manifest_count}, res={xml_count}, "
        f"smali refs={smali_count}, smali roots moved={moved}"
    )


if __name__ == "__main__":
    main()
