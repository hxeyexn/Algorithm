fun main() {
    val br = System.`in`.bufferedReader()
    val (N, K) = br.readLine().split(" ").map { it.toInt() }
    val temperature = br.readLine().split(" ").map { it.toLong() }
    val prefixSum = LongArray(N + 1) { 0 }
    
    // 1. 누적합 만들기
    for (i in 1 .. N) {
        prefixSum[i] = prefixSum[i - 1] + temperature[i - 1]
    }
    
    var start = 0
    var end = K
    var max = Long.MIN_VALUE
    
    // 2. 구간합 계산 후 max 변경
    do {
        val newSum = prefixSum[end++] - prefixSum[start++]
        if (max < newSum) max = newSum
    } while (end <= N)
    
    print(max)
}