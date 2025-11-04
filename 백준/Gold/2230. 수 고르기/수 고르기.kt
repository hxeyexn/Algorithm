import kotlin.math.abs
import kotlin.math.min

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    
    val progression = IntArray(N) { br.readLine().toInt() }
    progression.sort()
    
    var start = 0
    var end = 0
    var minSub = Int.MAX_VALUE
    
    while (end < N) {
        if (start == end) {
            end++
            continue
        }
        
        val sub = abs(progression[start] - progression[end])
        
        if (sub < M) end++
        else {
            start++
            minSub = min(minSub, sub)
        }
    }
    
    print(minSub)
}