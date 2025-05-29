import kotlin.math.min

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    
    val board = Array(N) { br.readLine().map { it.digitToInt() }.toIntArray() }
    var maxD = 0
    
    for (i in 0 until N) {
        for (j in 0 until M) {
            var d = 0
            
            while (i + d < N && j + d < M) {
                if (board[i][j] == board[i + d][j] 
                    && board[i][j] == board[i][j + d] 
                    && board[i][j] == board[i + d][j + d]) {
                    if (maxD <= d) maxD = d
                }
                d++
            }
        }
    }
    
    print("${(maxD + 1) * (maxD + 1)}")
}