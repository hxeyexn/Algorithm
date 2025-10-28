import java.io.BufferedWriter

fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val bw = System.out.bufferedWriter()
    
    val visited = BooleanArray(N) { false }
    var progression = mutableListOf<Int>()
    
    // visited으로는 오름차순 정렬을 할 수 없음
    dfs(N, M, start = 1, count = 0, bw, progression)
    
    bw.flush()
    bw.close()
}

fun dfs(
    n: Int, 
    m: Int, 
    start: Int,
    count: Int, 
    bw: BufferedWriter,
    progression: MutableList<Int>,
) { 
    if (count == m) {
        bw.write("${progression.joinToString(" ")}\n")
        return
    }
    
    for (i in start .. n) {
        progression.add(i)
        dfs(n, m, i + 1, count + 1, bw, progression)
        progression.removeLast()
    }
}