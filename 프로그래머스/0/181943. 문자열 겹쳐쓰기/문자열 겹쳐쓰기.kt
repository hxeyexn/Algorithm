class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer = my_string.replaceRange(s, (s + overwrite_string.length), overwrite_string)
        return answer
    }
}