fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()
    
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val numbers = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    val progression = mutableListOf<Int>()
    val result = mutableSetOf<List<Int>>()
    val visited = BooleanArray(N) { false }
    
    numbers.sort()
    backtracking(N, M, progression, result, numbers, visited)
    
    for (r in result) {
        sb.append(r.joinToString(" "))
        sb.append("\n")
    }
    
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun backtracking(
    n: Int,
    m: Int,
    progression: MutableList<Int>,
    result: MutableSet<List<Int>>,
    numbers: MutableList<Int>,
    visited: BooleanArray,
) {
    if (progression.size == m) {
        result.add(progression.toList())
        return
    }
    
    for (i in 0 until n) {
        if (!visited[i]) {
            visited[i] = true
            progression.add(numbers[i])
            
            backtracking(n, m, progression, result, numbers, visited)
            
            visited[i] = false
            progression.removeLast()
        }
    }
}
