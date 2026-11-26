# Ankit motion+

Clean-room, local-only motion-graphics / video editor for Android.
Built from behaviour learned from a reference APK — **no reference code, assets or branding copied**.

## Current status — Phase A, slice 1 ✅

Implemented:

- Multi-module Kotlin + Jetpack Compose project skeleton
- Core models: `Scene`, `SceneElement`, `Keyable*`, `EffectDefinition`, `EffectInstance`, `ReverseSettings`
- Room persistence + `ProjectRepository` (`.db` local, no cloud)
- Effect registry stub (`Blur`, `Glow`, `Pixelate`) — extensible to 1,200+ effects
- Home screen: reference-like 3-tab layout (Home / Projects / My Elements), drawer, full-screen Create Project page
- Editor: reference-like project bar, canvas tool rail, info/play bar, timeline and layer property panel
- Real photo/video picker, keyframes, effect browser, reverse panel, project import/export
- App icon + theme (`Ankit motion+` branding)

**Implemented:** After Motion Z+ local feature parity — text/shape/drawing/audio layers, keyframes + easing, blending/fill/shadow/speed controls, searchable effect browser (**1,120 effects**), project import/export, templates, settings, real local video+audio reverse, Media3 H.264/AAC export + Gallery save. See `FEATURE_PARITY.md`.

**Still pending:** real GPU shader passes (preview is a ColorMatrix approximation), full nested-scene export flattening, GIF/image/M4A exporters, foreground service for long jobs, cloud (never), paid version (later). Camera capture and nested scenes have basic support.

## Decisions

| Item | Value |
| --- | --- |
| App name | Ankit motion+ |
| Stack | Kotlin + Jetpack Compose + Room + Media3 planned |
| Network | **None** — no INTERNET permission, no cloud/account/ads |
| Release | Phase A = free check build; Phase B = paid version later |
| UI | Restored to the reverse-engineered reference layout/flow; no re-skin until explicitly approved |

## APK download (GitHub Actions)

Har push par debug APK banta hai:

- **Latest successful run:** https://github.com/pushparaj9749/Rve/actions/runs/45824177959
- **APK artifact:** `AnkitMotion-plus-debug` (run page → Artifacts section)
- Direct: https://github.com/pushparaj9749/Rve/actions/runs/45824177959/artifacts/15118698989

Artifact download karke zip unlock karein → `app-debug.apk` → phone me install karein (unknown sources allow karna hoga).

## Build locally

Java 17 + Android SDK required. This agent sandbox has no JDK/Gradle, so the code was written but **not compiled here**.

1. Open this folder in **Android Studio** (Ladybug or newer, AGP 8.6+).
2. Let Gradle sync (it will generate its own wrapper / use bundled Gradle).
3. Run on device/emulator with API 26+.

If you prefer CLI:

```bash
export JAVA_HOME=/path/to/jdk-17
./gradlew :app:installDebug   # after generating a wrapper: gradle wrapper --gradle-version 8.7
```

## Third-party (build-time dependencies, runtime is offline)

- `androidx.media3` (Apache-2.0) — export pipeline, preview/transformer
- `com.github.yellowcath:VideoProcessor` (Apache-2.0) — local video+audio reverse via JitPack

## Module map

```
app/                  entry, navigation, DI container
core-model/           data classes
core-database/        Room DB + ProjectRepository
core-export/          Media3 export + MediaStore save
core-effect/          effect registry
core-ui/              theme
feature-home/         home + new project
feature-editor/       editor skeleton
feature-reverse/      reverse panel
```

## Docs

- `ANALYSIS.md` — full reverse-engineering report of the reference app
- `BLUEPRINT.md` — product blueprint for Ankit motion+
- `BUILD_PLAN.md` — phased execution plan
- `research/` — decompiled classes, method index, string/URL indexes

> Implementation start: user ne "Ab suru kar" bola — ye slice usi ka pehla hissa hai.
