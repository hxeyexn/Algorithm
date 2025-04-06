fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val numbers = br.readLine().split(" ").map { it.toInt() }
    val prefixSum = IntArray(N + 1) { 0 }
    
    for (i in 1 .. N) {
        prefixSum[i] = prefixSum[i - 1] + numbers[i - 1]
    }
    
    var start = 0
    var end = 1
    var count = 0 
    
    do {
        val sum = prefixSum[end] - prefixSum[start]
        
        when {
            sum < M -> end++
            sum == M -> {
                count++
                start++
            }
            else -> start++
        }
    } while (end <= N)
    
    print(count)
}