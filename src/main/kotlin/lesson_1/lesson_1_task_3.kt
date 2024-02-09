package org.example.lesson_1

fun main() {

    val year: UShort = 1961u
    var hour: UByte = 9u
    var minute: UByte = 7u
    val n = 2

    println(year)
    println(hour.toString().padStart(n, '0'))
    println(minute.toString().padStart(n, '0'))

    hour = 10u
    minute = 55u

//    println("$hour:$minute")
    print(hour)
    print(":")
    print(minute)

}