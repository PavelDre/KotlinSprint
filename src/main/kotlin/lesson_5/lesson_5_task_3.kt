package org.example.lesson_5

fun main() {

    val correctNumber1 = 23
    val correctNumber2 = 4

    println("Привет, это лохотрон, ой, ЛОТОТРОН!\n" +
            "Для победы тебе необходимо угадать 2 загаданных мною числа в диапазоне от 0 до 42!\n" +
            "Введи первое число: ")

    val numberUser1 = readln().toInt()

    println("Теперь введи второе число: ")

    val numberUser2 = readln().toInt()

    if ((numberUser1 == correctNumber1 && numberUser2 == correctNumber2) ||
        (numberUser1 == correctNumber2 && numberUser2 == correctNumber1))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (numberUser1 == correctNumber1 || numberUser1 == correctNumber2 ||
        numberUser2 == correctNumber1 || numberUser2 == correctNumber2)
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")
}