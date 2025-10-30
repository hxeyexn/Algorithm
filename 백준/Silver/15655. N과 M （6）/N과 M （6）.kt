fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()
    
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val numbers = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    val progression = mutableListOf<Int>()
    
    numbers.sort()
    backtracking(N, M, start = 0, progression, numbers, sb)
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun backtracking(
    n: Int, 
    m: Int, 
    start: Int,
    progression: MutableList<Int>,
    numbers: MutableList<Int>,
    sb: StringBuilder,
) {
    if (progression.size == m) {
        sb.append(progression.joinToString(" "))
        sb.append("\n")
        return
    }
    
    for (i in start until n) {
        progression.add(numbers[i])
        backtracking(n, m, i + 1, progression, numbers, sb)
        progression.removeLast()
    }
}