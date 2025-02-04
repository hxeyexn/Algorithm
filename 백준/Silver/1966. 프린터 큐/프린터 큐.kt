import java.util.*

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (n, m) = readln().split(" ").map { it.toInt() }
        val queue: Queue<Int> = LinkedList(readln().split(" ").map { it.toInt() })

        var count = 0
        var idx = m

        while (true) {
            val max = queue.max()
            val importance = queue.remove()

            if (importance != max) {
                queue.add(importance)
            } else {
                count++
                if (idx == 0) {
                    println("$count")
                    break
                }
            }

            if (idx == 0) idx = queue.size - 1 else idx -= 1
        }
    }
}