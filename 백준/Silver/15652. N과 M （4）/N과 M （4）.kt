fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val bw = System.out.bufferedWriter()
    val progression = mutableListOf<Int>()
    val sb = StringBuilder()
    
    backtracking(N, M, 1, progression, sb)
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun backtracking(
    n: Int, 
    m: Int,
    start: Int,
    progression: MutableList<Int>,
    sb: StringBuilder,
) {
    // 종료 조건
    if (progression.size == m) {
        // 수열 출력
        sb.append(progression.joinToString(" "))
        sb.append("\n")
        return
    }
    
    for (i in start .. n) {
        progression.add(i)
        backtracking(n, m, i, progression, sb)
        progression.removeLast()
    }
}
