package org.example.lesson_4

fun main() {

    print("Корабль имеет незначительные повреждения? (true/false): ")
    val isDamaged: Boolean = readln().toBoolean()

    print("Введите количество членов экипажа корабля (желательно от 55 до 70): ")
    val numberOfCrew: Int = readln().toInt()

    print("Введите количество  ящиков с провизией, имеющихся на борту: ")
    val numberOfBoxes: Int = readln().toInt()

    print("Какие сегодня метеоусловия? Благоприятные или не очень? (true/false): ")
    val isFavorable: Boolean = readln().toBoolean()

    println("Корабль может отправляться в плавание: " +
            "${(isDamaged == IS_DAMAGED && numberOfCrew >= MIN_NUMBER_OF_CREW &&
                    numberOfCrew <= MAX_NUMBER_OF_CREW && numberOfBoxes > MIN_NUMBER_OF_BOXES) ||
                    (numberOfCrew == MAX_NUMBER_OF_CREW && numberOfBoxes >= MIN_NUMBER_OF_BOXES && 
                            isFavorable == IS_FAVORABLE)}")
}

const val IS_DAMAGED = false
const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val MIN_NUMBER_OF_BOXES = 50
const val IS_FAVORABLE = true