import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()
    
    val (N, M) = br.readLine().split(" ").map { it.toInt() }

    val input = StringTokenizer(br.readLine())
    val numbers = IntArray(N) { input.nextToken().toInt() }
    numbers.sort()
    
    val result = mutableSetOf<List<Int>>()   
    val progression = ArrayList<Int>() 
    
    backtracking(N, M, numbers, result, progression)
    
    result.forEach {
        sb.append(it.joinToString(" "))
        sb.append("\n")
    }
    
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun backtracking(
    n: Int,
    m: Int,
    numbers: IntArray,
    result: MutableSet<List<Int>>,
    progression: ArrayList<Int>,
) {
    if (progression.size == m) {
        result.add(progression.toList())
        return
    }
    
    for (i in 0 until n) {
        progression.add(numbers[i])
        backtracking(n, m, numbers, result, progression)
        progression.removeLast()
    }
}