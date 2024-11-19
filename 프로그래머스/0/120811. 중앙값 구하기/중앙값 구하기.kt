class Solution {
    fun solution(array: IntArray): Int {
        val sortedArray = array.sorted()
        val center = array.size / 2
    
        return sortedArray[center]
    }
}