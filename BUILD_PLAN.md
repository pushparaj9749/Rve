# Build & Analysis Plan — Rve

> Goal: pehle blueprint/plan (ye document + `BLUEPRINT.md`), phir reference APK ka end-to-end analysis, phir us behaviour se apna clean-room app banana.

## Phase 0 — Blueprint + plan ✅

- [x] `BLUEPRINT.md` template banaya (product, architecture, data, API, UX, checklist)
- [x] `BUILD_PLAN.md` ye execution plan

## Phase 1 — Inputs ✅

- [x] Reference APK provide hua aur analyze ho gaya (`ANALYSIS.md`)
- [x] Stack: **Kotlin native + Jetpack Compose** (agent ne choose kiya)
- [x] Authorization: apna app / seekhna / clean-room
- [x] Backend: **nahi** — pure local, no cloud/account/ads
- [x] App name: **Ankit motion+**
- [x] Pehle **check build**, uske baad paid version

> ✅ Go-ahead mil gaya ("Ab suru kar") — Phase 6 slice 1 start ho gaya. Neeche progress update hai.

## Phase 2 — Tooling setup (local, analysis artifacts ignored by Git)

- `unzip`, `file`, `sha256sum`, `strings`, `keytool`, `aapt`/`apkanalyzer`
- `apktool` (resources/manifest decode)
- `jadx` ya equivalent (dex → Java-like source)
- Optional: `frida`/emulator **sirf** agar dynamic analysis maango
- Text reports/index `research/` me (Git-tracked), raw unpacked APK `analysis/unpacked/` me (git-ignored) — bade binaries Git me nahi jayenge.

## Phase 3 — Static analysis → `ANALYSIS.md` ✅

- [x] APK downloaded from Drive (`google_drive/base.apk`), SHA-256 recorded, identity/manifest/DEX/native/assets scanned.

1. APK identity: hash, size, package, versionCode/Name, min/target SDK, signing certificate.
2. Manifest inventory: permissions, activities, services, receivers, providers, exported flags, intent-filters.
3. Resources & strings: hardcoded URLs, hosts, emails, placeholder keys, locales, config values.
4. Dependencies: third-party SDKs, native libs (`.so`), ABI list.
5. Decompile: entry points, application class, main activities, network client setup.
6. Output: "kya mila" summary + evidence (file/line references).

## Phase 4 — Behaviour map → `ANALYSIS.md` (continued) ✅

- [x] Workflow map, data model, network map aur sequence diagrams `ANALYSIS.md` me likhe gaye.

- Screen-by-screen flow graph
- Feature-wise: trigger → steps → network/storage → result (sequence diagrams)
- Background work: services, jobs, receivers
- Data lifecycle: kya kahan save hota hai, kab delete hota hai
- "Kaise karta hai" — har feature ka technical explanation

## Phase 5 — Blueprint finalize → `BLUEPRINT.md` ✅

- [x] `TBD` entries actual data se replace
- [x] Feature matrix, data model, API contract, UX flow, permissions, deps final
- [x] Risk/scope notes: kya copy mat karna, kya badalna hai
- [x] User vision add: **zyada effects** + **video reverse** + future features (backlog)

> Blueprint ab product-ready hai. Stack default: Kotlin + Compose + OpenGL/Vulkan + Media3. Confirm hone par implementation shuru.

## Phase 6 — Scaffold + implementation ✅ (in progress)

- [x] Slice 1: stack (Kotlin/Compose), 8 modules, theme, navigation, manifest, icon
- [x] Slice 1: `core-model` data classes (Scene/Element/Effect/Reverse)
- [x] Slice 1: Room DB + `ProjectRepository` (local-only)
- [x] Slice 1: `EffectRegistry` stub (Blur/Glow/Pixelate)
- [x] Slice 1: Home screen (project list + new project dialog)
- [x] Slice 1: Editor skeleton (preview/layers/inspector/timeline) + Reverse panel UI
- [x] Slice 2: real media picker + add image/video layers (photos/videos → thumbnails → layer, persisted URI)
- [x] Slice 3: keyframe interpolation + easing (KeyframeEvaluator, playhead UI, 4 easing curves)
- [x] Slice 4: effects catalog (20 definitions + 3 GLSL shaders + parameter UI) — GPU preview wiring still pending
- [x] Slice 5: real video+audio reverse worker (local VideoProcessor, progress)
- [x] Slice 6: Media3 Transformer export (H.264/AAC) + Gallery save
- [x] Parity pass: text/shape/drawing/audio layers, effect browser (1,120), project import/export, templates/settings — see `FEATURE_PARITY.md`
- [ ] Build verification (agent sandbox me JDK/Gradle nahi — Android Studio me sync karna hoga)

## Phase 7 — Verify & harden

- Behaviour parity check: reference vs naya app (screens/flows)
- Permission audit, secret scan, error/empty states
- Unit + smoke tests, release build, signing config
- Final handoff: `ANALYSIS.md`, `BLUEPRINT.md`, source, run instructions

## Deliverables

| File | Content |
| --- | --- |
| `ANALYSIS.md` | Reference app: kya karta hai, kaise karta hai |
| `BLUEPRINT.md` | Apne app ka clean-room design |
| `BUILD_PLAN.md` | Ye plan + progress checkboxes |
| `research/` | Text reports, 22,273-method index, 72 decompiled classes (tracked) |
| `analysis/unpacked/` | Raw APK contents (git-ignored) |

## Checkpoints

1. APK milte hi → Phase 2/3 start, phir short summary.
2. Analysis complete → `ANALYSIS.md` share.
3. Blueprint final → `BLUEPRINT.md` share.
4. Har implemented feature → build/demo.

## Non-goals

- Reference code/assets blind copy
- Malware, unauthorized access, license/DRM bypass
- Kisi doosre system/service par bina permission ke experiments
- Cloud/account/ads/remote config — user ne nahi chaha
- Paid version — Phase A check build ke baad hi
- **Code likhna abhi — user ne abhi start karne se mana kiya**
