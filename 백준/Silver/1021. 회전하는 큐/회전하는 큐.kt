import java.util.*

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val deque: Deque<Int> = LinkedList((1..n).map { it })

    var count = 0
    val indexes = readln().split(" ").map { it.toInt() }

    for (idx in indexes) {
        if (deque.indexOf(idx) <= deque.size / 2) {
            repeat(deque.indexOf(idx) + 1) {
                if (deque.first != idx) {
                    count++
                    deque.addLast(deque.removeFirst())
                } else {
                    deque.removeFirst()
                }
            }
        } else {
            repeat(deque.size - deque.indexOf(idx) + 1) {
                if (deque.first == idx) {
                    deque.removeFirst()
                } else {
                    count++
                    deque.addFirst(deque.removeLast())
                }
            }
        }
    }

    print("$count")
}