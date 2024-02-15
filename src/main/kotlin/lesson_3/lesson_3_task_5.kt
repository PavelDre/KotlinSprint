package org.example.lesson_3

fun main() {

    val lineStroke = "D2-D4;0"

    val whereFromGo = (lineStroke.split("-", ";"))[0]
    val whereGo = (lineStroke.split("-", ";"))[1]
    val numberStroke = (lineStroke.split("-", ";"))[2]

    println(whereFromGo)
    println(whereGo)
    println(numberStroke)

}
