fun main() {
    val t = readln().toInt()
    
    repeat(t) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        println("Case #${it + 1}: $a + $b = ${a + b}")
    }
}