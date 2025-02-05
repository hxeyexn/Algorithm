fun main() {
    val t = readln().toInt()
    
    repeat(t) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        val gcd = gcd(a, b)
        val lcd = a * b / gcd
        println("$lcd $gcd")
    }
}

fun gcd(a: Int, b: Int): Int {
    if (b == 0) return a
    return gcd(b, a % b)
}