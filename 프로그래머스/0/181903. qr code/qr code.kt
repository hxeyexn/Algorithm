class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        var answer: String = ""
        
        code.mapIndexed { idx, char -> 
            if (idx % q == r) answer += char
        }
        
        return answer
    }
}