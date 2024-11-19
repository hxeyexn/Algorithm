import kotlin.math.*

class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        val numer = numer1 * denom2 + numer2 * denom1
        val denom = denom1 * denom2 
        val gcd = gcd(numer, denom)
    
        return intArrayOf(numer / gcd, denom / gcd)
    }
}

fun gcd(numer: Int, denom: Int): Int {
    val maxValue = max(numer, denom)
    val minValue = min(numer, denom)
    var r = maxValue % minValue
    
    return if (r == 0) minValue else gcd(minValue, r)
}
