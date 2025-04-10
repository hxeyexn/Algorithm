import kotlin.math.pow

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        var currentN = n
        var reverse = mutableListOf<Int>()
        
        while (currentN >= 3) {
            reverse.add(currentN % 3)
            currentN /= 3
        }
        reverse.add(currentN)
        
        var idx = reverse.size - 1
        
        for (num in reverse) {
            answer += num * (3.0.pow(idx--)).toInt()
        }

        return answer
    }
}