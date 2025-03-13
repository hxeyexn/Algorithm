class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        
        val firstAnswer = intArrayOf(1, 2, 3, 4, 5)
        val secondAnswer = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val thirdAnswer = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        
        val solve = IntArray(3) { 0 }
        
        var j = 0
        
        for (i in 0 until answers.size) {
            if (j == firstAnswer.size) j = 0
            if (answers[i] == firstAnswer[j++]) solve[0]++
        }
        
        j = 0
        
        for (i in 0 until answers.size) {
            if (j == secondAnswer.size) j = 0
            if (answers[i] == secondAnswer[j++]) solve[1]++
        }
        
        j = 0
        
        for (i in 0 until answers.size) {
            if (j == thirdAnswer.size) j = 0
            if (answers[i] == thirdAnswer[j++]) solve[2]++
        }
        
        val max = solve.maxOrNull()
        
        for (k in 0..2) {
            if (solve[k] == max) answer = answer.plus(k + 1)
        }

        answer.sort()
        
        return answer
    }
}