import kotlin.math.abs

fun main() {
    val br = System.`in`.bufferedReader()
    val numbers = List(10) { br.readLine().toInt() }
    val prefixSum = IntArray(11) { 0 }
    val gaps = IntArray(10) { 0 }
    
    for (i in 1 .. 10) {
        prefixSum[i] = prefixSum[i - 1] + numbers[i - 1]
    }
    
    for (j in 1 .. 10) {
        gaps[j - 1] = abs(100 - prefixSum[j])
    }
    
    val min = gaps.min()
    val gapIdx = gaps.indexOfFirst { it == gaps.min() }
    val scoreIdx = 
        if (gaps.count { it == min } == 1) gapIdx + 1
        else gapIdx + 2
    
    print(prefixSum[scoreIdx])
}