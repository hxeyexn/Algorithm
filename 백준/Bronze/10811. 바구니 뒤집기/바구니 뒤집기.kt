fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val baskets = (1 .. N).map { it }.toIntArray()
    
    repeat(M) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        baskets.reverse(i - 1, j)
    }
    
    print(baskets.joinToString(" "))
}