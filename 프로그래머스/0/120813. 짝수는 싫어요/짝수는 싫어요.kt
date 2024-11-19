class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        (1..n).forEach {
            if (it % 2 == 1) answer = answer.plus(it)
        }
        
        return answer
    }
}