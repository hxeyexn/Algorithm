import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, S) = br.readLine().split(" ").map { it.toInt() }
    
    val input = StringTokenizer(br.readLine())
    val progression = IntArray(N + 1) { 0 }
    
    for (i in 1 .. N) {
        progression[i] = input.nextToken().toInt()
    }
    
    var prefixSum = progression[1]
    var minLength = Int.MAX_VALUE
    
    var start = 1
    var end = 1
    
    while (true) {
        if (prefixSum < S) {
            if (end == N) break
            
            end++
            prefixSum += progression[end]
            continue
        }
        
        prefixSum -= progression[start]
        minLength = min(minLength, end - start + 1)
        start++
    }
    
    if (minLength == Int.MAX_VALUE) {
        print("0")
        return
    }
    
    print(minLength)
}