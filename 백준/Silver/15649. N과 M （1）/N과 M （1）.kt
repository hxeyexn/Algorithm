import java.io.BufferedWriter

fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val bw = System.out.bufferedWriter()
    
    val visited = BooleanArray(N + 1) { false }
    val progression = mutableListOf<Int>()
    
    backtracking(N, M, count = 0, visited, progression, bw)
    
    bw.flush()
    bw.close()
}

fun backtracking(
    n: Int,
    m: Int,
    count: Int, 
    visited: BooleanArray,
    progression: MutableList<Int>,
    bw: BufferedWriter,
) {
    if (count == m) {
        // 수열이 나중에 수정되어도 result에 담긴 리스트는 그 시점의 상태 그대로 유지되야 함
        bw.write("${progression.joinToString(" ")}\n")
        return
    }
    
    for (i in 1 .. n) {
        if (!visited[i]) {
            visited[i] = true
            progression.add(i)
            
            backtracking(
                n, 
                m, 
                count = count + 1, 
                visited, 
                progression,
                bw,
            )
            
            visited[i] = false
            progression.removeLast()
        }
    }
}