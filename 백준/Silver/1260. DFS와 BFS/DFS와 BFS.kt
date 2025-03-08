import java.util.LinkedList
import java.util.Queue

fun main() {
    val (n, m, v) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { mutableListOf<Int>() }
    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    val dfsResult = mutableListOf<Int>()
    val bfsResult = mutableListOf<Int>()
    dfs(graph, v, BooleanArray(n + 1) { false }, dfsResult)
    bfs(graph, v, bfsResult)

    println(dfsResult.joinToString(" "))
    println(bfsResult.joinToString(" "))
}

fun dfs(
    graph: Array<MutableList<Int>>, 
    v: Int, 
    visited: BooleanArray, 
    dfsResult: MutableList<Int>,
) {
    visited[v] = true
    dfsResult.add(v)
    graph[v].sorted().forEach {
        if (!visited[it]) {
            dfs(graph, it, visited, dfsResult)
        }
    }
}

fun bfs(
    graph: Array<MutableList<Int>>, 
    start: Int, 
    bfsResult: MutableList<Int>,
) {
    val visited = BooleanArray(graph.size) { false }
    val queue: Queue<Int> = LinkedList()
    queue.add(start)
    visited[start] = true

    while (queue.isNotEmpty()) {
        val v = queue.remove()
        bfsResult.add(v)
        for (i in graph[v].sorted()) {
            if (!visited[i]) {
                queue.add(i)
                visited[i] = true
            }
        }
    }
}