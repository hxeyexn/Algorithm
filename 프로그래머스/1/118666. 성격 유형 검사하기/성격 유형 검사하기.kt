class Solution {    
    val result = 
        mutableMapOf(
            'R' to 0, 
            'T' to 0, 
            'C' to 0, 
            'F' to 0, 
            'J' to 0, 
            'M' to 0,
            'A' to 0,
            'N' to 0,
        )
        
    val scores = intArrayOf(3, 2, 1, 0, 1, 2, 3)
    
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        
        for (i in survey.indices) {
            val type = when {
                choices[i] < 4 -> survey[i][0]
                choices[i] > 4 -> survey[i][1]
                else -> 'e'
            }
            
            result[type] = result[type]?.plus(scores[choices[i] - 1]) ?: 0
        }
        
        val r = result['R'] ?: 0
        val t = result['T'] ?: 0
        val c = result['C'] ?: 0
        val f = result['F'] ?: 0
        val j = result['J'] ?: 0
        val m = result['M'] ?: 0
        val a = result['A'] ?: 0
        val n = result['N'] ?: 0
    
        answer += if (r >= t) 'R' else 'T'
        answer += if (c >= f) 'C' else 'F'
        answer += if (j >= m) 'J' else 'M'
        answer += if (a >= n) 'A' else 'N'
        
        return answer
    }
}