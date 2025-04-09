import java.util.Queue
import java.util.LinkedList

fun main() {
    val br = System.`in`.bufferedReader()
    
    // 정점의 개수 N, 간선의 개수 M
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val graph = Array(N + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(N + 1) { false }
    var count = 0
    
    repeat(M) {
        val (u, v) = br.readLine().split(" ").map { it.toInt() }
        graph[u].add(v)
        graph[v].add(u)
    }
    
    for (i in 1 .. N) {
        if (visited[i]) continue
        
        val queue: Queue<Int> = LinkedList()
        queue.add(i)
        visited[i] = true
        
        while (queue.isNotEmpty()) {
            val currentV = queue.poll()
            
            for (newV in graph[currentV]) {
                if (visited[newV]) continue
                queue.add(newV)
                visited[newV] = true
            }
        }
        
        count++
    }
    
    print(count)
}