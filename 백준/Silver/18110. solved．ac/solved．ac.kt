import kotlin.math.*

fun main() {
    val n = readln().toInt()
    val input = MutableList(n) { readln().toInt() }
    input.sort()

    if (n == 0) { print("0") }
    else {
        val count = (n * 0.15).roundToInt()
        val score = input.drop(count).dropLast(count)
        val avg = score.sum().toDouble() / score.size

        print("${avg.roundToInt()}")
    }
}