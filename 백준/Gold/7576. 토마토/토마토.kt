import java.util.LinkedList
import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    
    // 상자의 크기 M: 가로, N: 세로
    val (M, N) = br.readLine().split(" ").map { it.toInt() }
    val box = Array(N) { IntArray(M) { 0 } }
    var ripeTomatoCount = 0
    
    val queue = LinkedList<Pair<Int, Int>>()
    
    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, 1, 0, -1)
    
    var (lastX, lastY) = 0 to 0
    var result = 0
    
    var isUnripe = false
    
    for (n in 0 until N) {
        val row = StringTokenizer(br.readLine())
        
        for (m in 0 until M) {
            val state = row.nextToken().toInt()
            if (state == 1) {
                ripeTomatoCount++
                queue.add(n to m)
            }
            box[n][m] = state
        }
    }
    
    if (ripeTomatoCount == M * N) result = 0
    else {
        while (queue.isNotEmpty()) {
            val (x, y) = queue.poll()
            
            for (i in 0 .. 3) {
                val nx = x + dx[i]
                val ny = y + dy[i]
                
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue
                if (box[nx][ny] != 0) continue
                
                queue.add(nx to ny)
                box[nx][ny] = box[x][y] + 1
                lastX = nx
                lastY = ny
            }
        }
        
        for (n in 0 until N) {
            for (m in 0 until M) {
                if (box[n][m] == 0) {
                    isUnripe = true
                    break
                }
            }
        }
        
        result = if (isUnripe) -1 else box[lastX][lastY] - 1
    }
    
    print("$result")
}