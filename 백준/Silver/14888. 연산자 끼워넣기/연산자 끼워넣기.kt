import java.util.StringTokenizer
import kotlin.math.max
import kotlin.math.min

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val tempA = StringTokenizer(br.readLine())
    val A = IntArray(N) { tempA.nextToken().toInt() }
    val operators = br.readLine().split(" ").map { it.toInt() }
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    
    fun calculate(
        idx: Int,
        result: Int,
        plus: Int,
        minus: Int,
        mul: Int,
        div: Int,
    ) {
        if (idx == N) {
            max = max(max, result)
            min = min(min, result)
            return
        }
        
        if (plus > 0) calculate(idx + 1, result + A[idx], plus - 1, minus, mul, div)
        if (minus > 0) calculate(idx + 1, result - A[idx], plus, minus - 1, mul, div)
        if (mul > 0) calculate(idx + 1, result * A[idx], plus, minus, mul - 1, div)
        if (div > 0) calculate(idx + 1, result / A[idx], plus, minus, mul, div - 1)
    }
    
    calculate(
        idx = 1, 
        result = A[0], 
        plus = operators[0], 
        minus = operators[1], 
        mul = operators[2], 
        div = operators[3],
    )
    
    println("$max")
    println("$min")
}

