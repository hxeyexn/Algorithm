import kotlin.math.max

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val board = Array(N) { br.readLine().map { it.toInt() }.toIntArray() }

    val dx = intArrayOf(1, 0)
    val dy = intArrayOf(0, 1)
    var maxCount = 0
        
    fun checkRow(x: Int): Int {
        var count = 1
        var maxLength = 1
        
        for (y in 1 ..< N) {
            if (board[x][y] == board[x][y - 1]) count++
            else {
                maxLength = max(count, maxLength)
                count = 1
            }
        }
        
        return max(count, maxLength)
    }
    
    fun checkColumn(y: Int): Int {
        var count = 1
        var maxLength = 1
        
        for (x in 1 ..< N) {
            if (board[x][y] == board[x - 1][y]) count++
            else {
                maxLength = max(count, maxLength)
                count = 1
            }
        }
        
        return max(count, maxLength)
    }
    
    fun calculateMaxCount(x: Int, nx: Int, y: Int, ny: Int) {
        val newMax =
            maxOf(
                checkRow(x),
                checkRow(nx),
                checkColumn(y),
                checkColumn(ny),
            )
        maxCount = max(maxCount, newMax)
    }
    
    for (x in 0 ..< N) {
        for (y in 0 ..< N) {
            for (i in 0 .. 1) {
                val origin = board[x][y]
                val nx = x + dx[i]
                val ny = y + dy[i]
                
                if (nx >= N || ny >= N) continue
                
                val newCandy = board[nx][ny]
                if (origin == newCandy) {
                    calculateMaxCount(x, nx, y, ny)
                    continue
                }
                
                board[x][y] = newCandy
                board[nx][ny] = origin
                
                // 사탕 개수 체크
                calculateMaxCount(x, nx, y, ny)
                
                // board 원상복구
                board[x][y] = origin
                board[nx][ny] = newCandy
            }
        }
    }
    
    print(maxCount)
}
