import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val result = PriorityQueue<Int>()
    
    br.readLine().split(" ").forEach { result.add(it.toInt()) }
    br.readLine().split(" ").forEach { result.add(it.toInt()) }
    
    while (result.isNotEmpty()) {
        bw.write("${result.poll()} ")
    }
    bw.flush()
    bw.close()
}