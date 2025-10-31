import java.util.StringTokenizer

val br = System.`in`.bufferedReader()
val N = br.readLine().toInt()
val parents = StringTokenizer(br.readLine())
val removedNode = br.readLine().toInt()
val tree = Array(N) { ArrayList<Int>() }
var count = 0

fun main() {
    var root = -1
    repeat(N) {
        val parent = parents.nextToken().toInt()
        
        if (parent == -1) root = it
        else if (it != removedNode && parent != removedNode) {
            tree[parent].add(it)
        }
    }

    dfs(root)
    print(count)
}

fun dfs(
    node: Int,
) {
    if (node == removedNode) return
    if (tree[node].isEmpty()) {
        count++
        return
    }

    for (newNode in tree[node]) {
        dfs(newNode)
    }
}