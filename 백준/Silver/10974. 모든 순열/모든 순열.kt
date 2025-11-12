val sb = StringBuilder()
val bw = System.out.bufferedWriter()

fun main() {
    val N = readln().toInt()
    val visited = BooleanArray(N + 1) { false }
    val progression = ArrayList<Int>()
    
    backtracking(N, visited, progression)
    
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun backtracking(
    n: Int,
    visited: BooleanArray,
    progression: ArrayList<Int>,
    
) {
    if (progression.size == n) {
        sb.appendLine(progression.joinToString(" "))
        return
    }
    
    for (i in 1 .. n) {
        if (visited[i]) continue
        
        visited[i] = true
        progression.add(i)
        
        backtracking(n, visited, progression)
        
        progression.removeLast()
        visited[i] = false
    }
}