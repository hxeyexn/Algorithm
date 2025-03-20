class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        
        for (command in commands) {
            val (i, j, k) = command
            val slice = array.slice(i - 1 until j).sorted()
            answer = answer.plus(slice[k - 1])
        }
        
        return answer
    }
}