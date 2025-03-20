class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        
        for (i in 0 .. t.length - p.length) {
            val num = t.substring(i, i + p.length).toLong()
            if (num <= p.toLong()) answer++
        }
        
        return answer
    }
}