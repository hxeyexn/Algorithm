import java.util.*
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val k = br.readLine().toInt()
    val stack = Stack<Int>()
    
    repeat(k) {
        val input = br.readLine().toInt()
        
        if (input != 0) stack.push(input)
        else stack.pop()
    }
    
    println("${stack.sum()}")
}