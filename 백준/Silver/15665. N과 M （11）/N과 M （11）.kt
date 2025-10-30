fun main() {
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()
    
    val (N, M) = readln().split(" ").map { it.toInt() }
    val numbers = readln().split(" ").map { it.toInt() }.toMutableList()
    numbers.sort()
    
    val progression = mutableListOf<Int>()
    val result = mutableSetOf<List<Int>>()
    
    backtracking(N, M, numbers, progression, result)
    
    for (r in result) {
        sb.append(r.joinToString(" "))
        sb.append("\n")
    }
    
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

// 같은 수를 여러번 고를 수 있지만 수열은 중복되면 안됨
fun backtracking(
    n: Int,
    m: Int,
    numbers: MutableList<Int>,
    progression: MutableList<Int>,
    result: MutableSet<List<Int>>,
) {
    if (progression.size == m) {
        result.add(progression.toList())
        return
    }
    
    for (i in 0 until n) {
        progression.add(numbers[i])
        backtracking(n, m, numbers, progression, result)
        progression.removeLast()
    }
}
