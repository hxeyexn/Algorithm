fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val T = br.readLine().toInt()
    
    repeat(T) {
        val N = br.readLine().toInt()
        val X = br.readLine().split(" ").map { it.toInt() }
        
        // 누적 합
        val prefixSum = IntArray(N + 1) { 0 }
        for (i in 1 .. N) {
            prefixSum[i] = prefixSum[i - 1] + X[i - 1]
        }
        
        // maximum subarray 구하기
        var max = Int.MIN_VALUE
        
        for (start in 0 .. N) {
            for (end in start + 1 .. N) {
                val sum = prefixSum[end] - prefixSum[start]
                if (max < sum) max = sum
            }
        }
        
        bw.write("$max\n")
    }
    
    bw.flush()
    bw.close()
}