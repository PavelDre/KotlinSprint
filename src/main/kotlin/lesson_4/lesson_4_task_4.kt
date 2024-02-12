package org.example.lesson_4

fun main() {

    val dayOfTraining = 5
    val indexDay = dayOfTraining % INDEX_DAY == 0

    val exercisesHands = true
    val exercisesLeg = false
    val exercisesBack = false
    val exercisesPress = true

    println("""
        $indexDay
        Упражнения для рук:     ${exercisesHands != indexDay}
        Упражнения для ног:     ${exercisesLeg != indexDay}
        Упражнения для спины:   ${exercisesBack != indexDay}
        Упражнения для пресса:  ${exercisesPress != indexDay}        
    """.trimIndent())
}

const val INDEX_DAY = 2