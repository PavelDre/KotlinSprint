package org.example.lesson_5

fun main() {

    val minRandom = 0
    val maxRandom = 42
    val listCorrectNumber = listOf((minRandom..maxRandom).random(), (minRandom..maxRandom).random(), (minRandom..maxRandom).random())
    val listUserNumber = mutableListOf<Int>()

    println("Привет, это лохотрон, ой, ЛОТОТРОН!\n" +
            "Для победы тебе необходимо угадать 3 числа, загаданных мною случайным образом, которые находятся в диапазоне от $minRandom до $maxRandom!\n" +
            "Введи первое число: ")
    listUserNumber.add(readln().toInt())

    println("Введи второе число: ")
    listUserNumber.add(readln().toInt())

    println("Теперь введи третье число: ")
    listUserNumber.add(readln().toInt())

    println(listUserNumber)

    val listResult = listCorrectNumber.intersect(listUserNumber.toSet())

    when (listResult.count()) {
        3 -> println("Ты угадал все числа и выиграл джекпот!")
        2 -> println("Ты угадал два числа и получаешь крупный приз!")
        1 -> println("Ты угадал одно число. Получи свой утишительный приз!")
        else -> println("Неудача!")
    }

    println("Мною были загаданы числа: $listCorrectNumber")

}