import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    
    // A를 오름차순 정렬한다
    val inputA = StringTokenizer(br.readLine())
    val A = IntArray(N) { inputA.nextToken().toInt() }
    A.sort()
    
    // B를 내림차순 정렬한다, 단 재배열하면 안되기 때문에 index를 기억하고 있는다.
    val inputB = StringTokenizer(br.readLine())
    val B = mutableMapOf<Int, Int>()
    
    var S = 0
    
    repeat(N) {
        val num = inputB.nextToken().toInt()
        B[it] = num
    }
    
    val newB = B.entries.sortedByDescending { it.value }
    
    repeat(N) {
        S += A[it] * newB[it].value
    }

    print(S)
}