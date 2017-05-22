package com.nosorogstudio.dppx

data class Dp(val value: Float): Comparable<Dp> {
    constructor(value: Byte): this(value = value.toFloat())
    constructor(value: Short): this(value = value.toFloat())
    constructor(value: Int): this(value = value.toFloat())
    constructor(value: Long): this(value = value.toFloat())
    constructor(value: Double): this(value = value.toFloat())

    override fun compareTo(other: Dp) = this.value.compareTo(other.value)

    operator fun plus(other: Dp): Dp = Dp(this.value + other.value)
    operator fun minus(other: Dp): Dp = Dp(this.value - other.value)
    operator fun unaryPlus(): Dp = Dp(this.value)
    operator fun unaryMinus(): Dp = Dp(-this.value)

    operator fun times(other: Byte): Dp = Dp(this.value * other)
    operator fun times(other: Short): Dp = Dp(this.value * other)
    operator fun times(other: Int): Dp = Dp(this.value * other)
    operator fun times(other: Long): Dp = Dp(this.value * other)
    operator fun times(other: Float): Dp = Dp(this.value * other)
    operator fun times(other: Double): Dp = Dp((this.value * other).toFloat())

    operator fun div(other: Byte): Dp = Dp(this.value / other)
    operator fun div(other: Short): Dp = Dp(this.value / other)
    operator fun div(other: Int): Dp = Dp(this.value / other)
    operator fun div(other: Long): Dp = Dp(this.value / other)
    operator fun div(other: Float): Dp = Dp(this.value / other)
    operator fun div(other: Double): Dp = Dp((this.value / other).toFloat())

    operator fun div(other: Dp): Float = this.value / other.value
    operator fun rem(other: Dp): Dp = Dp(this.value % other.value)
}