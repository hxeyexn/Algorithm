fun main() {
    val br = System.`in`.bufferedReader()
    val (N, K) = br.readLine().split(" ").map { it.toInt() }
    val temp = br.readLine().split(" ").map { it.toInt() }
    
    var start = 1
    var end = K
    var prefixSum = (0 until K).sumOf { temp[it] }
    var max = prefixSum
    
    while (end < N) {
        val sum = prefixSum - temp[start - 1] + temp[end]
        prefixSum = sum
        
        if (max < sum) max = sum
        start++
        end++
    }
    
    print(max)
}