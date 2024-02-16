package org.example.lesson_5

fun main() {

    val number1 = 3
    val number2 = 6

    println("Для успешной авторизации, докажите что вы не бот.\n" +
            "Напишите результат выражения: $number1+$number2")

    if (readln().toInt() == number1 + number2) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}
