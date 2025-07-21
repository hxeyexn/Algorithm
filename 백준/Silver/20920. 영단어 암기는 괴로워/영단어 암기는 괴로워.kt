// 1. 자주 나오는 단어일수록 앞에 배치
// 2. 해당 단어의 길이가 길수록 앞에 배치
// 3. 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    
    val words = mutableMapOf<String, Int>()
    
    repeat(N) {
        val word = br.readLine()
        
        if (word.length >= M) {
            words[word] = words.getOrDefault(word, 0) + 1
        }
    }
    
    val sortedWords =
        words.entries.sortedWith(
            compareByDescending<MutableMap.MutableEntry<String, Int>> { it.value }
                .thenByDescending { it.key.length }
                .thenBy { it.key }
        )
    
    sortedWords.forEach {
        bw.write("${it.key}")
        bw.newLine()
    }
    
    bw.flush()
    bw.close()
}