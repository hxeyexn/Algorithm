import kotlin.math.*

fun main() {
    var (a, b) = readln().split(" ").map { it.toInt() }

    val gcd = gcd(a, b)
    val lcd = a * b / gcd
    
    println("$gcd\n$lcd")
}

fun gcd(a: Int, b: Int): Int {
    if (b == 0) return a
    return gcd(b, a % b)
}