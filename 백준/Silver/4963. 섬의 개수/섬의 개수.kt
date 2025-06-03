import java.util.Queue
import java.util.LinkedList

fun main() {    
    val br = System.`in`.bufferedReader()
    val dx = listOf(1, 0, -1, 0, 1, 1, -1, -1)
    val dy = listOf(0, 1, 0, -1, -1, 1, 1, -1)
    
    while (true) {
        val (w, h) = br.readLine().split(" ").map { it.toInt() }
        if (w == 0 && h == 0) break
        
        val map = Array(h) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }
        val visited = Array(h) { BooleanArray(w) { false } }
        
        var count = 0
        
        for (i in 0 until h) {
            for (j in 0 until w) {
                if (visited[i][j] || map[i][j] == 0) continue
                
                val queue: Queue<Pair<Int, Int>> = LinkedList()
                queue.add(i to j)
                visited[i][j] = true
                
                while (queue.isNotEmpty()) {
                    val element = queue.poll()
                    val currentX = element.first
                    val currentY = element.second
                    
                    for (k in 0 .. 7) {
                        val nx = currentX + dx[k]
                        val ny = currentY + dy[k]
                    
                        if (nx < 0 || nx >= h || ny < 0 || ny >= w) continue
                        if (visited[nx][ny] || map[nx][ny] == 0) continue
                        queue.add(nx to ny)
                        visited[nx][ny] = true
                    }
                }
                count++
            }
        }
        println("$count")
    }
}