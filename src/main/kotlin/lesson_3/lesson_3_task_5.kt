package org.example.lesson_3

fun main() {

    val lineStroke = "D2-D4;0"
    val resultLineStroke = lineStroke.split("-", ";")

    println(resultLineStroke[0])
    println(resultLineStroke[1])
    println(resultLineStroke[2])

}
