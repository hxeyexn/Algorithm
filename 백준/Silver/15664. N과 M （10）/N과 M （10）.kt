fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()
    
    // N과 M을 읽음
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    
    // N개의 수를 읽고 정렬
    val numbers = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    numbers.sort()
    
    // 수열 정의
    val progression = mutableListOf<Int>()
    
    // 수열들을 담을 set 정의
    val result = mutableSetOf<List<Int>>()
    
    // backtracking 호출
    backtracking(N, M, start = 0, progression, result, numbers)
    
    // write
    for (r in result) {
        sb.append(r.joinToString(" "))
        sb.append("\n")
    }
    
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

// 방문 여부를 확인해야 하는가? -> 조합이라 필요 없을 듯
// start가 필요한가? 필요함
// 하나의 수열
// 수열들을 담을 set(중복 수열 제거)
fun backtracking(
    n: Int,
    m: Int,
    start: Int,
    progression: MutableList<Int>,
    result: MutableSet<List<Int>>,
    numbers: MutableList<Int>,
) {
    if (progression.size == m) {
        result.add(progression.toList())
        return
    }
    
    for (i in start until n) {
        progression.add(numbers[i])
        backtracking(n, m, i + 1, progression, result, numbers)
        progression.removeLast()
    }
}