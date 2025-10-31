fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()
    
    val N = br.readLine().toInt()
    val tree = mutableMapOf<Int, MutableList<Int>>()
    val visited = BooleanArray(N + 1) { false }
    val result = IntArray(N + 1) { 0 }
    
    repeat(N - 1) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        tree.getOrPut(a) { mutableListOf() }.add(b)
        tree.getOrPut(b) { mutableListOf() }.add(a)
    }
    
    dfs(1, visited, tree, result)
    
    for (i in 2 until result.size) {
        sb.append("${result[i]}")
        sb.append("\n")
    }
    
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun dfs(
    v: Int, 
    visited: BooleanArray, 
    tree: MutableMap<Int, MutableList<Int>>,
    result: IntArray,
) {
    if (visited[v]) return
    visited[v] = true
    
    tree[v]?.forEach { newV ->
        if (!visited[newV]) {
            result[newV] = v
            dfs(newV, visited, tree, result)
        }
    }
}
