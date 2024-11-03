class Solution {
    fun solution(str1: String, str2: String): String {
        var answer = ""

        repeat(str1.length) {
            answer = answer.plus(str1[it]).plus(str2[it])
        }

        return answer
    }
}