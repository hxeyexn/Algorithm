fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    
    val array = Array(n + 1) { IntArray(m + 1) { 0 } }

    for (i in 1..n) {
        val input = br.readLine().split(" ").map { it.toInt() }
        for (j in 1 .. m) {
            array[i][j] = input[j - 1]
        }
    }
    
    val k = br.readLine().toInt()
    val inputs = List(k) { br.readLine() }
    
    val sum = Array(n + 1) { IntArray(m + 1) { 0 } }
    
    for (i in 1..n) {
        for (j in 1..m) {
            sum[i][j] = array[i][j] + sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] 
        }
    }
    
    inputs.forEach {
        val (i, j, x, y) = it.split(" ").map { input -> input.toInt() }
        val prefixSum = sum[x][y] - sum[i - 1][y] - sum[x][j - 1] + sum[i - 1][j - 1]
        
        println(prefixSum)
    }
}