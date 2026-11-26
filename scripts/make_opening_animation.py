#!/usr/bin/env python3
"""Generate our own clean-room Lottie opening/loading animation."""
import json
import pathlib

OUT = pathlib.Path(__file__).resolve().parent.parent / "brand" / "lottie_loading_spinner.json"

BLUE = [0.302, 0.639, 1.0, 1.0]   # #4DA3FF
WHITE = [1.0, 1.0, 1.0, 1.0]
SOFT = [0.78, 0.87, 1.0, 1.0]

EASE_IN = {"x": [0.4], "y": [0]}
EASE_OUT = {"x": [0.2], "y": [1]}


def static(value):
    return {"a": 0, "k": value}


def animated(points):
    """points: list of (frame, value). Values are lists."""
    keys = []
    for index, (frame, value) in enumerate(points):
        key = {"t": frame, "s": value}
        if index < len(points) - 1:
            key["i"] = EASE_OUT
            key["o"] = EASE_IN
        keys.append(key)
    return {"a": 1, "k": keys}


def transform(x=0, y=0, scale=None, rotation=None, opacity=None):
    return {
        "ty": "tr",
        "p": static([x, y]),
        "a": static([0, 0]),
        "s": scale or static([100, 100]),
        "r": rotation or static(0),
        "o": opacity or static(100),
        "sk": static(0),
        "sa": static(0),
        "nm": "Transform",
    }


def group(name, items):
    return {"ty": "gr", "nm": name, "it": items + [transform()]}


def shape(points, closed=True):
    zeros = [[0, 0] for _ in points]
    return {
        "ty": "sh",
        "ks": static({"i": zeros, "o": zeros, "v": points, "c": closed}),
        "nm": "Path",
    }


def stroke(color, width):
    return {
        "ty": "st",
        "c": static(color),
        "o": static(100),
        "w": static(width),
        "lc": 2,
        "lj": 2,
        "ml": 4,
        "nm": "Stroke",
    }


def fill(color):
    return {"ty": "fl", "c": static(color), "o": static(100), "r": 1, "nm": "Fill"}


def layer(index, name, shapes, scale=None, rotation=None, opacity=None):
    return {
        "ddd": 0,
        "ind": index,
        "ty": 4,
        "nm": name,
        "sr": 1,
        "ks": {
            "o": opacity or static(100),
            "r": rotation or static(0),
            "p": static([200, 200, 0]),
            "a": static([0, 0, 0]),
            "s": scale or static([100, 100, 100]),
        },
        "ao": 0,
        "shapes": shapes,
        "ip": 0,
        "op": 90,
        "st": 0,
        "bm": 0,
    }


def build():
    ring = group("Orbit ring", [
        {"ty": "el", "p": static([0, 0]), "s": static([250, 250]), "nm": "Ring"},
        stroke(SOFT, 7),
        {
            "ty": "tm",
            "s": static(0),
            "e": animated([(0, [5]), (55, [100]), (90, [100])]),
            "o": static(0),
            "m": 1,
            "nm": "Draw",
        },
    ])

    letter_a = group("Ankit A", [
        shape([[0, -115], [-105, 100], [105, 100]], closed=True),
        stroke(BLUE, 16),
    ])

    play = group("Play", [
        shape([[-28, -42], [-28, 42], [48, 0]], closed=True),
        fill(WHITE),
    ])

    layers = [
        layer(1, "Orbit", [ring], rotation=animated([(0, [0]), (90, [360])])),
        layer(
            2,
            "A mark",
            [letter_a],
            scale=animated([
                (0, [55, 55, 100]),
                (24, [106, 106, 100]),
                (36, [100, 100, 100]),
            ]),
            opacity=animated([(0, [0]), (18, [100]), (90, [100])]),
        ),
        layer(
            3,
            "Play mark",
            [play],
            scale=animated([
                (0, [0, 0, 100]),
                (26, [125, 125, 100]),
                (38, [100, 100, 100]),
                (75, [100, 100, 100]),
                (88, [112, 112, 100]),
            ]),
            opacity=animated([(0, [0]), (16, [100]), (90, [100])]),
        ),
    ]

    return {
        "v": "5.5.5",
        "fr": 30,
        "ip": 0,
        "op": 90,
        "w": 400,
        "h": 400,
        "nm": "Ankit Motion+ Opening",
        "ddd": 0,
        "assets": [],
        "layers": layers,
    }


if __name__ == "__main__":
    OUT.parent.mkdir(parents=True, exist_ok=True)
    OUT.write_text(json.dumps(build(), separators=(",", ":")), encoding="utf-8")
    print(f"Wrote {OUT} ({OUT.stat().st_size} bytes)")
