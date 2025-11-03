import java.util.LinkedList

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val map = Array(N) { IntArray(N) { 0 } }
    
    val visited = Array(N) { BooleanArray(N) { false } }
    
    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, 1, 0, -1)
    
    var totalCount = 0
    val result = mutableListOf<Int>()
    
    for (i in 0 until N) {
        val row = br.readLine()
        
        for (j in 0 until N) {
            map[i][j] = row[j].digitToInt()
        }
    }
    
    for (i in 0 until N) {
        for (j in 0 until N) {
            if (map[i][j] == 0 || visited[i][j]) continue
            
            val queue = LinkedList<Pair<Int, Int>>()
            var homeCount = 0
            
            queue.add(i to j)
            visited[i][j] = true
            totalCount++
            
            while(queue.isNotEmpty()) {
                val (x, y) = queue.remove()
                homeCount++
                
                for (n in 0 .. 3) {
                    val nx = x + dx[n]
                    val ny = y + dy[n]
                    
                    if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue
                    if (map[nx][ny] == 0 || visited[nx][ny]) continue
                    
                    queue.add(nx to ny)
                    visited[nx][ny] = true
                }
            }
            
            result.add(homeCount)
        }
    }
    
    // 총 단지 수
    println("$totalCount")
    
    // 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력
    result.sort()
    for (count in result) {
        println("$count")
    }
}