package org.example.kmn

fun main() {

    val nameUser = greeting()
    game(nameUser)
    println("Спасибо за игру, $nameUser! Удачи!")
}

fun greeting() :String {

    println("Привет! Давай знакомиться!\nЯ компьютер, а теба как зовут?\n")

    val nameUser = readln()
    Thread.sleep(1000)

    if (nameUser == "Евгения" || nameUser == "Женя")
        println("Паша просил тебе передать что он очень сильно тебя любит! :-*\n" +
                "$nameUser, давай поиграем в игру?")
    else  println("$nameUser, давай поиграем в игру?")
    return nameUser
}

fun game(nameUser: String) {

    var activeGame: Int

    do {
        println("1 - Камень\n2 - Ножницы\n3 - Бумага\nНапиши цифру, что ставишь ты?")
        val resultUser = readln().toInt()
        val resultPK = (1..3).random()
        Thread.sleep(1000)

        val resultGamesUser: String = when (resultUser) {
            1 -> "$nameUser - Камень"
            2 -> "$nameUser - Ножницы"
            else -> "$nameUser - Бумага"
        }
        println(resultGamesUser)

        val resultGamesPK: String = when (resultPK) {
            1 -> "Компьютер - Камень"
            2 -> "Компьютер - Ножницы"
            else -> "Компьютер - Бумага"
        }
        println(resultGamesPK)

        val resultGaming = when {
            (resultUser == resultPK) -> "Боевая ничья!"
            (resultUser == 3 && resultPK == 1) -> "Эх, ты победил(а)... Поздравляю!"
            (resultUser == 1 && resultPK == 3) -> "Ура! Я победил!"
            (resultUser > resultPK) -> "Ура! Я победил!"
            else -> "Эх, ты победил(а)... Поздравляю!"
        }
        println("$resultGaming\n\n Сыграем еще разок?\n1 - Да\n2 - Нет")
        activeGame = readln().toInt()
    } while (activeGame == 1)
}
