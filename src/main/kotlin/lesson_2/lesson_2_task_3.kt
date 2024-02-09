package org.example.lesson_2

fun main() {

    val trainDepartureTimeHours: Byte = 9
    val trainDepartureTimeMinutes: Byte = 39
    val trainTravelTimeMinutes: Short = 457 // 7 часов 37 мин
    val trainArrivalTimeHours = trainDepartureTimeHours + ((trainDepartureTimeMinutes + trainTravelTimeMinutes) / 60)
    val trainArrivalTimeMinutes = (trainDepartureTimeMinutes + trainTravelTimeMinutes) % 60

    print(trainArrivalTimeHours)
    print(":")
    print(trainArrivalTimeMinutes)
}