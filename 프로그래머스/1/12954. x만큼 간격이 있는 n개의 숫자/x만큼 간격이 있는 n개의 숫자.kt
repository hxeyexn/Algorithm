class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var input = x.toLong()
        var answer = longArrayOf()
        
        for (i in 1..n) {
            answer += input
            input += x
        }
        
        return answer
    }
}