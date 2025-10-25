import kotlin.math.min

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val progression = IntArray(N) { br.readLine().toInt() }
    progression.sort()

    var start = 0
    var end = 1
    var min = Int.MAX_VALUE
    
    // start와 end가 같아진다면? end를 증가시켜야 함
    // end가 N에 닿았을 때 start가 움직일 수도 있음
    while (end < N) {
        if (start == end) {
            end++
            continue
        }
        
        val diff = progression[end] - progression[start]
        
        if (diff >= M) {
            min = min(diff, min)
            start++
        } else {
            end++
        }
    }
    
    if (min != Int.MAX_VALUE) print(min)
}