class Solution {
    fun solution(my_string: String, s: Int, e: Int): String = 
        my_string.replaceRange(s, e + 1, my_string.slice(s..e).reversed())
}