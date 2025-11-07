fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M1) = br.readLine().split(" ").map { it.toInt() }
    val A = Array(N) { br.readLine().split(" ").map { it.toInt() } }

    val (M2, K) = br.readLine().split(" ").map { it.toInt() }
    val B = Array(M2) { br.readLine().split(" ").map { it.toInt()} }

    val matrix = Array(N) { IntArray(K) { 0 } }

    for (k in 0..< K) {
        for (m in 0 ..< M1) {
            for (n in 0 ..< N) {
                matrix[n][k] += B[m][k] * A[n][m]
            }
        }
    }

    matrix.forEach {
        println(it.joinToString(" "))
    }
}