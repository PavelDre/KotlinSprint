package org.example.lesson_4

fun main() {

    val reservedTablesToday =  13
    val reservedTablesTomorrow = 9

    println("Доступность столиков сегодня: ${reservedTablesToday < NUMBER_OF_TABLES}\n" +
            "Доступность столиков завтра: ${reservedTablesTomorrow < NUMBER_OF_TABLES}")
}

const val NUMBER_OF_TABLES = 13