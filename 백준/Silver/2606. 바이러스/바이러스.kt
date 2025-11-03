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
    
    fun dfs(
        node: Int,
        graph: Array<ArrayList<Int>>,
        visited: BooleanArray,
    ) {
        if (visited[node]) return
        visited[node] = true

        for (newNode in graph[node]) {
            if (visited[newNode]) continue

            dfs(newNode, graph, visited)
            count++
        }
    }
    
    dfs(node = 1, graph, visited)
    
    print(count)
}
