class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        repeat(my_string.length) {
            answer += my_string.slice(it until my_string.length)
        }
        
        return answer.toList().sorted().toTypedArray()
    }
}