class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        sizes.map { it.sort() }
        val x = sizes.maxOfOrNull { it[0] } ?: 0
        val y = sizes.maxOfOrNull { it[1] } ?: 0
        
        return x * y
    }
}