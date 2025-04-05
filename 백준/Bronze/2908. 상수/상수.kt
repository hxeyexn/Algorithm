import kotlin.math.max

fun main() {
    val (A, B) = readln().split(" ").map { it.reversed().toInt() }
    println("${max(A, B)}")
}