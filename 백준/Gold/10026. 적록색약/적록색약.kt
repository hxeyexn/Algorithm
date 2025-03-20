import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val dx = listOf(1, 0, -1, 0)
    val dy = listOf(0, 1, 0, -1)
    
    val picture = Array(N) { br.readLine().map { it }.toCharArray() }
    var noneCount = 0
    val visit = Array(N) { BooleanArray(N) { false } }
    
    for (n in 0 ..< N) {
        for (m in 0..<N) {
            val currentColor = picture[n][m]
            if (visit[n][m] || currentColor != picture[n][m]) continue

            val queue: Queue<Pair<Int, Int>> = LinkedList()
            queue.add(n to m)
            visit[n][m] = true

            noneCount++
            while (queue.isNotEmpty()) {
                val (currentX, currentY) = queue.poll()

                for (i in 0..3) {
                    val nx = currentX + dx[i]
                    val ny = currentY + dy[i]

                    if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue
                    if (visit[nx][ny] || currentColor != picture[nx][ny]) continue
                    queue.add(nx to ny)
                    visit[nx][ny] = true
                }
            }
        }
    }

    val redGreenPicture = picture.map { p -> p.map { if (it == 'G') 'R' else it }  }
    var redGreenCount = 0
    val redGreenVisit = Array(N) { BooleanArray(N) { false } }

    for (n in 0 ..< N) {
        for (m in 0 ..< N) {
            val currentColor = redGreenPicture[n][m]
            if (redGreenVisit[n][m] || currentColor != redGreenPicture[n][m]) continue

            val queue: Queue<Pair<Int, Int>> = LinkedList()
            queue.add(n to m)
            redGreenVisit[n][m] = true

            redGreenCount++
            while (queue.isNotEmpty()) {
                val (currentX, currentY) = queue.poll()

                for (i in 0 .. 3) {
                    val nx = currentX + dx[i]
                    val ny = currentY + dy[i]

                    if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue
                    if (redGreenVisit[nx][ny] || currentColor != redGreenPicture[nx][ny]) continue
                    queue.add(nx to ny)
                    redGreenVisit[nx][ny] = true
                }
            }
        }
    }

    println("$noneCount $redGreenCount")
}
