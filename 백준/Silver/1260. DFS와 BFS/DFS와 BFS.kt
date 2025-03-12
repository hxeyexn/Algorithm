import java.util.Queue
import java.util.LinkedList

fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m, v) = br.readLine().split(" ").map { it.toInt() }

    val array = Array(n + 1) { mutableListOf<Int>() }

    repeat(m) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        // 입력으로 주어지는 간선은 양방향
        array[x].add(y)
        array[y].add(x)
    }

    // 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문
    array.forEach { it.sort() }

    val visit = BooleanArray(n + 1) { false }
    dfs(v, array, visit)
    bfs(v, array)
    return
}

fun dfs(v: Int, array: Array<MutableList<Int>>, visit: BooleanArray) {
    visit[v] = true
    print("$v ")

    for (nextV in array[v]) {
        if (!visit[nextV]) dfs(nextV, array, visit)
    }
}

fun bfs(v: Int, array: Array<MutableList<Int>>) {
    val result = mutableListOf<Int>()
    val visit = BooleanArray(array.size + 1) { false }
    val queue: Queue<Int> = LinkedList()
    queue.add(v)
    visit[v] = true

    while (queue.isNotEmpty()) {
        val newV = queue.poll()
        result.add(newV)

        for (nextV in array[newV]) {
            if (!visit[nextV]) {
                queue.add(nextV)
                visit[nextV] = true
            }
        }
    }

    println("\n${result.joinToString(" ")}")
}