class Solution {
    fun solution(n: Int): Int = 
        if (n % 2 == 1) (1..n step 2).sum() else (2..n step 2).sumOf { it * it }
}