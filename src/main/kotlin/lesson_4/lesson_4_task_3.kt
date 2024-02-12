package org.example.lesson_4

fun main() {

    val sunnyWeather = true
    val outdoorAwning = true
    val percentageAirHumidity = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${sunnyWeather == SUNNY_WEATHER && outdoorAwning == OUTDOOR_AWNING && 
                    percentageAirHumidity >= MIN_AIR_HUMIDITY && season != SEASON}")
}

const val SUNNY_WEATHER = true
const val OUTDOOR_AWNING = true
const val MIN_AIR_HUMIDITY = 20
const val SEASON = "зима"