import java.util.PriorityQueue
import kotlin.math.abs

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt() 
    val sb = StringBuilder()
    
    // x가 0이 아니라면 배열에 x라는 값을 추가
    // x가 0이라면 배열에서 절댓값이 가장 작은 값을 출력하고 그 값을 제거
    val priorityQueue = PriorityQueue<Int>(compareBy({ abs(it) }, { it })) 
    
    for (i in 1 .. N) {
        val x = br.readLine().toInt()
        
        if (x != 0) {
            priorityQueue.add(x)
            continue
        }
        
        if (priorityQueue.isEmpty()) {
            sb.appendLine("0")
            continue
        }
        
        sb.appendLine("${priorityQueue.remove()}")
    }
    
    print(sb)
}