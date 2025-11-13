fun main() {
    val br = System.`in`.bufferedReader()
    val board = Array(8) { br.readLine() }
    var count = 0
    
    for (i in 0 .. 7) {
        val isWhite = i % 2 == 0
        
        for (j in 0 .. 7) {
            // 첫번쨰 칸이 흰색일때는 짝수칸이 흰색
            if (isWhite && j % 2 == 0 && board[i][j] == 'F') {
                count++
                continue
            }
            
            if (isWhite.not() && j % 2 != 0 && board[i][j] == 'F') {
                count++
            }
        }
    }
    
    print(count)
}