fun main() {
    val bw = System.out.bufferedWriter()
    // 입력을 2차원 배열에 저장한다 초기값 ' '
    val board = Array(5) { CharArray(15) { ' ' } }
    
    repeat(5) { x ->
        val word = readln()
        for (y in word.indices) {
            board[x][y] = word[y]             
        }  
    }
    
    // x 0 .. 14    
    // y 0 .. 4
    for (x in 0 .. 14) {
        for (y in 0 .. 4) {
            val char = board[y][x]
            // 읽으면서 문자가 비어있지않으면 bw.write 
            if (char != ' ') bw.write(char.toString())
        }
    }
    
    bw.flush()
    bw.close()
}
