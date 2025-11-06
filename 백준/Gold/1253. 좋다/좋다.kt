import java.util.StringTokenizer

fun main() {
    // 목표
    // N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있는 수의 개수
    // 수의 위치가 다르면 값이 같아도 다른 수
    
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    
    val input = StringTokenizer(br.readLine())
    val numbers = IntArray(N) { input.nextToken().toInt() }
    numbers.sort()
    
    // 수의 위치가 다르면 값이 같아도 다른 수
    val result = mutableSetOf<Pair<Int, Int>>()
    
    for (i in 0 until N) {
        var start = 0
        var end = N - 1
    
        while (start < end) {
            // 자기 자신을 제외
            if (start == i) {
                start++
                continue
            }
            if (end == i) {
                end--
                continue
            }
            
            val sum = numbers[start] + numbers[end]
            
            when {
                sum > numbers[i] -> end--
                sum < numbers[i] -> start++
                else -> {
                    result.add(numbers[i] to i)
                    end--
                }
            }
        }
    }
    
    print(result.count())
}