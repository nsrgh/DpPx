package com.nosorogstudio.dppx.geometry

import com.nosorogstudio.dppx.Dimension
import com.nosorogstudio.dppx.Dp
import com.nosorogstudio.dppx.Px

interface XY<TD: Dimension<TD>> {
    val x: TD
    val y: TD
}

interface PointT<TD: Dimension<TD>, TSelf: XY<TD>>: XY<TD> {
    fun change(x: TD, y: TD): TSelf
    fun changeX(x: TD): TSelf = change(x = x, y = this.y)
    fun changeY(y: TD): TSelf = change(x = this.x, y = y)

    fun move(dx: TD, dy: TD): TSelf = change(x = this.x + dx, y = this.y + dy)
    fun moveX(dx: TD): TSelf = changeX(x = this.x + dx)
    fun moveY(dy: TD): TSelf = changeY(y = this.y + dy)
}

data class PointPx(override val x: Px, override val y: Px): PointT<Px, PointPx> {
    override fun change(x: Px, y: Px) = PointPx(x = x, y = y)
}

data class PointDp(override val x: Dp, override val y: Dp): PointT<Dp, PointDp> {
    override fun change(x: Dp, y: Dp) = PointDp(x = x, y = y)
}

typealias Point = PointDp