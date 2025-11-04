import java.util.StringTokenizer
import kotlin.math.max

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, K) = br.readLine().split(" ").map { it.toInt() }
    
    val input = StringTokenizer(br.readLine())
    val progression = IntArray(N) { input.nextToken().toInt() }
    
    var currentSum = (0 until K).sumOf { progression[it] }
    var maxSum = currentSum
    
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