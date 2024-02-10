package org.example.lesson_1

fun main() {

    val year: Short = 1961
    var hour: Byte = 9
    var minute: Byte = 7
    val n = 2

    println(year)
    println(hour.toString().padStart(n, '0'))
    println(minute.toString().padStart(n, '0'))

    hour = 10
    minute = 55

    print(hour)
    print(":")
    print(minute)

}