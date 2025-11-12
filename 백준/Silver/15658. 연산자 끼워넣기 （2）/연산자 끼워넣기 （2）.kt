import kotlin.math.max
import kotlin.math.min

fun main() {
    // 연산자의 개수는 N - 1보다 많을 수도 있음
    // 모든 수의 사이에는 연산자를 한 개 끼워넣어야 함
    // 주어진 연산자를 모두 사용하지 않아도 됨
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val A = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val operators = br.readLine().split(" ").map { it.toInt() }
    
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    
    fun calculate(
        idx: Int,
        value: Int,
        plus: Int,
        minus: Int,
        mul: Int,
        div: Int,
    ) {
        if (idx >= N) {
            max = max(max, value)
            min = min(min, value)
            return
        }
        
        if (plus > 0) calculate(idx + 1, value + A[idx], plus - 1, minus, mul, div)
        if (minus > 0) calculate(idx + 1, value - A[idx], plus, minus - 1, mul, div)
        if (mul > 0) calculate(idx + 1, value * A[idx], plus, minus, mul - 1, div)
        if (div > 0) calculate(idx + 1, value / A[idx], plus, minus, mul, div - 1)
    }
    
    calculate(
        idx = 1, 
        value = A[0], 
        plus = operators[0],
        minus = operators[1],
        mul = operators[2],
        div = operators[3],
    )
    
    println(max)
    println(min)
}
