class Solution {
        fun solution(n: Long): Long {
        var answer: Long = 0
        var num = n.toString()
        var arr = num.toCharArray().sortedArrayDescending()
        
        answer = String(arr).toLong()

        return answer
    }
}