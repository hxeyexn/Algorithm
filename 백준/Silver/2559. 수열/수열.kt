import java.util.StringTokenizer
import kotlin.math.max

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, K) = br.readLine().split(" ").map { it.toInt() }
    val progression = IntArray(N) { 0 }
    var maxSum = 0
    var currentSum = 0
    
    val input = StringTokenizer(br.readLine())
    repeat(N) {
        progression[it] = input.nextToken().toInt()
        
        if (it < K) currentSum += progression[it]
    }
    maxSum = currentSum
    
    var start = 1
    var end = K
    
    while (end < N) {
        currentSum = currentSum - progression[start - 1] + progression[end]
        maxSum = max(maxSum, currentSum)
        
        start++
        end++
    }
    
    print(maxSum)
}