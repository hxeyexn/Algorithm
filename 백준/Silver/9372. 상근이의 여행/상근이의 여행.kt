fun main() {
    val br = System.`in`.bufferedReader()
    val T = br.readLine().toInt()

    repeat(T) {
        val (N, M) = br.readLine().split(" ").map { it.toInt() }
        val schedule = Array(N + 1) { ArrayList<Int>() }
        val visited = BooleanArray(N + 1)
        var count = 0

        repeat(M) {
            val (a, b) = br.readLine().split(" ").map { it.toInt() }

            schedule[a].add(b)
            schedule[b].add(a)
        }

        fun dfs(
            node: Int,
            schedule: Array<ArrayList<Int>>,
            visited: BooleanArray,
        ) {
            if (visited[node]) return
            visited[node] = true

            for (newNode in schedule[node]) {
                if (!visited[newNode]) {
                    count++
                    dfs(newNode, schedule, visited)
                }
            }
        }

        dfs(1, schedule, visited)
        println(count)
    }
}
