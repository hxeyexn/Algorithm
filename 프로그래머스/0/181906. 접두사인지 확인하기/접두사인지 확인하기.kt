class Solution {
    fun solution(my_string: String, is_prefix: String): Int = 
        if (my_string.take(is_prefix.length) == is_prefix) 1 else 0
}