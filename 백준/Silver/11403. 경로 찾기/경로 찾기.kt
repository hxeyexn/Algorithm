fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val graph = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }
    val result =  Array(n) { IntArray(n) { 0 } }
    
    fun dfs(v: Int, node: Int, visit: BooleanArray) {
        for (nextNode in 0 ..< n) {
            if (graph[node][nextNode] == 1 && !visit[nextNode]) {
                visit[nextNode] = true
                result[v][nextNode] = 1
                dfs(v, nextNode, visit)
            }
        }
    }
    
    for (i in 0 ..< n) {
        val visit = BooleanArray(n) { false }
        dfs(i, i, visit)
    }
    
    result.forEach {
        println("${it.joinToString(" ")}")
    }
}