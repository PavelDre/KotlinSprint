package org.example.lesson_4

fun main() {

    val isSunny = true
    val isAwningOpen = true
    val percentageAirHumidity = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${isSunny == IS_SUNNY && isAwningOpen == IS_AWNING_OPEN && 
                    percentageAirHumidity >= MIN_AIR_HUMIDITY && season != SEASON}")
}

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val MIN_AIR_HUMIDITY = 20
const val SEASON = "зима"