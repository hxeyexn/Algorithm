class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        val status = 
            when (ineq + eq) {
                ">=" -> n >= m
                "<=" -> n <= m
                ">!" -> n > m
                "<!" -> n < m
                else -> false
            }
        
        return if (status) 1 else 0
    }
}