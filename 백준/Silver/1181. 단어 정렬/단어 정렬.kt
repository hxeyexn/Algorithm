fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val N = br.readLine().toInt()
    val words = mutableListOf<String>()

    repeat(N) {
        words.add(br.readLine())
    }

    words.sort()
    words.sortBy { it.length }
    val sortedWords = words.toSet()

    for (word in sortedWords) {
        bw.write("${word}\n")
    }

    bw.flush()
    bw.close()
}
