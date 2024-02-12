package org.example.lesson_3

fun main() {

    val lineStroke = "D2-D4;0"

    val whereFromGo = lineStroke.substringBefore("-")
    val whereGo = lineStroke.substringAfter("-").substringBefore(";")
    val numberStroke = lineStroke.substringAfter(";")

    println(whereFromGo)
    println(whereGo)
    println(numberStroke)
}
