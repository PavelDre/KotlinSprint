package org.example.lesson_1

fun main() {

    val seconds: Short = 6480
    val minutes = seconds/60
    val hours = minutes/60
    val n = 2

    print(hours.toString().padStart(n, '0'))
    print(":")
    print((minutes - hours * 60).toString().padStart(n, '0'))
    print(":")
    print((seconds - (minutes * 60)).toString().padStart(n, '0'))
}