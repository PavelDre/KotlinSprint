package org.example.lesson_3

fun main() {

    var userSurname = "Андреева"
    val userName = "Татьяна"
    val userPatronymic = "Сергеевна"
    var userAge = 20

    println("$userSurname $userName $userPatronymic, $userAge")

    userSurname = "Сидорова"
    userAge = 22

    println("$userSurname $userName $userPatronymic, $userAge")
}