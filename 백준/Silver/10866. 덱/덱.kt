import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val deque: Deque<Int> = LinkedList()
    
    repeat(n) {
        val order = br.readLine().split(" ")
        
        when(order[0]) {
            "push_front" -> deque.addFirst(order[1].toInt())
            "push_back" -> deque.addLast(order[1].toInt())
            "pop_front" -> if (deque.isEmpty()) bw.write("-1\n") else bw.write("${deque.removeFirst()}\n")
            "pop_back" -> if (deque.isEmpty()) bw.write("-1\n") else bw.write("${deque.removeLast()}\n")
            "size" -> bw.write("${deque.size}\n")
            "empty" -> if (deque.isEmpty()) bw.write("1\n") else bw.write("0\n")
            "front" -> if (deque.isEmpty()) bw.write("-1\n") else bw.write("${deque.first}\n")
            "back" -> if (deque.isEmpty()) bw.write("-1\n") else bw.write("${deque.last}\n")
        }
    }
    
    bw.flush()
    bw.close()
    br.close()
}