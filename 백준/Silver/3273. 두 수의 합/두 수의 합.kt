import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val progression = IntArray(n) { 0 }
    
    val input = StringTokenizer(br.readLine())
    repeat(n) {
        progression[it] = input.nextToken().toInt()
    }
    
    val x = br.readLine().toInt()
    
    // 수열 정렬
    progression.sort()
    
    var start = 0
    var end = n - 1
    var count = 0
    
    // 합이 x보다 크다면 end를 1 줄임
    // 합이 x보다 작다면 start를 1 키움
    // 합이 x와 동일하면 start를 1 키우고 end를 1 줄임
    while (start < end) {
        val sum = progression[start] + progression[end]
        
        when {
            sum > x -> end--
            sum < x -> start++
            else -> {
                count++
                start++
                end--
            }
        }
    }
    
    print("$count")
}