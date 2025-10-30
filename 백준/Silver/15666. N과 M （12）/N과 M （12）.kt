fun main() {
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()
    
    val (N, M) = readln().split(" ").map { it.toInt() }
    val numbers = readln().split(" ").map { it.toInt() }.toMutableList()
    numbers.sort()
    
    val progression = mutableListOf<Int>()
    val result = mutableSetOf<List<Int>>()
    
    backtracking(N, M, numbers, start = 0, progression, result)
    
    for (r in result) {
        sb.append(r.joinToString(" "))
        sb.append("\n")
    }
    
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

// 같은 수를 여러 번 고를 수 있으며 수열은 오름차순이어야 함
// 같은 수를 여러 번 고르면 중복될 수 있음 -> set 활용
// 중복되는 수열을 여러 번 출력할 수 없음
// start 필요, visited 필요 없음
fun backtracking(
    n: Int,
    m: Int,
    numbers: MutableList<Int>,
    start: Int,
    progression: MutableList<Int>,
    result: MutableSet<List<Int>>,
) {
    if (progression.size == m) {
        result.add(progression.toList())
        return
    }
    
    for (i in start until n) {
        progression.add(numbers[i])
        backtracking(n, m, numbers, i, progression, result)
        progression.removeLast()
    }
}