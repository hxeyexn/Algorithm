import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m, p) = br.readLine().split(" ").map { it.toInt() }
    val preferences = mutableMapOf<Int, Int>()

    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        if (!preferences.containsKey(y)) preferences[y] = x
    }

    val visit = Array(m) { false }
    var count = 0

    val stack = Stack<Int>()
    stack.push(p)

    while (stack.isNotEmpty()) {
        val currentChannel = stack.pop()

        if (!preferences.containsKey(currentChannel)) return print(count)
        if (visit[currentChannel - 1]) return print(-1)

        visit[currentChannel - 1] = true
        count++
        stack.push(preferences[currentChannel])
    }
}