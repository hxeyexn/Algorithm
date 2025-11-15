import java.util.StringTokenizer
import kotlin.math.max

fun main() {
    // 숫자가 나왔던 마지막 Idx 기억하기
    // key를 숫자, value를 idx로 해서 덮어쓰기
    val br = System.`in`.bufferedReader()
    val (N, K) = br.readLine().split(" ").map { it.toInt() }
    val input = StringTokenizer(br.readLine())
    val progression = IntArray(N) { input.nextToken().toInt() }
    val count = mutableMapOf<Int, Int>()
    
    var start = 0
    var end = 0
    
    var maxLength = 0
    
    while (end < N) {
        val number = progression[end]
        count[number] = count.getOrDefault(number, 0) + 1
        
        while (count.getValue(number) > K)  {
            val leftNumber = progression[start]
            count[leftNumber] = count.getValue(leftNumber) - 1
            start++
        }
        
        maxLength = max(maxLength, end - start + 1)
        end++
    }
    
    print(maxLength)
}