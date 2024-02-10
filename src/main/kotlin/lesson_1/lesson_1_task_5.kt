package org.example.lesson_1

fun main() {

    val seconds: Short = 6480
    val minutes = seconds / SECONDS_IN_MINUTE
    val hours = minutes / MINUTES_IN_HOUR
    val resultHours = String.format("%02d", hours)
    val resultMinutes = String.format("%02d", (minutes - hours * MINUTES_IN_HOUR))
    val resultSeconds = String.format("%02d", (seconds - (minutes * SECONDS_IN_MINUTE)))

    println("$resultHours:$resultMinutes:$resultSeconds")
}

const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOUR = 60