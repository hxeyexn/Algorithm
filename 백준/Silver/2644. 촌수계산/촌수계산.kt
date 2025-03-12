fun main() {
    val n = readln().toInt()
    val (a, b) = readln().split(" ").map { it.toInt() }

    val m = readln().toInt()
    val relation = Array(n + 1) { mutableListOf<Int>() }

    repeat(m) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        relation[x].add(y)
        relation[y].add(x)
    }

    val visit = BooleanArray(n + 1) { false }
    var count = 0
    var find = false

    fun dfs(v: Int) {
        visit[v] = true
        
        for (nextV in relation[v]) {
            if (find) return
            if (!visit[nextV]) {
                count++ 
                if (nextV == a) {
                    find = true
                    return
                }
                dfs(nextV)
                if (!find) count--
            }
        }
    }

    dfs(b)
    if (find) print("$count") else print("-1")
}
