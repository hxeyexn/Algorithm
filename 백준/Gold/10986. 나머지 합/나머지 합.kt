import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }

    val input = br.readLine().split(" ").map { it.toLong() }
    val progression = LongArray(N + 1) { 0L }

    var count = 0L
    val rest = LongArray(M + 1) { 0L }

    (1 .. N).forEach {
        progression[it] = progression[it - 1] + input[it - 1]
        progression[it] = progression[it] % M
    }

    for (i in 1 .. N) {
        if (progression[i] == 0L) count++
        
        val idx = progression[i].toInt()
        rest[idx] = rest[idx] + 1
    }

    for (r in rest) {
        if (r == 0L) continue

        count += r * (r - 1) / 2
    }

    print(count)
}