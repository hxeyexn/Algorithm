class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string
        
        queries.map { (s, e) ->
            val reversedString = answer.slice(s..e).reversed()
            answer = answer.replaceRange(s, e + 1, reversedString)
        }
        
        return answer
    }
}