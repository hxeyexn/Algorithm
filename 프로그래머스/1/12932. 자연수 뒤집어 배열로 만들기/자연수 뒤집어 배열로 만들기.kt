class Solution {
    fun solution(n: Long): IntArray {
        val reversedStr = n.toString().reversed()

        val answer = IntArray(reversedStr.length) { 
            reversedStr[it].toString().toInt() 
        }

        return answer
    }
}