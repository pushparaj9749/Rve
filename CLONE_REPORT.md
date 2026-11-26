# Clone report — Anil-matcha/open-generative-ai

**Cloned to:** `.clone/open-generative-ai/` (git-ignored)
**Remote:** https://github.com/Anil-matcha/open-generative-ai.git
**Branch:** `main`
**Latest commit:** `7746dd22068175ede684c455529bdd3d12a2f07d` — “Update README.md” (2026-11-25)
**License:** MIT · **Package version:** 2.0.0
**Size:** ~56 MB · **Files:** 258

> Direct `git clone --depth 1` sandbox me chala gaya; GitHub Action ki zarurat nahi padi.

## Kya hai ye?

Open-source **generative AI media studio** — AI image/video/audio generation ke liye browser + desktop app. README khud ise “free, open-source alternative to AI video platforms” bolta hai. Backend ke liye **Muapi.ai** API gateway use karta hai (BYOK — user apni API key localStorage me daalta hai).

## Tech stack

| Layer | Tech |
| --- | --- |
| Web app | Next.js 15 App Router, React 19 |
| Alternate frontend | Vite + vanilla JS (`src/`) for Electron desktop |
| Desktop | Electron 33 + electron-builder (mac dmg, Windows nsis, Linux AppImage/deb) |
| Styling | Tailwind CSS (v3 + v4 config dono hain), glassmorphism dark UI |
| Monorepo | npm workspaces: `packages/studio`, workflow-builder, ai-agent, design-agent |
| API | Muapi.ai — submit → poll pattern, `x-api-key` header |
| i18n | English + Chinese (`messages/en`, `messages/zh`) |
| Tests | `node --test` (~17 test files) |
| Container | Dockerfile + docker-compose.yml |

## Studios / features

- **Image Studio** — text-to-image (50+) + image-to-image (55+), 14 reference images tak
- **Video Studio** — text-to-video (40+) + image-to-video (60+)
- **Audio Studio** — text se music/audio
- **AI Clipping** — long video se highlights
- **Vibe Motion Studio** — stylized motion/effects
- **Lip Sync Studio** — 9 models, image+audio aur video+audio modes
- **Recast / Body Swap Studio**
- **Cinema Studio** — camera/lens/focal length/aperture controls
- **Marketing Studio**, **AI Influencer Studio**, **Apps Studio**
- **Workflow Studio** — node-based multi-step AI pipelines, templates/community/playground
- **Agent Studio** + **Design Agent Studio** (canvas-based autonomous design)
- **MCP & CLI Studio**
- Upload history, generation history (localStorage), responsive dark UI
- **Local inference (desktop only)**: sd.cpp bundled (SD1.5/SDXL/Z-Image) + Wan2GP (external/MCP)

## Model catalog

`packages/studio/src/models.js` single source of truth. README ke hisaab se **420+ models / 8 categories**:

| Category | Count |
| --- | --- |
| Text-to-Image | 70+ |
| Image-to-Image | 70+ |
| Text-to-Video | 85+ |
| Image-to-Video | 120+ |
| Video-to-Video | 35+ |
| Lip Sync | 15 |
| Recast | 3 |
| Audio | 15+ |

`models_dump.json` me `t2i` list ke 50 entries hain (schema dump).

## Directory map

```
app/            Next.js routes: /studio, /assistant, /agents, /workflow, /zh, /api/*
src/            Vite/Electron frontend components + lib (muapi.js, models.js, localInference*)
components/     StandaloneShell, ApiKeyModal, ThemeToggle
packages/studio/ shared React component library (all studios + model registries)
electron/       main.js, preload.js, local inference runtime/catalog
scripts/        deb packaging, local-ai staging, minimax provider test
tests/          node --test suites (polling, history, local inference, wan2gp…)
messages/       en/zh translations
docs/assets/    demo videos + thumbnails
```

## Submodules (clone kiye gaye? nahi)

`.gitmodules` me 3 submodules hain:
- `packages/Vibe-Workflow` → SamurAIGPT/Vibe-Workflow
- `packages/Open-Poe-AI` → Anil-matcha/Open-Poe-AI
- `packages/Open-AI-Design-Agent` → Anil-matcha/Open-AI-Design-Agent

`--depth 1` clone kiya tha bina `--recursive` ke, isliye ye folders abhi empty hain. Poori setup ke liye:
```bash
git submodule update --init --recursive
npm install
npm run build:packages
```

## Run

```bash
npm run setup      # submodules + install + build packages
npm run dev        # Next.js dev server
npm run test       # node --test
npm run electron:dev
```

## Ankit motion+ se relevance

Ye project **cloud/MuAPI-dependent** hai aur AI generation studio hai — tumhare **local-only** Ankit motion+ se seedha reuse nahi hoga. Lekin ideas (workflow node editor, effect/mode switching, model registry pattern, dark glass UI) reference ke liye padhe ja sakte hain. Code copy nahi karna (MIT hai, par tumhara product alag hai).
