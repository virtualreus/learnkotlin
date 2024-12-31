package caesar

fun caesarEncode(string: String, step: Int): String {
    var result: String = ""
    for (i in 0 until string.length) {
        val temp = string[i]
        result += if (temp == ' ') ' '
        else temp + step
    }

    return result
}


fun main() {
    val test = "abcdef test"
    val result = caesarEncode(test, 2)
    println(result)
}