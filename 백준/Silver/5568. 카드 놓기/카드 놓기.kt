fun main() {
    val br = System.`in`.bufferedReader()

    val n = br.readLine().toInt()
    val k = br.readLine().toInt()
    val cards = Array(n) { br.readLine() }
    val numbers = mutableSetOf<String>()
    val visited = BooleanArray(n) { false }
    val selectedCount = 0

    dfs(cards[0], selectedCount, n, k, visited, cards, numbers)
    print(numbers.count())
}

fun dfs(
    number: String,
    selectedCount: Int,
    n: Int,
    k: Int,
    visited: BooleanArray,
    cards: Array<String>,
    numbers: MutableSet<String>,
) {
    if (selectedCount == k) {
        numbers.add(number)
        return
    }

    for (i in 0 until n) {
        if (!visited[i]) {
            visited[i] = true
            dfs(number + cards[i], selectedCount + 1, n, k, visited, cards, numbers)
            visited[i] = false
        }
    }
}