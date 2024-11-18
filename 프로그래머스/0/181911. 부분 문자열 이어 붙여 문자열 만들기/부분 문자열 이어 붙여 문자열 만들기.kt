class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        
        parts.mapIndexed { idx, part -> 
            answer += my_strings[idx].slice(part[0] .. part[1])
        }
        
        return answer
    }
}