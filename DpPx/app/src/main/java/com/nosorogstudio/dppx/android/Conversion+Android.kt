package com.nosorogstudio.dppx.android

import android.content.res.Resources
import com.nosorogstudio.dppx.Dp
import com.nosorogstudio.dppx.Px
import com.nosorogstudio.dppx.toDp
import com.nosorogstudio.dppx.toPx

fun Dp.toPx(): Px {
    return this.toPx(density = Density.current)
}

fun Px.toDp(): Dp {
    return this.toDp(density = Density.current)
}

object Density {
    val system: Float get() = Resources.getSystem().displayMetrics.density
    val current: Float get() = overrided ?: system

    private var overrided: Float? = null

    fun use(newDensity: Float) {
        overrided = newDensity
    }

    fun useSystem() {
        overrided = null
    }

    fun useLdpi() = use(0.75f)
    fun useMdpi() = use(1f)
    fun useHdpi() = use(1.5f)
    fun useXhdpi() = use(2f)
    fun useXxhdpi() = use(3f)
    fun useXxxhdpi() = use(4f)
}