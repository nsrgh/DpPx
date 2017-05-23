package com.nosorogstudio.dppx

data class Px(override val value: Float): Dimension<Px> {
    override fun change(value: Float) = Px(value)

    constructor(value: Byte): this(value = value.toFloat())
    constructor(value: Short): this(value = value.toFloat())
    constructor(value: Int): this(value = value.toFloat())
    constructor(value: Long): this(value = value.toFloat())
    constructor(value: Double): this(value = value.toFloat())
}