import java.util.Queue
import java.util.LinkedList

fun main() {
    val count = readln().toInt()
    val pairCount = readln().toInt()
    val graph = Array(count + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(count + 1) { false }
    var answer = 0
    
    repeat (pairCount) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        graph[x].add(y).also { graph[y].add(x) }
    }
    
    val queue: Queue<Int> = LinkedList()
    queue.add(1)
    
    while (queue.isNotEmpty()) {
        val v = queue.poll()
        visited[v] = true
        answer++
        
        for (newV in graph[v]) {
            if (!visited[newV]) {
                queue.add(newV)
                visited[newV] = true
            }
        }
    }
    
    print(answer - 1)
}