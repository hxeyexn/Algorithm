import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M, K) = br.readLine().split(" ").map { it.toInt() }
    
    // 음식물이 떨어진 곳을 true
    val path = Array(N) { BooleanArray(M) { false } }
    val visit = Array(N) { BooleanArray(M) { false } }
    
    val dx = listOf(1, 0, -1, 0)
    val dy = listOf(0, 1, 0, -1)
    
    var max = 0
    
    repeat(K) {
        val (r, c) = br.readLine().split(" ").map { it.toInt() }
        path[r - 1][c - 1] = true
    }
    
    for (n in 0 ..< N) {
        for (m in 0 ..< M) {
            if (!path[n][m] || visit[n][m]) continue
            
            val queue: Queue<Pair<Int, Int>> = LinkedList()
            queue.add(n to m)
            visit[n][m] = true
            var area = 0
            
            while (queue.isNotEmpty()) {
                val (currentX, currentY) = queue.poll()
                area++
                
                for (i in 0 .. 3) {
                    val nx = currentX + dx[i]
                    val ny = currentY + dy[i]
                    
                    if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue
                    if (!path[nx][ny] || visit[nx][ny]) continue
                    queue.add(nx to ny)
                    visit[nx][ny] = true
                }
            }
            if (max < area) max = area
        }
    }
    
    print(max)
}