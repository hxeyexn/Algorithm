class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode: Int = 0
        
        repeat(code.length) { idx ->
            if (mode == 0) {
                if (code[idx] != '1' && idx % 2 == 0) answer += code[idx]
                if (code[idx] == '1') mode = 1
            } else {
                if (code[idx] != '1' && idx % 2 == 1) answer += code[idx]
                if (code[idx] == '1') mode = 0
            }
        }
        return if (answer.isEmpty()) "EMPTY" else answer
    }
}