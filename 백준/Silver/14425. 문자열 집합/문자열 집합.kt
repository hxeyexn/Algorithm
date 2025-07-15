fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    
    val S = mutableSetOf<String>()
    var count = 0
    
    repeat(N) {
        val word = br.readLine()
        S.add(word)
    }
    
    repeat(M) {
        val word = br.readLine()
        if (S.contains(word)) count++
    }
    
    print("$count")
}