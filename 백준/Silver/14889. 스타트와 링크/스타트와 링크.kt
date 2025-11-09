import kotlin.math.abs
import kotlin.math.min

var min = Int.MAX_VALUE
val br = System.`in`.bufferedReader()
val N = br.readLine().toInt()
val ability = Array(N) { br.readLine().split(" ").map { it.toInt() } }

fun main() {
    // N명이고 N은 짝수
    // N / 2명으로 이루어진 스타트 팀과 링크 팀으로 사람들을 나눠야 함
    val visited = BooleanArray(N) { false }
    
    backtracking(index = 0, depth = 0, visited)
    print(min)
}

fun backtracking(
    index: Int,
    depth: Int,
    visited: BooleanArray,
) {
    if (min == 0) return
    
    if (depth == N / 2) {
        var startScore = 0
        var linkScore = 0
        
        for (i in 0 ..< N - 1) {
            for (j in i + 1 ..< N) {
                if (visited[i] && visited[j]) {
                    startScore += ability[i][j] + ability[j][i]
                }
                if (!visited[i] && !visited[j]) {
                    linkScore += ability[i][j] + ability[j][i]
                }
            }
        }
        
        val sub = abs(startScore - linkScore)
        min = min(min, sub)
        
        return
    }
    
    for (i in index ..< N) {
        if (visited[i]) continue
        
        visited[i] = true
        backtracking(index = i + 1, depth = depth + 1, visited)
        visited[i] = false
    }
}