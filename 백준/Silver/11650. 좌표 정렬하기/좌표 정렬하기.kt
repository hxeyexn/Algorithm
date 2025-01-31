import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val numbers = MutableList(br.readLine().toInt()) { br.readLine().split(" ") }
    
    numbers.sortBy { it[1].toInt() }
    numbers.sortBy { it[0].toInt() }
    
    numbers.map {
        bw.write("${it.joinToString(" ")}\n")
    }
    
    bw.flush()
    bw.close()
    br.close()
}