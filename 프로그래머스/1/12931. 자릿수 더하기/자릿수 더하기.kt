class Solution {
    fun solution(n: Int): Int {
        var num = n
        var answer = 0
    
        do {
            answer += num % 10
            num = num / 10 
        } while (num != 0)
        
        return answer
    }
}