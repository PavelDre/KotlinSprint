package org.example.lesson_5

fun main() {

    println("Для успешной авторизации, докажите что вы не бот.\n" +
            "Напишите результат выражения: 3+б")

    val result = readln().toInt()

    if (result == RESULT_ANTI_BOT) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}

const val RESULT_ANTI_BOT = 9