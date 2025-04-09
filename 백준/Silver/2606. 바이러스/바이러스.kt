fun main() {
    val br = System.`in`.bufferedReader()

    val computerCount = br.readLine().toInt()
    val pairCount = br.readLine().toInt()
    val network = Array(computerCount + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(computerCount + 1) { false }

    repeat(pairCount) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        network[a].add(b)
        network[b].add(a)
    }

    // 시작 정점 1
    print(dfs(1, visited, network) - 1)
}

fun dfs(v: Int, visited: BooleanArray, network: Array<MutableList<Int>>): Int {
    var count = 0
    
    if (visited[v]) return 0
    visited[v] = true
    count++
    
    for (newV in network[v]) {
        if (!visited[newV]) count += dfs(newV, visited, network)
    }
    
    return count
}