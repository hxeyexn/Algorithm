import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val N = br.readLine().toInt()
    
    val tree = Array(N + 1) { ArrayList<Int>() }
    val visited = BooleanArray(N + 1) { false }
    val parents = IntArray(N + 1) { 0 }
    
    repeat(N - 1) {
        val input = StringTokenizer(br.readLine())
        val a = input.nextToken().toInt()
        val b = input.nextToken().toInt()
        
        tree[a].add(b)
        tree[b].add(a)
    }
    
    dfs(node = 1, visited, tree, parents)
    
    for (i in 2 .. N) {
        bw.write("${parents[i]}")
        bw.newLine()
    }
    
    bw.flush()
    bw.close()
}

fun dfs(
    node: Int,
    visited: BooleanArray,
    tree: Array<ArrayList<Int>>,
    parents: IntArray,
) {
    if (visited[node]) return
    visited[node] = true
    
    for (newNode in tree[node]) {
        if (visited[newNode]) continue
        
        parents[newNode] = node
        dfs(newNode, visited, tree, parents)
    }
}