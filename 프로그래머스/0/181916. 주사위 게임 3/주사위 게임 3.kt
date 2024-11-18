import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val sortedNumbers = listOf(a, b, c, d).sorted()
        val numbers = sortedNumbers.toSet()
        var answer: Int = 0
        
        when (numbers.size) {
            1 -> answer = 1111 * numbers.first() 
            2 -> {
                when {
                    sortedNumbers[1] != sortedNumbers[2] -> {
                        answer = (numbers.first() + numbers.last()) * abs(numbers.first() - numbers.last())
                    }
                    sortedNumbers[1] == sortedNumbers[2] -> {
                        if (sortedNumbers[0] == sortedNumbers[1]) {
                            answer = (10.0 * numbers.first() + numbers.last()).pow(2).toInt() 
                        } else {
                            answer = (10.0 * numbers.last() + numbers.first()).pow(2).toInt() 
                        }
                    }
                }
            }
            3 -> {
                if (sortedNumbers[0] == sortedNumbers[1]) {
                    answer = sortedNumbers[2] * sortedNumbers[3]
                } else if (sortedNumbers[1] == sortedNumbers[2]) {
                    answer = sortedNumbers[0] * sortedNumbers[3]
                } else {
                    answer = sortedNumbers[0] * sortedNumbers[1]
                }
            }
            4 -> answer = sortedNumbers.first()
        }
        
        return answer
    }
}