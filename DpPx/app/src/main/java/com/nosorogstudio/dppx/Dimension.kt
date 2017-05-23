package com.nosorogstudio.dppx

interface FloatValue {
    val value: Float
}

interface Dimension<TSelf: FloatValue>: FloatValue, Comparable<TSelf> {
    fun change(value: Float): TSelf

    override fun compareTo(other: TSelf) = this.value.compareTo(other.value)

    operator fun plus(other: TSelf): TSelf = change(this.value + other.value)
    operator fun minus(other: TSelf): TSelf = change(this.value - other.value)
    operator fun unaryPlus(): TSelf = change(this.value)
    operator fun unaryMinus(): TSelf = change(-this.value)

    operator fun times(other: Byte): TSelf = change(this.value * other)
    operator fun times(other: Short): TSelf = change(this.value * other)
    operator fun times(other: Int): TSelf = change(this.value * other)
    operator fun times(other: Long): TSelf = change(this.value * other)
    operator fun times(other: Float): TSelf = change(this.value * other)
    operator fun times(other: Double): TSelf = change((this.value * other).toFloat())

    operator fun div(other: Byte): TSelf = change(this.value / other)
    operator fun div(other: Short): TSelf = change(this.value / other)
    operator fun div(other: Int): TSelf = change(this.value / other)
    operator fun div(other: Long): TSelf = change(this.value / other)
    operator fun div(other: Float): TSelf = change(this.value / other)
    operator fun div(other: Double): TSelf = change((this.value / other).toFloat())

    operator fun div(other: TSelf): Float = this.value / other.value
    operator fun rem(other: TSelf): TSelf = change(this.value % other.value)
}