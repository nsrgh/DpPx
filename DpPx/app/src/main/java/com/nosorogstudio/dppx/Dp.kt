package com.nosorogstudio.dppx

data class Dp(override val value: Float): Dimension<Dp> {
    override fun change(value: Float) = Dp(value)

    constructor(value: Byte): this(value = value.toFloat())
    constructor(value: Short): this(value = value.toFloat())
    constructor(value: Int): this(value = value.toFloat())
    constructor(value: Long): this(value = value.toFloat())
    constructor(value: Double): this(value = value.toFloat())

}