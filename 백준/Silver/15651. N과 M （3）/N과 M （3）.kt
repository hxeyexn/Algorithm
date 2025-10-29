fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()
    val progression = mutableListOf<Int>()
    backtracking(N, M, progression, sb)
    
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun backtracking(
    n: Int, 
    m: Int,
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
    
    for (i in 1 .. n) {
        progression.add(i)
        backtracking(n, m, progression, sb)
        progression.removeLast()
    }
}