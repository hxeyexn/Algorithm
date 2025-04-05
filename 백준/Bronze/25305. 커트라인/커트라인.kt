fun main() {
    val (N, k) = readln().split(" ").map { it.toInt() }
    val scores = readln().split(" ").map { it.toInt() }.toIntArray()
    scores.sortDescending()
    println(scores[k - 1])
}