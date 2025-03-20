import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val T = br.readLine().toInt()
    val dx = listOf(1, 0, -1, 0)
    val dy = listOf(0, 1, 0, -1)
    
    repeat(T) {
        val (M, N, K) = br.readLine().split(" ").map { it.toInt() }
    
        val field = Array(M) { BooleanArray(N) { false } }
        val visit = Array(M) { BooleanArray(N) { false } }
        var count = 0
        
        repeat(K) {
            val (X, Y) = br.readLine().split(" ").map { it.toInt() }
            field[X][Y] = true
        }
    
        for (m in 0 ..< M) {
            for (n in 0 ..< N) {
                if (!field[m][n] || visit[m][n]) continue
                
                val queue: Queue<Pair<Int, Int>> = LinkedList()
                queue.add(m to n)
                visit[m][n] = true
                count++
                
                while (queue.isNotEmpty()) {
                    val (currentX, currentY) =  queue.poll()
                    
                    for (i in 0 .. 3) {
                        val nx = currentX + dx[i]
                        val ny = currentY + dy[i]
                        
                        if (nx < 0 || nx >= M || ny < 0 || ny >= N) continue
                        if (!field[nx][ny] || visit[nx][ny]) continue
                        queue.add(nx to ny)
                        visit[nx][ny] = true
                    }
                }
            }
        }
        
        println(count)
    }
}