class Solution {
    fun solution(a: Int, b: Int): Long {
        var sum = 0L
        
        if (a < b) {
            for(i in a..b) {
                sum += i
            }
        } else {
            for(i in b..a) {
                sum += i
            }
        }
        
        return sum.toLong()
    }
}