import java.util.Queue
import java.util.LinkedList

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    
    // 지도 배열
    val map = Array(N) { br.readLine().map { it.digitToInt() }.toIntArray() }
    
    // 방문 배열
    val visited = Array(N) { BooleanArray(N) { false } }
    
    // 단지 수
    var count = 0
    
    // 각 단지에 속하는 집의 수
    val homes = mutableListOf<Int>()
    
    // dx, dy
    val dx = listOf(1, 0, -1, 0)
    val dy = listOf(0, 1, 0, -1)
    
    for (i in 0 ..< N) {
        for (j in 0 ..< N) {
            val queue: Queue<Pair<Int, Int>> = LinkedList()
            
            if (visited[i][j] || map[i][j] == 0) continue
            queue.add(i to j)
            visited[i][j] = true
            count++
            
            var homeCount = 0
            while (queue.isNotEmpty()) {
                val (currentX, currentY) = queue.poll()
                homeCount++
                
                for (k in 0 .. 3) {
                    val nx = currentX + dx[k]
                    val ny = currentY + dy[k]
                    
                    if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue
                    if (visited[nx][ny] || map[nx][ny] == 0) continue
                    queue.add(nx to ny)
                    visited[nx][ny] = true
                }
            }
            homes.add(homeCount)
        }
    }
    
    homes.sort()
    println(count)
    homes.forEach { println(it) }
}