package org.example.lesson_4

fun main() {

    var cargoWeight = 20
    var cargoVolume = 80

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${cargoWeight >= MIN_CARGO_WEIGHT_AVERAGE && cargoWeight <= MAX_CARGO_WEIGHT_AVERAGE && cargoVolume < MAX_CARGO_VOLUME_AVERAGE}")

    cargoWeight = 50
    cargoVolume = 100

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${cargoWeight >= MIN_CARGO_WEIGHT_AVERAGE && cargoWeight <= MAX_CARGO_WEIGHT_AVERAGE && cargoVolume < MAX_CARGO_VOLUME_AVERAGE}")


}

const val MIN_CARGO_WEIGHT_AVERAGE = 35
const val MAX_CARGO_WEIGHT_AVERAGE = 100
const val MAX_CARGO_VOLUME_AVERAGE = 100