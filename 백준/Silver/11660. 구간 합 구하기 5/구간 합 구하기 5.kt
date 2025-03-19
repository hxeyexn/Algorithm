fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    
    val array = Array(n + 1) { IntArray(n + 1) { 0 } }
    for (i in 1..n) {
        val input = br.readLine().split(" ").map { it.toInt() }
        
        for (j in 1..n) {
            array[i][j] = input[j - 1]
        }
    }
    
    val sum = Array(n + 1) { IntArray(n + 1) { 0 } }
    for (i in 1..n) {
        for (j in 1..n) {
            sum[i][j] = array[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1]
        }
    }
    
    repeat(m) {
        val (x1, y1, x2, y2) = br.readLine().split(" ").map { it.toInt() }
        val prefixSum = sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1]
        bw.write("${prefixSum}\n")
    }
    
    bw.flush()
    bw.close()
}