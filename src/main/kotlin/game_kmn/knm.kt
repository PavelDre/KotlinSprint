package org.example.game_kmn

import java.util.concurrent.TimeUnit

fun main() {
    val nameUser = toGreeting()
    toGame(nameUser)
    println("Спасибо за игру, $nameUser! Удачи!")
}

fun toGreeting(): String {
    println("Привет! Давай знакомиться!\nЯ компьютер, а теба как зовут?")
    val nameUser = readln()
    TimeUnit.SECONDS.sleep(1)

    if (nameUser.equals("Евгения", ignoreCase = true) || nameUser.equals("Женя", ignoreCase = true))
        println("Паша просил тебе передать что он очень сильно тебя любит! :-*")

    println("$nameUser, давай поиграем в игру?")
    return nameUser
}

fun toGame(nameUser: String) {

    do {
        println("1 - Камень\n2 - Ножницы\n3 - Бумага\nНапиши цифру, что ставишь ты?")
        val resultUser = PossibleMove.entries[readln().toInt() - 1]
        val resultPK = PossibleMove.entries.toTypedArray().random()

        TimeUnit.SECONDS.sleep(1)

        println("""
            $nameUser - ${resultUser.title}
            Компьютер - ${resultPK.title}
        """.trimIndent()
        )

        val resultGaming = when {
            (resultUser.id == resultPK.id) -> "Боевая ничья!"
            (resultUser.id == 3 && resultPK.id == 1) -> "Эх, ты победил(а)... Поздравляю!"
            (resultUser.id == 1 && resultPK.id == 3) -> "Ура! Я победил!"
            (resultUser.id > resultPK.id) -> "Ура! Я победил!"
            else -> "Эх, ты победил(а)... Поздравляю!"
        }
        println("$resultGaming\n\n Сыграем еще разок?\n1 - Да\n2 - Нет")

    } while (readln().toInt() == 1)
}

enum class PossibleMove (val id: Int, val title: String) {
    STONE(1, "Камень"),
    SCISSORS(2, "Ножницы"),
    PAPER(3, "Бумага"),
}
