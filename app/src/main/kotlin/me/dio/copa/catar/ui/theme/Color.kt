package me.dio.copa.catar.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val md_theme_light_primary = Color(0xFF009688)
val md_theme_light_onPrimary = Color(0xFFFFFFFF)
val md_theme_light_onPrimaryContainer = Color(0xFF006064)
val md_theme_light_secondary = Color(0xFF626200)
val md_theme_light_onSecondary = Color(0xFFFFFFFF)
val md_theme_light_secondaryContainer = Color(0xFFEBEA21)
val md_theme_light_error = Color(0xFFBA1A1A)
val md_theme_light_onError = Color(0xFFFFFFFF)
val md_theme_light_background = Color(0xFFFCFDF6)
val md_theme_light_onBackground = Color(0xFF1A1C19)
val md_theme_light_surface = Color(0xFFFCFDF6)
val md_theme_light_onSurface = Color(0xFF1A1C19)

val lightColors = Colors(
    primary = md_theme_light_primary,
    primaryVariant = md_theme_light_onPrimaryContainer,
    secondary = md_theme_light_secondary,
    secondaryVariant = md_theme_light_secondaryContainer,
    background = md_theme_light_background,
    surface = md_theme_light_surface,
    error = md_theme_light_error,
    onPrimary = md_theme_light_onPrimary,
    onSecondary = md_theme_light_onSecondary,
    onBackground = md_theme_light_onBackground,
    onSurface = md_theme_light_onSurface,
    onError = md_theme_light_onError,
    isLight = true
)

val md_theme_dark_primary = Color(0xFF009688)
val md_theme_dark_primaryContainer = Color(0xFF005313)
val md_theme_dark_secondary = Color(0xFFCECD00)
val md_theme_dark_onSecondary = Color(0xFF323200)
val md_theme_dark_secondaryContainer = Color(0xFF4A4900)
val md_theme_dark_error = Color(0xFFFFB4AB)
val md_theme_dark_onError = Color(0xFF690005)
val md_theme_dark_background = Color(0xFF1A1C19)
val md_theme_dark_onBackground = Color(0xFFE2E3DD)
val md_theme_dark_surface = Color(0xFF1A1C19)
val md_theme_dark_onSurface = Color(0xFFE2E3DD)

val darkColors = Colors(
    primary = md_theme_dark_primary,
    primaryVariant = md_theme_dark_primaryContainer,
    secondary = md_theme_dark_secondary,
    secondaryVariant = md_theme_dark_secondaryContainer,
    background = md_theme_dark_background,
    surface = md_theme_dark_surface,
    error = md_theme_dark_error,
    onPrimary = md_theme_dark_onSurface,
    onSecondary = md_theme_dark_onSecondary,
    onBackground = md_theme_dark_onBackground,
    onSurface = md_theme_dark_onSurface,
    onError = md_theme_dark_onError,
    isLight = false
)