package calculator

fun divide(fl1: Float, fl2: Float): Float {
    if (fl2 == 0f) {
        return 0f
    }
    return fl1 / fl2
}


fun main() {
    val firstNumber: Float = readln().toFloat()
    val secondNumber: Float = readln().toFloat()

    val operation: String = readln()
    var result: Float
    when (operation) {
        "+" -> result = firstNumber + secondNumber
        "-" -> result = firstNumber - secondNumber
        "*" -> result = firstNumber * secondNumber
        "/" -> result = divide(firstNumber, secondNumber)
        else -> result = 0f;
    }

    println("$firstNumber $operation $secondNumber = $result")

}