fun main() {
    val n = readln().toInt()
    val graph = Array(n) { readln().split(" ").map { it.toInt() }.toIntArray() }
    val result = Array(n) { Array(n) { 0 } }

    fun dfs(v: Int, node: Int, visit: Array<Boolean>) {
        for (next in 0 until n) {
            if (graph[node][next] == 1 && !visit[next]) {
                visit[next] = true
                result[v][next] = 1
                dfs(v, next, visit)
            }
        }
    }

    for (i in 0 until n) {
        val visit = Array(n) { false }
        dfs(i, i, visit)
    }
    
    result.map { println(it.joinToString(" ")) }
}
