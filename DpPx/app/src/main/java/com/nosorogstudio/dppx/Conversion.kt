package com.nosorogstudio.dppx

fun Dp.toPx(density: Float): Px {
    return Px(this.value * density + 0.5f)
}

fun Px.toDp(density: Float): Dp {
    return Dp(this.value / density)
}

fun Px.toPx(fromDensity: Float, toDensity: Float): Px {
    val dp = this.toDp(density = fromDensity)
    val px = dp.toPx(density = toDensity)
    return px
}