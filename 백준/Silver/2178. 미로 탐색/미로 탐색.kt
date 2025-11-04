import java.util.LinkedList

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val miro = Array(N + 1) { IntArray(M + 1) { 0 } }
    
    for (i in 1 .. N) {
        val input = br.readLine()
        
        for (j in 1 .. M) {
            miro[i][j] = input[j - 1].digitToInt()
        }
    }
    
    val visited = Array(N + 1) { BooleanArray(M + 1) { false } }
    val queue = LinkedList<Pair<Int, Int>>()
    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, 1, 0, -1)
    
    queue.add(1 to 1)
    visited[1][1] = true
    
    while(!queue.isEmpty()) {
        val (curX, curY) = queue.remove()
        
        for (i in 0 .. 3) {
            val newX = curX + dx[i]
            val newY = curY + dy[i]
            
            if (newX <= 0 || newX > N || newY <= 0 || newY > M) continue
            if (visited[newX][newY] || miro[newX][newY] == 0) continue
            
            miro[newX][newY] = miro[curX][curY] + 1
            queue.add(newX to newY)
            visited[newX][newY] = true
        }
    }
    
    print("${miro[N][M]}")
}