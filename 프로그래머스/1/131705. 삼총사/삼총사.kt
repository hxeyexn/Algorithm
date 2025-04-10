class Solution {
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        val lastIdx = number.size - 1
        
        for (i in 0 .. lastIdx - 2) {
            for (j in i + 1 .. lastIdx - 1) {
                for (k in j + 1 .. lastIdx) {
                    val sum = number[i] + number[j] + number[k]
                    
                    if (sum == 0) answer++
                }
            }
        }
        
        return answer
    }
}