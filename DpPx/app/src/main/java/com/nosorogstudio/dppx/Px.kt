package com.nosorogstudio.dppx

data class Px(val value: Float): Comparable<Px> {
    constructor(value: Byte): this(value = value.toFloat())
    constructor(value: Short): this(value = value.toFloat())
    constructor(value: Int): this(value = value.toFloat())
    constructor(value: Long): this(value = value.toFloat())
    constructor(value: Double): this(value = value.toFloat())

    override fun compareTo(other: Px) = this.value.compareTo(other.value)

    operator fun plus(other: Px): Px = Px(this.value + other.value)
    operator fun minus(other: Px): Px = Px(this.value - other.value)
    operator fun unaryPlus(): Px = Px(this.value)
    operator fun unaryMinus(): Px = Px(-this.value)

    operator fun times(other: Byte): Px = Px(this.value * other)
    operator fun times(other: Short): Px = Px(this.value * other)
    operator fun times(other: Int): Px = Px(this.value * other)
    operator fun times(other: Long): Px = Px(this.value * other)
    operator fun times(other: Float): Px = Px(this.value * other)
    operator fun times(other: Double): Px = Px((this.value * other).toFloat())

    operator fun div(other: Byte): Px = Px(this.value / other)
    operator fun div(other: Short): Px = Px(this.value / other)
    operator fun div(other: Int): Px = Px(this.value / other)
    operator fun div(other: Long): Px = Px(this.value / other)
    operator fun div(other: Float): Px = Px(this.value / other)
    operator fun div(other: Double): Px = Px((this.value / other).toFloat())

    operator fun div(other: Px): Float = this.value / other.value
    operator fun rem(other: Px): Px = Px(this.value % other.value)
}