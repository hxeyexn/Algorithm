class Solution {
    fun solution(my_string: String, k: Int): String {
        var answer = ""
        repeat(k) {
            answer = answer.plus(my_string)
        }
        return answer
    }
}