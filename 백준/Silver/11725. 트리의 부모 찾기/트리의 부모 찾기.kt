fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()
    
    val N = br.readLine().toInt()
    val tree = Array(N + 1) { ArrayList<Int>() }
    val visited = BooleanArray(N + 1) { false }
    val result = IntArray(N + 1) { 0 }
    
    repeat(N - 1) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        tree[a].add(b)
        tree[b].add(a)
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
    tree: Array<ArrayList<Int>>,
    result: IntArray,
) {
    if (visited[v]) return
    visited[v] = true
    
    for (newV in tree[v]) {
        if (!visited[newV]) {
            result[newV] = v
            dfs(newV, visited, tree, result)
        }
    }
}
