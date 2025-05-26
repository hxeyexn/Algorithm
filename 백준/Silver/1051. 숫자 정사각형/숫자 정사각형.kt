import kotlin.math.min

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    
    val board = Array(N) { br.readLine().map { it.digitToInt() }.toIntArray() }
    var maxD = 0
    
    for (i in 0 ..< N) {
        for (j in 0 ..< M) {
            var d = 0
            
            while (d < min(N, M)) {
                val dx = i + d
                val dy = j + d
                if (dx > N - 1 || dy > M - 1) break
                if (board[i][j] == board[i][dy] && board[i][j] == board[dx][j] && board[i][j] == board[dx][dy]) {
                    if (maxD < d) maxD = d
                }
                d++
            }
        }
    }
    
    print("${(maxD + 1) * (maxD + 1)}")
}