import java.util.Queue
import java.util.LinkedList

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val sb = StringBuilder()

    val queue: Queue<Int> = LinkedList<Int>()

    for (n in 1 .. N) {
        queue.add(n)
    }

    while (queue.size > 1) {
        val removed = queue.remove()
        sb.append("$removed ")
        queue.add(queue.remove())
    }

    sb.append("${queue.peek()}")
    print(sb)
}
