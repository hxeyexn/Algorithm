fun main() {
    val bw = System.out.bufferedWriter()
    val array = BooleanArray(10_001) { false }
    
    for (i in 1 .. 10_000) {
        val idx = i + i.toString().sumOf { it.digitToInt() }
        if (idx <= 10_000) array[idx] = true
    }
    
    for (i in 1 .. 10_000) {
        if (!array[i]) bw.write("$i\n")
    }
    
    bw.flush()
    bw.close()
}