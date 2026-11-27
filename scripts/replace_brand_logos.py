#!/usr/bin/env python3
"""Replace in-app Alight Motion artwork in an apktool-decoded APK.

Original resource names remain unchanged. New brand pixels come from the
supplied Ankit Motion+ artwork; vector templates are rasterized only where
Compose requires a PNG-compatible drawable.
Usage: python3 scripts/replace_brand_logos.py <decoded_dir>
"""
from __future__ import annotations

import base64
import io
import json
import math
import re
import sys
import xml.etree.ElementTree as ET
from pathlib import Path
from typing import Callable

from PIL import Image, ImageDraw
from resvg_py import svg_to_bytes

ROOT = Path(__file__).resolve().parent.parent
BRAND = ROOT / "brand"
SOURCE_LOGO = BRAND / "ic_launcher.png"
ANDROID_NS = "http://schemas.android.com/apk/res/android"
PNG_DENSITY = 4  # drawable-xxxhdpi


def extract_part(box: tuple[int, int, int, int], *, symbol_mask: bool = False) -> Image.Image:
    """Extract a clean transparent part of the supplied launcher lockup."""
    image = Image.open(SOURCE_LOGO).convert("RGBA").crop(box)
    pixels = image.load()
    for y in range(image.height):
        for x in range(image.width):
            if symbol_mask and x + 0.62 * y < 305:
                pixels[x, y] = (0, 0, 0, 0)
                continue
            r, g, b, _ = pixels[x, y]
            luminance = max(r, g, b)
            if luminance <= 18:
                alpha = 0
            elif luminance < 52:
                alpha = int((luminance - 18) * 255 / 34)
            else:
                alpha = min(255, int(luminance * 1.15))
            pixels[x, y] = (r, g, b, alpha)
    bounds = image.getbbox()
    return image.crop(bounds) if bounds else image


def _tint_navy(image: Image.Image) -> Image.Image:
    result = image.copy().convert("RGBA")
    pixels = result.load()
    for y in range(result.height):
        for x in range(result.width):
            r, g, b, alpha = pixels[x, y]
            if not alpha:
                continue
            if r > b + 35 and r > 120:  # keep the supplied gold accent
                pixels[x, y] = (min(255, int(r * 0.88)), int(g * 0.60), int(b * 0.22), alpha)
            else:
                tone = max(r, g, b) / 255.0
                pixels[x, y] = (
                    int(14 + 34 * tone),
                    int(38 + 86 * tone),
                    int(92 + 135 * tone),
                    alpha,
                )
    return result


def _tint_white(image: Image.Image) -> Image.Image:
    result = image.copy().convert("RGBA")
    pixels = result.load()
    for y in range(result.height):
        for x in range(result.width):
            r, g, b, alpha = pixels[x, y]
            if not alpha:
                continue
            if r > b + 35 and r > 120:  # preserve a subtle gold plus
                pixels[x, y] = (255, 205, 130, alpha)
            else:
                value = min(255, int(190 + 65 * (max(r, g, b) / 255.0)))
                pixels[x, y] = (value, value, value, alpha)
    return result


def styled(image: Image.Image, mode: str) -> Image.Image:
    if mode == "navy":
        return _tint_navy(image)
    if mode == "white":
        return _tint_white(image)
    return image.copy().convert("RGBA")


def resize(image: Image.Image, size: tuple[int, int]) -> Image.Image:
    return image.resize((max(1, size[0]), max(1, size[1])), Image.Resampling.LANCZOS)


def horizontal_lockup(
    width: int,
    height: int,
    *,
    mode: str = "silver",
    pad_ratio: float = 0.06,
    background: tuple[int, int, int, int] | None = None,
) -> Image.Image:
    """Make the supplied emblem + ANKIT / MOTION+ lockup fit a wide surface."""
    width, height = max(1, int(width)), max(1, int(height))
    canvas = Image.new("RGBA", (width, height), background or (0, 0, 0, 0))
    pad_x = min((width - 1) // 2, int(width * pad_ratio))
    pad_y = min((height - 1) // 2, int(height * pad_ratio))
    available_w = max(1, width - 2 * pad_x)
    available_h = max(1, height - 2 * pad_y)

    emblem_src = styled(SYMBOL, mode)
    ankit_src = styled(WORD_ANKIT, mode)
    motion_src = styled(WORD_MOTION, mode)

    gap = max(2, int(available_w * 0.045))
    emblem_w = min(int(available_w * 0.27), int(available_h * 0.91 * emblem_src.width / emblem_src.height))
    emblem_w = max(1, emblem_w)
    emblem_h = max(1, int(emblem_src.height * emblem_w / emblem_src.width))
    text_w = max(1, available_w - emblem_w - gap)

    ankit_w = text_w
    ankit_h = max(1, int(ankit_src.height * ankit_w / ankit_src.width))
    motion_w = max(1, int(ankit_w * 0.76))
    motion_h = max(1, int(motion_src.height * motion_w / motion_src.width))
    text_gap = max(3, int(ankit_h * 0.19))
    text_h = ankit_h + text_gap + motion_h

    # Fit the complete lockup vertically without changing its proportions.
    scale = min(1.0, available_h * 0.90 / max(1, text_h), available_h * 0.94 / max(1, emblem_h))
    if scale < 1:
        emblem_w = max(1, int(emblem_w * scale))
        emblem_h = max(1, int(emblem_h * scale))
        ankit_w = max(1, int(ankit_w * scale))
        ankit_h = max(1, int(ankit_h * scale))
        motion_w = max(1, int(motion_w * scale))
        motion_h = max(1, int(motion_h * scale))
        text_gap = max(2, int(text_gap * scale))
        text_h = ankit_h + text_gap + motion_h

    total_w = emblem_w + gap + ankit_w
    # Extremely narrow lockups favor a smaller emblem so the wordmark remains readable.
    if total_w > available_w:
        excess = total_w - available_w
        emblem_w = max(1, emblem_w - excess)
        emblem_h = max(1, int(emblem_src.height * emblem_w / emblem_src.width))
        total_w = emblem_w + gap + ankit_w
    left = max(0, (width - total_w) // 2)
    emblem = resize(emblem_src, (emblem_w, emblem_h))
    ankit = resize(ankit_src, (ankit_w, ankit_h))
    motion = resize(motion_src, (motion_w, motion_h))

    canvas.alpha_composite(emblem, (left, max(0, (height - emblem_h) // 2)))
    text_x = left + emblem_w + gap
    text_y = max(0, (height - text_h) // 2)
    canvas.alpha_composite(ankit, (text_x, text_y))
    canvas.alpha_composite(motion, (text_x + max(0, (ankit_w - motion_w) // 2), text_y + ankit_h + text_gap))
    return canvas


def stacked_lockup(
    width: int,
    height: int,
    *,
    mode: str = "silver",
    background: tuple[int, int, int, int] | None = None,
    include_tagline: bool = False,
) -> Image.Image:
    """Make the supplied emblem-over-wordmark lockup for tall/square surfaces."""
    width, height = max(1, int(width)), max(1, int(height))
    canvas = Image.new("RGBA", (width, height), background or (0, 0, 0, 0))
    emblem_src = styled(SYMBOL, mode)
    ankit_src = styled(WORD_ANKIT, mode)
    motion_src = styled(WORD_MOTION, mode)
    tagline_src = styled(TAGLINE, mode)

    emblem_h = int(height * (0.43 if include_tagline else 0.51))
    emblem_w = int(emblem_src.width * emblem_h / emblem_src.height)
    max_emblem_w = int(width * 0.72)
    if emblem_w > max_emblem_w:
        emblem_w = max_emblem_w
        emblem_h = int(emblem_src.height * emblem_w / emblem_src.width)

    ankit_w = int(width * 0.76)
    ankit_h = max(1, int(ankit_src.height * ankit_w / ankit_src.width))
    motion_w = max(1, int(ankit_w * 0.76))
    motion_h = max(1, int(motion_src.height * motion_w / motion_src.width))
    gap_one = max(4, int(height * 0.035))
    gap_two = max(3, int(height * 0.022))
    tagline_w = max(1, int(ankit_w * 0.76))
    tagline_h = max(1, int(tagline_src.height * tagline_w / tagline_src.width)) if include_tagline else 0
    gap_three = max(4, int(height * 0.025)) if include_tagline else 0
    total_h = emblem_h + gap_one + ankit_h + gap_two + motion_h + gap_three + tagline_h
    scale = min(1.0, height * 0.92 / max(1, total_h))
    if scale < 1:
        emblem_w = max(1, int(emblem_w * scale))
        emblem_h = max(1, int(emblem_h * scale))
        ankit_w = max(1, int(ankit_w * scale))
        ankit_h = max(1, int(ankit_h * scale))
        motion_w = max(1, int(motion_w * scale))
        motion_h = max(1, int(motion_h * scale))
        tagline_w = max(1, int(tagline_w * scale)) if include_tagline else 0
        tagline_h = max(1, int(tagline_h * scale)) if include_tagline else 0
        gap_one = max(2, int(gap_one * scale))
        gap_two = max(2, int(gap_two * scale))
        gap_three = max(2, int(gap_three * scale)) if include_tagline else 0
        total_h = emblem_h + gap_one + ankit_h + gap_two + motion_h + gap_three + tagline_h

    y = max(0, (height - total_h) // 2)
    canvas.alpha_composite(resize(emblem_src, (emblem_w, emblem_h)), ((width - emblem_w) // 2, y))
    y += emblem_h + gap_one
    canvas.alpha_composite(resize(ankit_src, (ankit_w, ankit_h)), ((width - ankit_w) // 2, y))
    y += ankit_h + gap_two
    canvas.alpha_composite(resize(motion_src, (motion_w, motion_h)), ((width - motion_w) // 2, y))
    if include_tagline:
        y += motion_h + gap_three
        canvas.alpha_composite(resize(tagline_src, (tagline_w, tagline_h)), ((width - tagline_w) // 2, y))
    return canvas


def symbol_canvas(width: int, height: int, *, mode: str = "silver", scale_ratio: float = 0.82) -> Image.Image:
    canvas = Image.new("RGBA", (max(1, width), max(1, height)), (0, 0, 0, 0))
    emblem_src = styled(SYMBOL, mode)
    target_w = max(1, int(width * scale_ratio))
    target_h = max(1, int(emblem_src.height * target_w / emblem_src.width))
    if target_h > int(height * scale_ratio):
        target_h = max(1, int(height * scale_ratio))
        target_w = max(1, int(emblem_src.width * target_h / emblem_src.height))
    canvas.alpha_composite(resize(emblem_src, (target_w, target_h)), ((width - target_w) // 2, (height - target_h) // 2))
    return canvas


def member_badge(width: int, height: int) -> Image.Image:
    canvas = Image.new("RGBA", (width, height), (0, 0, 0, 0))
    draw = ImageDraw.Draw(canvas)
    margin = max(2, int(min(width, height) * 0.025))
    ring = max(2, int(min(width, height) * 0.043))
    draw.ellipse(
        (margin, margin, width - margin - 1, height - margin - 1),
        fill=(12, 18, 35, 255),
        outline=(45, 137, 255, 255),
        width=ring,
    )
    emblem = symbol_canvas(width, height, mode="silver", scale_ratio=0.62)
    canvas.alpha_composite(emblem)
    return canvas


def scale_alpha(image: Image.Image, target_max: int) -> Image.Image:
    result = image.copy().convert("RGBA")
    alpha = result.getchannel("A")
    current_max = alpha.getextrema()[1]
    if not current_max:
        return result
    factor = target_max / current_max
    alpha = alpha.point(lambda value: min(255, max(0, int(round(value * factor)))))
    result.putalpha(alpha)
    return result


def pill_watermark(
    width: int,
    height: int,
    *,
    mode: str = "white",
    light: bool = False,
    close: str | None = None,
    arrow: str | None = None,
) -> Image.Image:
    """Build the pill-style export labels, preserving the original affordances."""
    canvas = Image.new("RGBA", (width, height), (0, 0, 0, 0))
    draw = ImageDraw.Draw(canvas)
    pad = max(3, int(height * 0.10))
    bounds = (2, 2, width - 3, height - 3)
    radius = max(3, int((height - 4) / 2))
    pill_color = (190, 193, 201, 255) if light else (7, 9, 16, 255)
    mark_color = (24, 39, 76, 255) if light else (240, 242, 247, 255)
    draw.rounded_rectangle(bounds, radius=radius, fill=pill_color)

    accessory_space = int(height * 0.56) if close or arrow else 0
    logo_area_w = max(1, width - 2 * pad - accessory_space)
    logo_area_h = max(1, height - 2 * pad)
    lockup = horizontal_lockup(logo_area_w, logo_area_h, mode=mode, pad_ratio=0.015)
    logo_x = pad + max(0, (logo_area_w - lockup.width) // 2)
    logo_y = (height - lockup.height) // 2
    canvas.alpha_composite(lockup, (logo_x, logo_y))

    if close or arrow:
        cx = width - max(2, pad // 2) - max(4, accessory_space // 2)
        cy = height // 2
        if close == "circle":
            diameter = max(14, int(height * 0.31))
            box = (cx - diameter // 2, cy - diameter // 2, cx + diameter // 2, cy + diameter // 2)
            draw.ellipse(box, outline=mark_color, width=max(2, int(height * 0.024)))
            extent = int(diameter * 0.23)
            line_width = max(2, int(height * 0.022))
        elif close:
            extent = int(height * 0.115)
            line_width = max(2, int(height * 0.052))
        else:
            extent = int(height * 0.105)
            line_width = 1
        if close:
            draw.line((cx - extent, cy - extent, cx + extent, cy + extent), fill=mark_color, width=line_width)
            draw.line((cx + extent, cy - extent, cx - extent, cy + extent), fill=mark_color, width=line_width)
        elif arrow:
            arrow_w = max(7, int(height * 0.20))
            arrow_h = max(5, int(height * 0.14))
            if arrow == "up":
                points = [(cx, cy - arrow_h // 2), (cx - arrow_w // 2, cy + arrow_h // 2), (cx + arrow_w // 2, cy + arrow_h // 2)]
            else:
                points = [(cx - arrow_w // 2, cy - arrow_h // 2), (cx + arrow_w // 2, cy - arrow_h // 2), (cx, cy + arrow_h // 2)]
            draw.polygon(points, fill=mark_color)
    return canvas


def png_density_dir(root: Path, density: str = "xxxhdpi") -> Path:
    directory = root / "res" / f"drawable-{density}"
    directory.mkdir(parents=True, exist_ok=True)
    return directory


def save_png_resource(
    root: Path, name: str, image: Image.Image, *, density: str = "xxxhdpi"
) -> Path:
    path = png_density_dir(root, density) / f"{name}.png"
    image.convert("RGBA").save(path, format="PNG", optimize=True)
    return path


def find_unique(root: Path, filename: str) -> Path:
    matches = sorted(root.glob(f"res/**/{filename}"))
    if len(matches) != 1:
        raise RuntimeError(f"expected one res/**/{filename}, found {len(matches)}")
    return matches[0]


def save_in_source_format(path: Path, image: Image.Image) -> None:
    suffix = path.suffix.lower()
    if suffix in {".jpg", ".jpeg"}:
        image.convert("RGB").save(path, format="JPEG", quality=94, optimize=True, progressive=True)
    elif suffix == ".webp":
        if image.mode == "RGBA":
            image.convert("RGBA").save(path, format="WEBP", lossless=True, method=6)
        else:
            image.convert("RGB").save(path, format="WEBP", lossless=True, method=6)
    else:
        image.save(path)


def replace_vector_logos(root: Path) -> int:
    vector_specs: dict[str, tuple[int, int, Callable[[int, int], Image.Image]]] = {
        "about_bi.xml": (233, 146, lambda w, h: stacked_lockup(w, h, include_tagline=True)),
        "bi_alightmotion_dark.xml": (133, 32, lambda w, h: horizontal_lockup(w, h, mode="silver", pad_ratio=0.02)),
        "ac_alightmotion_logo_white.xml": (160, 44, lambda w, h: horizontal_lockup(w, h, mode="silver", pad_ratio=0.025)),
        "ac_alightmotion_logo_navy.xml": (160, 44, lambda w, h: horizontal_lockup(w, h, mode="navy", pad_ratio=0.025)),
        "ac_logo_white.xml": (38, 31, lambda w, h: symbol_canvas(w, h, mode="white", scale_ratio=0.88)),
        "ic_bi_agree.xml": (264, 246, lambda w, h: stacked_lockup(w, h, include_tagline=True)),
        "ic_bi_bg_none.xml": (192, 192, lambda w, h: symbol_canvas(w, h, mode="silver", scale_ratio=0.62)),
        "ic_bi.xml": (125, 100, lambda w, h: symbol_canvas(w, h, mode="silver", scale_ratio=0.82)),
        "ic_bi_a11.xml": (125, 100, lambda w, h: symbol_canvas(w, h, mode="silver", scale_ratio=0.76)),
        "ic_bi_splash.xml": (125, 290, lambda w, h: symbol_canvas(w, h, mode="silver", scale_ratio=0.82)),
        "ic_members_small.xml": (20, 20, lambda w, h: member_badge(w, h)),
    }
    changed = 0
    for filename, (dp_w, dp_h, make_image) in vector_specs.items():
        path = root / "res" / "drawable" / filename
        resource_name = Path(filename).stem
        raster_path = root / "res" / "drawable-xxxhdpi" / f"{resource_name}.png"
        if not path.exists():
            # A second run is safe after the original vector was replaced.
            if raster_path.is_file():
                changed += 1
                continue
            raise RuntimeError(f"missing vector drawable: {path}")

        image = make_image(dp_w * PNG_DENSITY, dp_h * PNG_DENSITY)
        save_png_resource(root, resource_name, image)
        # Keep Compose painterResource compatible: its XML loader accepts
        # VectorDrawable XML, not <bitmap> or <layer-list> wrappers. A real PNG
        # with the same resource name is a supported rasterized asset.
        path.unlink()
        changed += 1
    return changed


def replace_raster_logos(root: Path) -> int:
    changed = 0
    # Direct, same-size replacements for logo/badge artwork.
    direct = {
        "ac_alightmotion_logo_gradient.webp": lambda w, h: horizontal_lockup(w, h, mode="navy", pad_ratio=0.035),
        "ac_alightmotion_bi_color_xlarge2.webp": lambda w, h: stacked_lockup(
            w, h, mode="navy", background=(255, 255, 255, 255), include_tagline=True
        ),
        "ac_watermark3.webp": lambda w, h: scale_alpha(stacked_lockup(w, h, mode="white"), 195),
        "alight_motion_bi_white30.webp": lambda w, h: horizontal_lockup(w, h, mode="white", pad_ratio=0.035),
        "ac_badge_members.webp": member_badge,
    }
    for filename, make_image in direct.items():
        path = find_unique(root, filename)
        with Image.open(path) as original:
            width, height = original.size
            output = make_image(width, height)
        save_in_source_format(path, output)
        changed += 1

    popup = find_unique(root, "am_50_popup_still.jpg")
    with Image.open(popup) as original:
        width, height = original.size
    background = (13, 19, 36, 255)
    popup_image = Image.new("RGBA", (width, height), background)
    lockup = horizontal_lockup(int(width * 0.80), int(height * 0.44), mode="silver", pad_ratio=0.035)
    popup_image.alpha_composite(lockup, ((width - lockup.width) // 2, (height - lockup.height) // 2))
    save_in_source_format(popup, popup_image)
    changed += 1

    paywall = find_unique(root, "ic_stacked_intro_paywall_visual.webp")
    with Image.open(paywall) as original:
        paywall_image = original.convert("RGBA")
    icon_size = min(152, paywall_image.width - 20, paywall_image.height - 20)
    brand_icon = Image.open(BRAND / "ic_launcher.png").convert("RGBA").resize(
        (icon_size, icon_size), Image.Resampling.LANCZOS
    )
    mask = Image.new("L", (icon_size, icon_size), 0)
    ImageDraw.Draw(mask).rounded_rectangle(
        (2, 2, icon_size - 3, icon_size - 3), radius=max(6, int(icon_size * 0.23)), fill=255
    )
    brand_icon.putalpha(mask)
    paywall_image.alpha_composite(brand_icon, ((paywall_image.width - icon_size) // 2, (paywall_image.height - icon_size) // 2))
    save_in_source_format(paywall, paywall_image)
    changed += 1
    return changed


def replace_export_watermarks(root: Path) -> int:
    specs: dict[str, tuple[int, Callable[[int, int], Image.Image]]] = {
        "wm_center.webp": (20, lambda w, h: symbol_canvas(w, h, mode="white", scale_ratio=0.78)),
        "wm_h.webp": (213, lambda w, h: horizontal_lockup(w, h, mode="white", pad_ratio=0.06)),
        "wm_h3.webp": (255, lambda w, h: horizontal_lockup(w, h, mode="white", pad_ratio=0.05)),
        "wm_h4.webp": (233, lambda w, h: pill_watermark(w, h)),
        "wm_h4_x.webp": (232, lambda w, h: pill_watermark(w, h, close="plain")),
        "wm_h5.webp": (226, lambda w, h: pill_watermark(w, h)),
        "wm_h5_bottom.webp": (228, lambda w, h: pill_watermark(w, h, arrow="up")),
        "wm_h5_top.webp": (228, lambda w, h: pill_watermark(w, h, arrow="down")),
        "wm_h6.webp": (255, lambda w, h: pill_watermark(w, h, mode="navy", light=True)),
        "wm_h6_x.webp": (255, lambda w, h: pill_watermark(w, h, mode="navy", light=True, close="circle")),
    }
    changed = 0
    generated: dict[str, Image.Image] = {}
    for filename, (target_alpha, make_image) in specs.items():
        path = find_unique(root, filename)
        with Image.open(path) as original:
            width, height = original.size
        image = scale_alpha(make_image(width, height), target_alpha)
        save_in_source_format(path, image)
        generated[filename] = image
        changed += 1

    vertical_specs = {
        "wm_v.webp": (212, "wm_h.webp"),
        "wm_v3.webp": (255, "wm_h3.webp"),
        "wm_v4.webp": (233, "wm_h4.webp"),
        "wm_v4_x.webp": (232, "wm_h4_x.webp"),
        "wm_v5.webp": (228, "wm_h5.webp"),
        "wm_v5_x.webp": (227, "wm_h4_x.webp"),
        "wm_v6.webp": (255, "wm_h6.webp"),
        "wm_v6_x.webp": (255, "wm_h6_x.webp"),
    }
    for filename, (target_alpha, source_name) in vertical_specs.items():
        path = find_unique(root, filename)
        with Image.open(path) as original:
            expected_size = original.size
        source = generated[source_name]
        vertical = source.transpose(Image.Transpose.ROTATE_270)
        if vertical.size != expected_size:
            # Some legacy vertical placements differ by one pixel in the long dimension.
            vertical = vertical.resize(expected_size, Image.Resampling.LANCZOS)
        vertical = scale_alpha(vertical, target_alpha)
        save_in_source_format(path, vertical)
        changed += 1
    return changed


QR_LOGO_BOXES = {
    "qr_code_attachment_16_9": (1600, 900, 620, 70, 360, 100),
    "qr_code_attachment_1_1": (900, 900, 270, 80, 360, 100),
    "qr_code_attachment_4_3": (1600, 1200, 620, 220, 360, 100),
    "qr_code_attachment_9_16": (900, 1600, 270, 380, 360, 100),
}


def _android_color(value: str) -> tuple[str, float]:
    color = value.strip()
    if not color.startswith("#"):
        raise RuntimeError(f"QR vector uses an unsupported color reference: {value}")
    digits = color[1:]
    if len(digits) == 8:  # Android AARRGGBB -> SVG #RRGGBB + opacity.
        alpha = int(digits[:2], 16) / 255
        rgb = digits[2:]
    elif len(digits) == 6:
        alpha, rgb = 1.0, digits
    else:
        raise RuntimeError(f"QR vector uses an unsupported color: {value}")
    return f"#{rgb}", alpha


def _vector_to_svg(root_element: ET.Element) -> tuple[str, int]:
    """Render the small Android vector subset used by the four QR templates."""

    def android_attr(element: ET.Element, name: str, default: str = "") -> str:
        return element.get(f"{{{ANDROID_NS}}}{name}", default)

    viewport_w = float(android_attr(root_element, "viewportWidth"))
    viewport_h = float(android_attr(root_element, "viewportHeight"))
    definitions: list[str] = []
    removed_brand_paths = 0
    clip_index = 0

    def render_path(element: ET.Element, *, clip: bool = False) -> str:
        nonlocal removed_brand_paths
        path_data = android_attr(element, "pathData")
        if not path_data:
            return ""
        fill_value = android_attr(element, "fillColor")
        if not clip and fill_value.upper() in {"#FF01FFA8", "#01FFA8"}:
            removed_brand_paths += 1
            return ""
        attrs = [f'd="{path_data}"']
        if clip:
            attrs.append('fill="white"')
        elif fill_value:
            fill, alpha = _android_color(fill_value)
            fill_alpha = alpha * float(android_attr(element, "fillAlpha", "1"))
            attrs.extend((f'fill="{fill}"', f'fill-opacity="{fill_alpha:.6g}"'))
            if android_attr(element, "fillType") == "1":
                attrs.append('fill-rule="evenodd"')
        else:
            attrs.append('fill="none"')
        stroke_value = android_attr(element, "strokeColor")
        if stroke_value:
            stroke, alpha = _android_color(stroke_value)
            stroke_alpha = alpha * float(android_attr(element, "strokeAlpha", "1"))
            attrs.extend((
                f'stroke="{stroke}"',
                f'stroke-opacity="{stroke_alpha:.6g}"',
                f'stroke-width="{android_attr(element, "strokeWidth", "1")}"',
            ))
        return "<path " + " ".join(attrs) + "/>"

    def render_children(parent: ET.Element, *, is_group: bool = False) -> str:
        nonlocal clip_index
        pieces: list[str] = []
        local_clip: str | None = None
        for child in list(parent):
            tag = child.tag.rsplit("}", 1)[-1]
            if tag == "clip-path":
                clip_index += 1
                local_clip = f"qr_clip_{clip_index}"
                definitions.append(
                    f'<clipPath id="{local_clip}">{render_path(child, clip=True)}</clipPath>'
                )
            elif tag == "path":
                pieces.append(render_path(child))
            elif tag == "group":
                pieces.append(render_children(child, is_group=True))
            else:
                raise RuntimeError(f"unsupported QR vector element: {tag}")

        content = "".join(pieces)
        if not content:
            return ""
        group_attrs: list[str] = []
        if local_clip:
            group_attrs.append(f'clip-path="url(#{local_clip})"')
        if is_group:
            rotation = float(android_attr(parent, "rotation", "0"))
            pivot_x = float(android_attr(parent, "pivotX", "0"))
            pivot_y = float(android_attr(parent, "pivotY", "0"))
            scale_x = float(android_attr(parent, "scaleX", "1"))
            scale_y = float(android_attr(parent, "scaleY", "1"))
            trans_x = float(android_attr(parent, "translateX", "0"))
            trans_y = float(android_attr(parent, "translateY", "0"))
            if any((rotation, pivot_x, pivot_y, trans_x, trans_y, scale_x != 1, scale_y != 1)):
                transform = (
                    f"translate({trans_x + pivot_x:g} {trans_y + pivot_y:g}) "
                    f"rotate({rotation:g}) scale({scale_x:g} {scale_y:g}) "
                    f"translate({-pivot_x:g} {-pivot_y:g})"
                )
                group_attrs.append(f'transform="{transform}"')
        if group_attrs:
            return f"<g {' '.join(group_attrs)}>{content}</g>"
        return content

    body = render_children(root_element)
    if removed_brand_paths < 1:
        raise RuntimeError("Alight Motion paths not found in QR template vector")
    defs = f"<defs>{''.join(definitions)}</defs>" if definitions else ""
    svg = (
        f'<svg xmlns="http://www.w3.org/2000/svg" width="{viewport_w:g}" '
        f'height="{viewport_h:g}" viewBox="0 0 {viewport_w:g} {viewport_h:g}">'
        f"{defs}{body}</svg>"
    )
    return svg, removed_brand_paths


def replace_qr_header_logos(root: Path) -> int:
    drawable = root / "res" / "drawable"
    raster_dir = root / "res" / "drawable-nodpi"
    changed = 0
    render_scale = 2
    for name, (canvas_w, canvas_h, left, top, box_w, box_h) in QR_LOGO_BOXES.items():
        path = drawable / f"{name}.xml"
        raster_path = raster_dir / f"{name}.png"
        if not path.exists():
            # A second run is safe after the vector has been rasterized.
            if raster_path.is_file():
                changed += 1
                continue
            raise RuntimeError(f"missing QR drawable: {path}")

        vector_root = ET.parse(path).getroot()
        svg, _ = _vector_to_svg(vector_root)
        png_bytes = svg_to_bytes(
            svg_string=svg,
            width=canvas_w * render_scale,
            height=canvas_h * render_scale,
            skip_system_fonts=True,
        )
        with Image.open(io.BytesIO(png_bytes)) as source:
            image = source.convert("RGBA")

        logo = horizontal_lockup(
            box_w * render_scale,
            box_h * render_scale,
            mode="silver",
            pad_ratio=0.06,
        )
        image.alpha_composite(logo, (left * render_scale, top * render_scale))
        raster_dir.mkdir(parents=True, exist_ok=True)
        image.save(raster_path, format="PNG", optimize=True)
        path.unlink()
        changed += 1
    return changed


def replace_preset_popup_brand(root: Path) -> int:
    path = root / "res" / "raw" / "preset_import_complete_popup.json"
    if not path.exists():
        raise RuntimeError(f"missing Lottie popup JSON: {path}")
    source = path.read_text(encoding="utf-8")
    data = json.loads(source)
    assets = data.get("assets", [])
    image_asset = next((asset for asset in assets if str(asset.get("p", "")).startswith("data:image/png;base64,")), None)
    if image_asset is None:
        raise RuntimeError("embedded screenshot not found in preset import popup Lottie")
    old_payload = image_asset["p"]
    prefix, encoded = old_payload.split(",", 1)
    screenshot = Image.open(io.BytesIO(base64.b64decode(encoded))).convert("RGBA")
    if screenshot.size != (1950, 4220):
        raise RuntimeError(f"unexpected embedded popup screenshot size: {screenshot.size}")

    # Replace only the existing grey “Alight Motion ×” pill in the canvas screenshot.
    x0, y0, x1, y1 = 670, 1810, 1280, 1907
    patch_w, patch_h = x1 - x0, y1 - y0
    supersample = 4
    # This crop sits on the popup's white artboard; an opaque white corner
    # prevents repeated runs from blending the pill's antialiased edge twice.
    patch = Image.new("RGBA", (patch_w * supersample, patch_h * supersample), (255, 255, 255, 255))
    draw = ImageDraw.Draw(patch)
    draw.rounded_rectangle(
        (0, 0, patch.width - 1, patch.height - 1),
        radius=(patch_h // 2) * supersample,
        fill=(179, 179, 179, 255),
    )
    logo_w, logo_h = 500 * supersample, 78 * supersample
    logo = horizontal_lockup(logo_w, logo_h, mode="navy", pad_ratio=0.015)
    patch.alpha_composite(logo, (18 * supersample, (patch.height - logo.height) // 2))
    # Keep the original close affordance at the right side of the capsule.
    cx, cy = 568 * supersample, (patch_h // 2) * supersample
    extent, line_width = 12 * supersample, 2 * supersample
    close_color = (245, 245, 248, 255)
    draw.line((cx - extent, cy - extent, cx + extent, cy + extent), fill=close_color, width=line_width)
    draw.line((cx + extent, cy - extent, cx - extent, cy + extent), fill=close_color, width=line_width)
    patch = patch.resize((patch_w, patch_h), Image.Resampling.LANCZOS)
    screenshot.alpha_composite(patch, (x0, y0))

    output = io.BytesIO()
    screenshot.save(output, format="PNG", optimize=True)
    new_payload = prefix + "," + base64.b64encode(output.getvalue()).decode("ascii")
    # Change only the single base64 field; preserve the rest of the Lottie JSON byte-for-byte.
    patched, replacements = re.subn(re.escape(old_payload), lambda _match: new_payload, source, count=1)
    if replacements != 1:
        raise RuntimeError("could not update embedded screenshot in Lottie JSON")
    path.write_text(patched, encoding="utf-8")
    return 1


# Source artwork extracted from brand/ic_launcher.png using the supplied artwork's
# transparent regions. Keep these as module-level images so every replacement is
# generated consistently from the same logo.
SYMBOL = extract_part((250, 175, 1005, 760), symbol_mask=True)
WORD_ANKIT = extract_part((220, 795, 1035, 925))
WORD_MOTION = extract_part((320, 930, 960, 1015))
TAGLINE = extract_part((300, 1050, 955, 1105))


def main() -> None:
    if len(sys.argv) != 2:
        raise SystemExit("usage: replace_brand_logos.py <decoded_dir>")
    if not SOURCE_LOGO.is_file():
        raise SystemExit(f"supplied launcher artwork missing: {SOURCE_LOGO}")
    decoded = Path(sys.argv[1]).resolve()
    if not (decoded / "res").is_dir():
        raise SystemExit(f"apktool decoded resources not found under {decoded}")

    vectors = replace_vector_logos(decoded)
    raster = replace_raster_logos(decoded)
    watermarks = replace_export_watermarks(decoded)
    qr = replace_qr_header_logos(decoded)
    popup = replace_preset_popup_brand(decoded)
    print(
        "Replaced in-app branding: "
        f"{vectors} vector logos, {raster} raster logos/badges, "
        f"{watermarks} export watermarks, {qr} QR headers, {popup} embedded popup screenshot"
    )


if __name__ == "__main__":
    main()
