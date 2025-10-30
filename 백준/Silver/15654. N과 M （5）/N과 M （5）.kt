fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()
    
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val numbers = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    val visited = BooleanArray(N) { false }
    val progression = mutableListOf<Int>()
    
    numbers.sort()
    backtracking(N, M, numbers, visited, progression, sb)
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun backtracking(
    n: Int,
    m: Int, 
    numbers: MutableList<Int>,
    visited: BooleanArray,
    progression: MutableList<Int>,
    sb: StringBuilder,
) {
    if (progression.size == m) {
        sb.append(progression.joinToString(" "))
        sb.append("\n")
        return
    }
    
    for (i in 0 until n) {
        if (!visited[i]) {
            visited[i] = true
            progression.add(numbers[i])
            
            backtracking(n, m, numbers, visited, progression, sb)
            
            visited[i] = false
            progression.removeLast()
        }
    }
}
