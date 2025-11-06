import java.util.LinkedList
import java.util.Queue

fun main() {
    val N = readln().toInt()
    val cards: Queue<Int> = LinkedList<Int>()
    (1 .. N).forEach { cards.add(it) }
    
    while (cards.size > 1) {
        cards.remove()
        cards.add(cards.remove())
    }
    
    print(cards.firstOrNull())
}