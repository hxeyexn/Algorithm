fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val graph = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }
    val result =  Array(n) { IntArray(n) { 0 } }
    
    fun dfs(v: Int, node: Int, visit: BooleanArray) {
        visit[node] = true
        result[v][node] = 1
        
        for (nextNode in 0 ..< n) {
            if (graph[node][nextNode] == 1 && !visit[nextNode]) {
                dfs(v, nextNode, visit)
            }
        }
    }
    
    for (i in 0 ..< n) {
        val visit = BooleanArray(n) { false }
        for(j in 0 ..< n) {
            if (graph[i][j] == 1) {
                dfs(i, j, visit)
            }
        }
    }
    
    result.forEach {
        println("${it.joinToString(" ")}")
    }
}