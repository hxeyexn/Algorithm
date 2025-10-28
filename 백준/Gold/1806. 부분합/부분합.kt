import kotlin.math.min
import kotlin.math.abs

fun main() {
    val br = System.`in`.bufferedReader()
    // N(수열의 길이)과 S(합)를 읽는다
    val (N, S) = br.readLine().split(" ").map { it.toInt() }

    // 수열을 읽는다(공백 제거)
    val progression = br.readLine().split(" ").map { it.toInt() }
    
    // 투포인터를 활용한다
    // start와 end는 0으로 시작한다
    var (start, end) = 0 to 0
    
    // 현재 합은 sum으로 정의하며 0으로 초기화한다
    var sum = 0
    
    // 최소의 길이(min)를 구해야 하고, 불가능하면 0을 출력
    var minLength = Int.MAX_VALUE
    var currentLength = 0
    
    // while 문 사용 -> 종료 조건: end == N
    while(true) {
        // 합이 S 이상이면 현재 길이와 min을 비교해 갱신
        if (sum >= S) minLength = min(minLength, currentLength)
        
        // 크거나 같으면 start를 1 증가, sum 갱신
        // 작으면 end를 1 증가, sum 갱신
        if (sum >= S) {
            sum -= progression[start++]
        } else {
            if (end == N) break
            sum += progression[end++]
        }
        
        currentLength = abs(start - end)
    }

    if (minLength != Int.MAX_VALUE) print(minLength)
    else print(0)
}