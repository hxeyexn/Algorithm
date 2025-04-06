fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val input = br.readLine().split(" ").map { it.toInt() }
    val prefixSum = IntArray(N + 1) { 0 }
    
    for (i in 1 .. N) {
        prefixSum[i] = prefixSum[i - 1] + input[i - 1]
    }
    
    repeat(M) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        val sum = prefixSum[j] - prefixSum[i - 1] 
        bw.write("$sum\n")
    }
    
    bw.flush()
    bw.close()
}