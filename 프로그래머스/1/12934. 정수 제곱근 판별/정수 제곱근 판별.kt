import kotlin.math.sqrt
import kotlin.math.pow

class Solution {
	fun solution(n: Long): Long {
        val x = sqrt(n.toDouble()).toLong()
        return if (x * x == n) (x + 1).toDouble().pow(2).toLong() else -1
    }
}