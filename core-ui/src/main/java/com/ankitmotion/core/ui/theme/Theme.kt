package com.ankitmotion.core.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Navy900 = Color(0xFF0B0F1A)
val Navy800 = Color(0xFF111827)
val Navy700 = Color(0xFF1B2437)
val CyanAccent = Color(0xFF22D3EE)
val OrangeAccent = Color(0xFFFF8A3D)
val TextPrimary = Color(0xFFF8FAFC)
val TextMuted = Color(0xFF94A3B8)

private val DarkColors = darkColorScheme(
    primary = CyanAccent,
    onPrimary = Navy900,
    secondary = OrangeAccent,
    onSecondary = Navy900,
    background = Navy900,
    onBackground = TextPrimary,
    surface = Navy800,
    onSurface = TextPrimary,
    surfaceVariant = Navy700,
    onSurfaceVariant = TextMuted
)

private val LightColors = lightColorScheme(
    primary = CyanAccent,
    secondary = OrangeAccent,
    background = Color(0xFFF8FAFC),
    surface = Color.White
)

@Composable
fun AnkitMotionTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content
    )
}
