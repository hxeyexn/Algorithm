fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val N = br.readLine().toInt()
    val levelInput = br.readLine().split(" ").map { it.toInt() }
    val level = IntArray(N + 2) { 0 }
    for (i in 1..N) {
        level[i] = levelInput[i - 1]
    }

    val mistake = IntArray(N + 1) { 0 }
    for (i in 1 ..< N) {
        if (level[i] > level[i + 1]) mistake[i] = mistake[i - 1] + 1
        else mistake[i] = mistake[i - 1]
    }
    mistake[N] = mistake[N - 1]

    val Q = br.readLine().toInt()

    for (q in 1..Q) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        bw.write("${mistake[y - 1] - mistake[x - 1]}\n")
    }

    bw.flush()
    bw.close()
}