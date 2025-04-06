fun main() {
    val br = System.`in`.bufferedReader()

    val n = br.readLine().toInt()
    val input = br.readLine().split(" ").map { it.toLong() }

    val prefixSum = LongArray(n) { 0 }
    var tempSum = 0L
    
    for (i in 1 ..< n) {
        tempSum += input[i - 1]
        prefixSum[i] = prefixSum[i - 1] + tempSum * input[i]
    }
    
    print(prefixSum.last())
}