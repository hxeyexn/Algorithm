import kotlin.math.min

fun main() {
    val br = System.`in`.bufferedReader()
    
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val board = Array(N) { br.readLine().map { it }.toTypedArray() }
    
    var minCount = Int.MAX_VALUE
    
    val whiteStartCount = count(N, M, board, startColor = 'W')
    minCount = min(minCount, whiteStartCount)
    
    val blackStartCount = count(N, M, board, startColor = 'B')
    minCount = min(minCount, blackStartCount)
   
    print(minCount)
}

fun count(n: Int, m: Int, board: Array<Array<Char>>, startColor: Char): Int {
    var min = Int.MAX_VALUE
    var otherColor = if (startColor == 'W') 'B' else 'W'
    
    for (x in 0 until n - 7) {
        for (y in 0 until m - 7) {
            var count = 0
            
            for (i in x until x + 8) {
                var color = if ((i - x) % 2 == 0) startColor else otherColor
                
                for (j in y until y + 8) {
                    if (board[i][j] != color) count++
                    
                    color = if (color == 'B') 'W' else 'B'
                }
            }
            
            if (min > count) min = count
        }
    }
    
    return min
}