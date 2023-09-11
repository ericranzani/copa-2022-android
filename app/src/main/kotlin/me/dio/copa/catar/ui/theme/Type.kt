package me.dio.copa.catar.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
//  Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
)

val Roboto = FontFamily.Default
object MatchTextStyle {
    val titleMedium = TextStyle(
        fontFamily      = Roboto,
        fontWeight      = FontWeight.Medium,
        letterSpacing   = 0.15000000596046448.sp,
        lineHeight      = 24.sp,
        fontSize        = 16.sp
    )

   val titleSmall = TextStyle(
    fontFamily      = Roboto,
    fontWeight      = FontWeight.Medium,
    letterSpacing   = 0.10000000149011612.sp,
    lineHeight      = 5.sp,
    fontSize        = 14.sp
    )
}