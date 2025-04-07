fun main() {
    val N = readln().toInt()
    val prefixSum = IntArray(N + 1) { 0 }
    
    for (i in 1 .. N) {
        prefixSum[i] = prefixSum[i - 1] + i
    }
    
    var count = 0
    var start = 0
    var end = 1
    
    while (end <= N) {
        val sum = prefixSum[end] - prefixSum[start]
        when {
            sum < N -> end++
            sum == N -> {
                count++
                start++
            }
            sum > N -> start++
        }
    }
    
    print(count)
}