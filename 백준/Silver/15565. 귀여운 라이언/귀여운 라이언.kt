import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, K) = br.readLine().split(" ").map { it.toInt() }
    val input = StringTokenizer(br.readLine())
    val dolls = IntArray(N) { input.nextToken().toInt() }
    
    var start = 0
    var end = 0
    var minLength = Int.MAX_VALUE
    var lionCount = 0
    
    while (end < N) {
        if (dolls[end] == 1) lionCount++

        while (lionCount >= K) {
            if (dolls[start] == 1) lionCount--
            start++
            
            if (lionCount >= K) minLength = min(minLength, end - start + 1)
        }
        
        end++
    }
    
    if (minLength == Int.MAX_VALUE) print(-1) else print(minLength)
}