fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val aCode = 'a'.code
    var count = 0
    
    repeat(N) {
        val visited = BooleanArray(26) { false }
        val word = br.readLine()
        var lastChar = ' '
        
        for (wordIdx in word.indices) {
            val idx = word[wordIdx].code - aCode
            if (lastChar != word[wordIdx] && visited[idx]) break
            if (wordIdx == word.length - 1) {
                count++
                break
            }
            visited[idx] = true
            lastChar = word[wordIdx]
        }
    }
    
    print("$count")
}