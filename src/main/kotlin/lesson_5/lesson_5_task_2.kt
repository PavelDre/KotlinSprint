package org.example.lesson_5

import java.util.Calendar

fun main() {
    print("Здравствуйте, введите пожалуйста Ваш год рождения: ")
    val userYear = readln().toInt()

    val currentYear = Calendar.getInstance().get(Calendar.YEAR).toInt()

    val massageUser = if (currentYear - userYear >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"

    println(massageUser)
}

const val AGE_OF_MAJORITY = 18