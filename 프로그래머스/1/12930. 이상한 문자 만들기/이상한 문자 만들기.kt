class Solution {
    fun solution(s: String): String {
        val words = s.split(" ")
        val answer = mutableListOf<String>()
        
        for (word in words) {
            val newWord =
                word.mapIndexed { idx, char ->
                    if (idx % 2 == 0) char.uppercase()
                    else char.lowercase()
                }
            answer.add(newWord.joinToString(""))
        }
        
        return answer.joinToString(" ")
    }
}