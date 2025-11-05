import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val st = StringTokenizer(br.readLine())
    
    val numbers = IntArray(N + 1) { 0 }
    val prefixSum = IntArray(N + 1) { 0 }
    
    for (i in 1 .. N) {
        numbers[i] = st.nextToken().toInt()
        prefixSum[i] = numbers[i] + prefixSum[i - 1]
    }
    
    repeat(M) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        
        val sum = prefixSum[j] - prefixSum[i - 1]
        bw.write("$sum")
        bw.newLine()
    }
    
    bw.flush()
    bw.close()
}