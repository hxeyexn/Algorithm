fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val bw = System.out.bufferedWriter()
    
    val visited = BooleanArray(N + 1) { false }
    val progression = mutableListOf<Int>()
    val result = mutableListOf<MutableList<Int>>()
    
    backtracking(N, M, count = 0, visited, progression, result)
    
    for (r in result) {
        bw.write("${r.joinToString(" ")}\n")
    }
    
    bw.flush()
    bw.close()
}

fun backtracking(
    n: Int,
    m: Int,
    count: Int, 
    visited: BooleanArray,
    progression: MutableList<Int>,
    result: MutableList<MutableList<Int>>,
) {
    if (count == m) {
        // 수열이 나중에 수정되어도 result에 담긴 리스트는 그 시점의 상태 그대로 유지되야 함
        result.add(progression.toMutableList())
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
                result,
            )
            
            visited[i] = false
            progression.removeLast()
        }
    }
}