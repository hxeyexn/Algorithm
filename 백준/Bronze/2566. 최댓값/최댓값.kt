fun main() {
    val br = System.`in`.bufferedReader()
    
    // 9 X 9 담을 격자판 출력
    val board = Array(9) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }
    
    var max = 0
    var x = 0
    var y = 0
    
    // 전체 배열을 다 돌면?
    // 시간 복잡도 최악의 경우 N^2
    for (i in 0 .. 8) {
        for (j in 0 .. 8) {
            if (max < board[i][j]) {
                max = board[i][j]
                x = i
                y = j
            }
            if (board[i][j] == 90) break
        }
    }
    
    // 최댓값 출력
    // 최댓갑 몇 행 몇 열에 위치한 수인지 출력
    println(max)
    print("${x + 1} ${y + 1}")
}