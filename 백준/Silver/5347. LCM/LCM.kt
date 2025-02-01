fun main() {
    val n = readln().toInt()
    
    repeat(n) {
        val (a, b) = readln().split(" ").map { it.toLong() }
        println("${a * b / gcd(a, b)}")
    }
}

fun gcd(a: Long, b: Long): Long {
    if (b == 0L) return a
    return gcd(b, a % b)
}