fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val M = br.readLine().toInt()
    val materials = br.readLine().split(" ").map { it.toInt() }
    var count = 0

    for (start in 0 ..< N - 1) {
        var end = start + 1
        while (end < N) {
            val sum = materials[start] + materials[end++]
            if (sum == M) count++
        }
    }

    print(count)
}