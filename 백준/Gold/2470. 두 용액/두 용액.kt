import kotlin.math.abs

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val solutions = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    solutions.sort()
    
    var value = Int.MAX_VALUE
    var start = 0
    var end = N - 1
    
    var mix = 0 to 0
    
    while(start < end) {
        val sum = solutions[start] + solutions[end]
        if (sum == 0) {
            mix = solutions[start] to solutions[end]
            break
        }
        
        if (value > abs(sum)) {
            value = abs(sum)
            mix = solutions[start] to solutions[end]
        }
        
        // 더해서 마이너스이면 start 증가
        // 더해서 플러스면 end 감소
        if (sum < 0) {
            start++
        } else {
            end--
        }
    }

    print("${mix.first} ${mix.second}")
}