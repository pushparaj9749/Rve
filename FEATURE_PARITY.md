# Feature parity — After Motion Z+ → Ankit motion+

Reference: `ANALYSIS.md` (APK `ce0346c7…`, label **After Motion Z+**).
Rule: **clean-room** — behaviour/model parity, no copied code/assets/branding.
Standing decisions still active: **no cloud, no account/ads/paywall**, Phase A free check build.

## Ab kya kya hai

| Reference feature | Humari app me | Status |
| --- | --- | --- |
| Multi-layer scene + timeline | IMAGE / VIDEO / AUDIO / TEXT / SHAPE / DRAWING layers | ✅ |
| Reference UI layout / flow | 3-tab home + full-screen create-page; editor project bar, canvas tool rail, info/play bar, timeline (28dp rows), 11-item Add menu, property panel | ✅ restored to reference structure |
| Keyframes + easing | `KeyframeEvaluator` — LINEAR, EASE_IN, EASE_OUT, EASE_IN_OUT, BOUNCE, ELASTIC, STEP; playhead UI | ✅ |
| Motion path editor | 2D path canvas → X/Y keyframes (LINEAR) | ✅ basic (Bezier handles pending) |
| Text layers + fonts | styled text dialog (text, size, color, bold/italic, align, font name) | ✅ basic |
| Custom font import | font name stored, system font rendering | ⚠️ pending |
| Shapes + fills | RECT/ELLIPSE/TRIANGLE/STAR/POLYGON/LINE, solid fill toggle, gradient model | ✅ model+UI |
| Stroke / borders / drop shadow | model fields + toggle buttons | ✅ basic |
| Blending modes | NORMAL/MULTIPLY/SCREEN/OVERLAY chips (8 modes model me) | ✅ basic |
| Drawing tool | freehand canvas → `DrawingPath` layer | ✅ |
| Camera layer | system camera se photo → IMAGE layer | ✅ |
| Nested scenes | project se scene-reference layer | ✅ basic (recursive render pending) |
| Media / audio browser | Photo Picker + `GetContent` audio picker | ✅ |
| Effect browser | searchable, category-grouped dialog | ✅ |
| 1,107 `.ta` effect presets | **20 curated real effects + 1,100 generated grade presets = 1,120**. Exact `.ta` binaries copy nahi kiye | ⚠️ parity count, different content |
| Effect preset timing + preview | `PresetTiming` model + live ColorMatrix preview | ✅ basic |
| Project save / import | Room DB + `.rve` JSON export/import via SAF | ✅ |
| Templates | Home → Templates tab (3 sample starters) | ✅ basic |
| Settings | local SharedPreferences (fps, export quality), cloud disabled | ✅ |
| Export MP4/3GPP/WebM | H.264/AAC MP4 via Media3 | ✅ MP4 only |
| GIF / PNG / JPEG / WebP / M4A export | abhi nahi | ⚠️ pending |
| Video **reverse** | real local reverse + audio (hamara extra) | ✅ |
| Cloud templates/share/account/paywall/ads | deliberately excluded | ❌ decision: nahi banana |

## Effect count breakdown

- 3 original: Blur, Glow, Pixelate
- 15 curated color/light/film effects
- 2 extra shader effects: Pixelate XL, Edge detect
- 1,100 generated grade presets (`shader_adjust` par real parameter variations)
- **Total: 1,120**

## Agla parity step (baaki cheezein)

1. Spline/Bezier path keyframe editor
2. Custom font import + real font rendering
3. Camera capture layer + nested scene merge
4. GIF / PNG / JPEG / WebP / M4A exporters
5. True GPU shader passes + custom font rendering (preview ab ColorMatrix se hota hai)

> Cloud/account/paywall kabhi nahi jab tak user decision badle na. Ye Phase A ka local check build hai.
