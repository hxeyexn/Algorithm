import java.io.BufferedWriter
import java.util.Queue
import java.util.LinkedList

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    val (N, M, V) = br.readLine().split(" ").map { it.toInt() }
    val graph = Array(N + 1) { mutableListOf<Int>() }
    
    // 간선은 양방향
    repeat(M) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }
    
    // 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문
    graph.forEach { it.sort() }
    
    // dfs
    val dfsVisited = BooleanArray(N + 1) { false }
    dfs(bw, V, dfsVisited, graph)
    bw.write("\n")
    
    // bfs
    val bfsVisited = BooleanArray(N + 1) { false }
    bfs(bw, V, bfsVisited, graph)
    
    bw.flush()
    bw.close()
}

fun dfs(bw: BufferedWriter, v: Int, visited: BooleanArray, graph: Array<MutableList<Int>>) {
    if (visited[v]) return
    bw.write("$v ")
    visited[v] = true
    
    for (newV in graph[v]) {
        if (!visited[newV]) dfs(bw, newV, visited, graph)
    }
}

fun bfs(bw: BufferedWriter, v: Int, visited: BooleanArray, graph: Array<MutableList<Int>>) {
    if (visited[v]) return
    
    val queue: Queue<Int> = LinkedList()
    queue.add(v)
    visited[v] = true
    
    while(queue.isNotEmpty()) {
        val currentV = queue.poll()
        bw.write("$currentV ")
        
        for (newV in graph[currentV]) {
            if (visited[newV]) continue
            queue.add(newV)
            visited[newV] = true
        }
    }
}