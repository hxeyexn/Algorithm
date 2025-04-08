class Solution {
    fun solution(n: Int, k: Int): Int {
        val juice = k - (n / 10) 
        return n * 12_000 + juice * 2000
    }
}