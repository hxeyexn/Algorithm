fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val N = br.readLine().toInt()
    val extensions = mutableMapOf<String, Int>()
    
    repeat(N) {
        val file = br.readLine().split(".").last()
        extensions.compute(file) { _, value -> (value ?: 0) + 1 }
    }
    
    val sortedExtensions = extensions.toSortedMap()

    for (extension in sortedExtensions) {
        bw.write("${extension.key} ${extension.value}\n")
    }

    bw.flush()
    bw.close()
}