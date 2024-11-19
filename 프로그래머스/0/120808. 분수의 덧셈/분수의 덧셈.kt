import kotlin.math.min

class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        val numer = numer1 * denom2 + numer2 * denom1
        val denom = denom1 * denom2
        var max = 1
        
        for (i: Int in 2 .. min(numer, denom)) {
            if (denom % i == 0 && numer % i == 0) max = i
        }
    
        return intArrayOf(numer / max, denom / max)
    }
}
