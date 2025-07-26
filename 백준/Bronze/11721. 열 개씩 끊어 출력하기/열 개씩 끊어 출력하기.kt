fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val word = br.readLine().map { it }
    var count = 0
    
    repeat(word.size / 10) {
        for (i in count .. count + 9) {
            bw.write("${word[i]}")
        }
        bw.newLine()
        count += 10
    }
    
    for (i in count until word.size) {
        bw.write("${word[i]}")
    }
    
    bw.flush()
    bw.close()
}