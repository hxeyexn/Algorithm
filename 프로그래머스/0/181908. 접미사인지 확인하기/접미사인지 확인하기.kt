class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        val strings = 
            List(my_string.length) {
                my_string.slice(it until my_string.length)
            }
        
        return if (strings.contains(is_suffix)) 1 else 0
    }
}