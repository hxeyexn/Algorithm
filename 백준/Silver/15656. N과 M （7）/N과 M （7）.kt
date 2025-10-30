fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()
    
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val numbers = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    val progression = mutableListOf<Int>()
    
    numbers.sort()
    backtracking(N, M, numbers, progression, sb)
    
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun backtracking(
    n: Int, 
    m: Int, 
    numbers: MutableList<Int>,
    progression: MutableList<Int>,
    sb: StringBuilder,
) {
    if (progression.size == m) {
        sb.append(progression.joinToString(" "))
        sb.append("\n")
        return
    }
    
    for (i in 0 until n) {
        progression.add(numbers[i])
        backtracking(n, m, numbers, progression, sb)
        progression.removeLast()
    }
}