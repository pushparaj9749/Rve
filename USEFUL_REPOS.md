# Useful GitHub repos — Ankit motion+ ke liye

**Goal:** local-only Android motion-graphics/video editor (Kotlin + Compose), video/audio **reverse** differentiator, 1200+ effects.
**Rule:** sirf **reference / learning** ke liye. Clean-room code likhna hai; GPL/AGPL repos se code copy nahi.

Verify date: 2026-11-25 (GitHub API + README check).

---

## Tier 1 — direct kaam ki

| # | Repo | License | Stars | Kaise kaam aayega |
| --- | --- | --- | --- | --- |
| 1 | [androidx/media](https://github.com/androidx/media) | Apache-2.0 | 3.1k | Official **Media3**: ExoPlayer + Transformer + Composition + effects. Preview aur export ka foundation. |
| 2 | [SysAdminDoc/ClearCut](https://github.com/SysAdminDoc/ClearCut) | MIT | 139 | Pura full-featured offline editor. Keyframes, masks, GLSL shaders, Room projects, **reverse clip export** (FFmpeg pre-render). Architecture blueprint. |
| 3 | [Rustys90/cutforge](https://github.com/Rustys90/cutforge) | MIT | 1 | Chhota clean-room NLE: multi-track timeline, drag/trim/split, undo/redo, **preview aur export ek hi Media3 Composition** se — WYSIWYG pattern. |
| 4 | [yellowcath/VideoProcessor](https://github.com/yellowcath/VideoProcessor) | Apache-2.0 | 992 | Direct `VideoProcessor.reverseVideo(context, in, out, reverseAudio, listener)` — MediaCodec-based reverse **with audio**. Hamare differentiator ka closest reference. Purana (2023) hai, logic padhna hai. |
| 5 | [R-Dilipkumar/photo-art-filters-android](https://github.com/R-Dilipkumar/photo-art-filters-android) | MIT | 1 | 134 offline GPU art filters, har style alag `.frag` shader + `shader_template.frag` + `check_shaders.py`. Hamare `EffectRegistry` ke liye effect-pack pattern. |
| 6 | [deepmedia/Transcoder](https://github.com/deepmedia/Transcoder) | Apache-2.0 | 867 | Hardware MediaCodec transcoding, crop/trim/concat/speed, custom frame timestamps — export pipeline ke liye. 2024 se maintained nahi. |

## Tier 2 — specific ideas ke liye

| Repo | License | Note |
| --- | --- | --- |
| [sixo/reverse-video](https://github.com/sixo/reverse-video) | Apache-2.0 | Pure Android APIs se video reverse ka minimal 2020 demo. Frame-reordering samajhne ke liye. |
| [bones0008/RooMCutNext](https://github.com/bones0008/RooMCutNext) | **AGPL-3.0** | README me timeline math (integer microseconds, snap-once, undo snapshots, preview=export Composition) ka detailed design note hai. **Sirf padho**, code copy nahi. |
| [devhyper/open-video-editor](https://github.com/devhyper/open-video-editor) | **GPL-3.0** | Mature published app (747 stars), Media3+Compose. Feature set chhota (trim/rotate/scale). GPL → reference only. |

---

## Kya kya dekhna hai (mapping hamare slices pe)

| Hamara slice | Repo | File/idea |
| --- | --- | --- |
| Media picker + layers | cutforge / ClearCut | `ui/mediapicker`, `CompositionFactory` |
| Keyframes + easing | ClearCut | `KeyframeEngine` (Bezier/hold) |
| Shader effects | photo-art-filters | `app/src/main/assets/shaders/*.frag` |
| Preview = export | cutforge / RooMCutNext | `CompositionFactory` — `CompositionPlayer` + `Transformer` ek hi object |
| **Video reverse** | VideoProcessor, sixo/reverse-video | `reverseVideo(..., reverseAudio, ...)`, frame reversal |
| Export worker | ClearCut / RooMCutNext | foreground `ExportService`, MediaStore save |
| Project format | ClearCut / RooMCutNext | JSON codec + atomic write + versioning |

## License rule (important)

- **MIT / Apache-2.0** → ideas + chhote snippets sakte hain with attribution.
- **GPL-3.0 / AGPL-3.0** → sirf padhna; unka code hamare (future paid) app me copy karne se poora app copyleft ho sakta hai.

## Next action

Inme se koi bhi repo chaho to main `.clone/` me local clone kar ke uska **sirf relevant folder** padh ke hamare code me clean-room approach likh sakta hoon.
