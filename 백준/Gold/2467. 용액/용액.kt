import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.min

fun main() {
    val br = System.`in`.bufferedReader()
    
    // 전체 용액의 수
    val N = br.readLine().toInt()
    val input = StringTokenizer(br.readLine())
    val solutions = IntArray(N) { input.nextToken().toInt() }
    
    var start = 0
    var end = N - 1
    
    var minSum = Int.MAX_VALUE
    var (s, e) = 0 to 0
    
    while (start < end) {
        val sum = solutions[start] + solutions[end]
        if (minSum > abs(sum)) {
            minSum = abs(sum)
            s = start
            e = end
        }
        
        if (sum < 0) start++
        else end--
    }
    
    // 두 용액의 특성값을 오름차순으로 출력
    // 0에 가장 가까운 용액을 만들어내는 경우가 두 개 이상일 경우에는 그중 아무것이나
    print("${solutions[s]} ${solutions[e]}")
}