import java.util.LinkedList

fun main() {
    val br = System.`in`.bufferedReader()
    val nodeCount = br.readLine().toInt()
    val edgeCount = br.readLine().toInt()
    val graph = Array(nodeCount + 1) { ArrayList<Int>() }
    val visited = BooleanArray(nodeCount + 1) { false }
    var count = 0
    
    repeat(edgeCount) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        
        graph[a].add(b)
        graph[b].add(a)
    }
    
    val queue = LinkedList<Int>()
    queue.add(1)
    visited[1] = true
    
    while (queue.isNotEmpty()) {
        val node = queue.remove()
        count++
        
        for (newNode in graph[node]) {
            if (visited[newNode]) continue
            
            queue.add(newNode)
            visited[newNode] = true
        }
    }
    
    print(count - 1)
}
