import java.util.*

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val miro = Array(n) { readln().map { it.digitToInt() }.toIntArray() }

    val dx = listOf(1, 0, -1, 0)
    val dy = listOf(0, 1, 0, -1)

    val dist = Array(n) { Array(m) { 0 } }
    var count = 0

    for (i in 0 ..< n) {
        for (j in 0 ..< m) {
            if (dist[i][j] != 0 || miro[i][j] == 0) continue
            dist[i][j] = ++count

            val queue: Queue<Pair<Int, Int>> = LinkedList()
            queue.add(i to j)

            while (!queue.isEmpty()) {
                val current = queue.remove()

                for (k in 0..3) {
                    val nx = current.first + dx[k]
                    val ny = current.second + dy[k]

                    if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue
                    if (dist[nx][ny] != 0 || miro[nx][ny] == 0) continue
                    queue.add(nx to ny)
                    dist[nx][ny] = dist[current.first][current.second] + 1
                }
            }
        }
    }

    print("${dist[n - 1][m - 1]}")
}