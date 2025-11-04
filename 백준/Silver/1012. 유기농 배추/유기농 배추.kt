import java.util.LinkedList

fun main() {
    val br = System.`in`.bufferedReader()
    val T = br.readLine().toInt()
    
    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, 1, 0, -1)

    repeat(T) {
        val (M, N, K) = br.readLine().split(" ").map { it.toInt() }
        
        val field = Array(M) { IntArray(N) { 0 } }
        val visited = Array(M) { BooleanArray(N) { false } }
        var count = 0
        
        repeat(K) {
            val (x, y) = br.readLine().split(" ").map { it.toInt() }
            field[x][y] = 1 
        }

        for (m in 0 until M) {
            for (n in 0 until N) {
                // 방문한 적이 있으면 continue
                if (visited[m][n] || field[m][n] == 0) continue
                
                // 방문한 적이 없으면 queue에 추가, 방문 처리
                val queue = LinkedList<Pair<Int, Int>>()
                
                queue.add(m to n)
                visited[m][n] = true
                count++

                while (queue.isNotEmpty()) {
                    val (currentX, currentY) = queue.poll()
                    
                    for (i in 0 .. 3) {
                        val nx = currentX + dx[i]
                        val ny = currentY + dy[i]
                        
                        if (nx < 0 || nx >= M || ny < 0 || ny >= N) continue
                        if (visited[nx][ny] || field[nx][ny] == 0) continue
                        
                        queue.add(nx to ny)
                        visited[nx][ny] = true
                    }
                }
            }
        }
        
        println(count)
    }
}