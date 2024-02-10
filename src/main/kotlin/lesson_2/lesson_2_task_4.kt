package org.example.lesson_2

import kotlin.math.roundToInt

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buff = 0.2
    val crystalOreBuff = crystalOre * buff
    val ironOreBuff = ironOre * buff

    print("Добыто бонусной кристаллической руды: ")
    println(crystalOreBuff.roundToInt())
    print("Добыто бонусной железной руды: ")
    print(ironOreBuff.roundToInt())
}