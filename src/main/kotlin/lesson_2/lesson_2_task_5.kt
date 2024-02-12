package org.example.lesson_2

import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {

    val depositAmount = 70_000
    val result: Double = depositAmount * (1 + 0.167/1).pow (1 * 20)

    println((result * 1000.0).roundToInt() / 1000.0)
}