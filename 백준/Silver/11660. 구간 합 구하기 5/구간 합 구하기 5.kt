import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    
    val numbers = Array(N + 1) { IntArray(N + 1) { 0 } }
    val prefixSum = Array(N + 1) { IntArray(N + 1) { 0 } }
    
    for (i in 1 .. N) {
        val input = StringTokenizer(br.readLine())
        
        for (j in 1 .. N) {
            numbers[i][j] = input.nextToken().toInt()
            prefixSum[i][j] = numbers[i][j] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1]
        }
    }
    
    repeat(M) {
        val (x1, y1, x2, y2) = br.readLine().split(" ").map { it.toInt() }
        val sum = prefixSum[x2][y2] - prefixSum[x2][y1 - 1] - prefixSum[x1 - 1][y2] + prefixSum[x1 - 1][y1 - 1]
        bw.write("$sum")
        bw.newLine()
    }
    
    bw.flush()
    bw.close()
}