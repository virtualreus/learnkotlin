package guessnumber

import kotlin.random.Random

const val LOWER_BOUND: Int = 0
const val TOP_BOUND: Int = 10

fun main() {


    println("Попробуйте угадать число в диапозоне от $LOWER_BOUND до $TOP_BOUND")
    val guessedNumber: Int = (LOWER_BOUND..TOP_BOUND).random()
    while (true) {
        print("Введите число: ")
        val number = readln().toIntOrNull()


        if (number == null) {
            println("Вы ввели какую то херотень вместо числа")
            continue
        }

        if (number !in LOWER_BOUND..TOP_BOUND) {
            println("Введите число в указанном диапозоне")
            continue
        }

        if (number > guessedNumber) {
            println("Введеное число больше загаданного")
        }

        else if (number < guessedNumber) {
            println("Введеное число меньше загаданного")
        }

        else {
            println("Вы угадали число!")
            break
        }
    }



}