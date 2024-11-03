class Solution {
    fun solution(a: Int, b: Int): Int {
        val s1 = String.format("%d%d", a, b).toInt()
        val s2 = String.format("%d%d", b, a).toInt()
        
        return if (s1 >= s2) s1 else s2
    }
}