import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, S) = br.readLine().split(" ").map { it.toInt() }
    
    val input = StringTokenizer(br.readLine())
    val numbers = IntArray(N) { input.nextToken().toInt() }
    var count = 0
    
    fun backtracking(
        index: Int,
        sum: Int,
    ) { 
        if (index == N) {
            if (sum == S) count++
            return
        }
        
        backtracking(index + 1, sum + numbers[index])
        backtracking(index + 1, sum)
    }
    
    backtracking(index = 0, sum = 0)
    if (S == 0) count--
    print(count)
}