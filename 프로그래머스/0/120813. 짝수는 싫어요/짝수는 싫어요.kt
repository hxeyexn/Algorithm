class Solution {
    fun solution(n: Int): IntArray = (1..n).filter { it % 2 == 1 }.toIntArray()
}