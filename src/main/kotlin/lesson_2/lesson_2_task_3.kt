package org.example.lesson_2

fun main() {

    val trainDepartureTimeHours: Byte = 9
    val trainDepartureTimeMinutes: Byte = 39
    val trainTravelTimeMinutes: Short = 457 // 7 часов 37 мин
    val trainArrivalTimeHours = trainDepartureTimeHours + ((trainDepartureTimeMinutes + trainTravelTimeMinutes) / MINUTES_IS_HOUR)
    val trainArrivalTimeMinutes = (trainDepartureTimeMinutes + trainTravelTimeMinutes) % MINUTES_IS_HOUR

    print(trainArrivalTimeHours)
    print(":")
    print(trainArrivalTimeMinutes)
}

const val MINUTES_IS_HOUR = 60