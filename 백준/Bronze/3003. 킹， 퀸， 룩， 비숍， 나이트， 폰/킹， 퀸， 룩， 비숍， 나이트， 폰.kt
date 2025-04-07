fun main() {
    val pieces = intArrayOf(1, 1, 2, 2, 2, 8)
    val input = readln().split(" ").map { it.toInt() }
    val result = IntArray(6) { 0 }
    
    for (i in 0 ..< input.size) {
        result[i] = pieces[i] - input[i]
    }
    
    print(result.joinToString(" "))
}