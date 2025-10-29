import java.io.BufferedWriter

fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val bw = System.out.bufferedWriter()
    val progression = mutableListOf<Int>()
    backtracking(N, M, progression, bw)
    
    bw.flush()
    bw.close()
}

fun backtracking(
    n: Int, 
    m: Int,
    progression: MutableList<Int>,
    bw: BufferedWriter,
) {
    // 종료 조건 
    if (progression.size == m) {
        // 수열 출력
        bw.write(progression.joinToString(" "))
        bw.newLine()
        return 
    }
    
    for (i in 1 .. n) {
        progression.add(i)
        backtracking(n, m, progression, bw)
        progression.removeLast()
    }
}