package me.dio.copa.catar.ui.animations

import androidx.compose.animation.*
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp

@Composable
fun AnimationExpand(
    isVisible: Boolean,
    content: @Composable () -> Unit
) {
    val density = LocalDensity.current
    val shouldTriggerAnimation = remember { MutableTransitionState(false) }
    shouldTriggerAnimation.targetState = isVisible

    AnimatedVisibility(
        visibleState = shouldTriggerAnimation,

        enter = slideInVertically { with(density) { -10.dp.roundToPx() } }
                + expandVertically(expandFrom = Alignment.Top)
                + fadeIn(initialAlpha = 0.1f, animationSpec = tween(durationMillis = 700)),

        exit = fadeOut(
            targetAlpha = 0f, animationSpec = tween(
                durationMillis = 700, easing = LinearOutSlowInEasing
            )
        ) + shrinkVertically(),

        content = {
            content()
        }
    )
}