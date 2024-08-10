package com.dicoding.jetreward.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColors(
    primary = Navy200,
    secondary = Turquoise500,

)

private val LightColorScheme = lightColors(
    primary = Navy500,
    secondary = Turquoise500,


    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun JetRewardTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
   // dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if(darkTheme) {

        DarkColorScheme
    }
        else {
        LightColorScheme
    }



    MaterialTheme(
        colors= colorScheme,
        typography = Typography,
        content = content
    )
}