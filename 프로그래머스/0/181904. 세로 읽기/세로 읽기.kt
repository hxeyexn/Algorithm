class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        var startIndex = 0
        var lastIndex = m
        var answer = ""
        
        repeat(my_string.length / m) {
            answer += my_string.substring(startIndex, lastIndex)[c - 1]
            startIndex += m
            lastIndex += m
        }
        
        return answer
    }
}