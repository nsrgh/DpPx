package com.nosorogstudio.dppx.android

import android.graphics.PointF
import com.nosorogstudio.dppx.Dp
import com.nosorogstudio.dppx.Px

var PointF.xDp: Dp
    get() = Px(this.x).toDp()

    set(value) {
        this.x = value.toPx().value
    }

var PointF.yDp: Dp
    get() = Px(this.y).toDp()

    set(value) {
        this.y = value.toPx().value
    }

var PointF.xPx: Px
    get() = Px(this.x)

    set(value) {
        this.x = value.value
    }

var PointF.yPx: Px
    get() = Px(this.y)

    set(value) {
        this.y = value.value
    }

fun PointF(x: Dp, y: Dp): PointF {
    return PointF(x.toPx().value, y.toPx().value)
}

fun PointF(x: Px, y: Px): PointF {
    return PointF(x.value, y.value)
}