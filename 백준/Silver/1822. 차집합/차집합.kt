fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (aSize, bSize) = br.readLine().split(" ").map { it.toInt() }
    
    val A = br.readLine().split(" ").map { it.toInt() }.toSet()
    val B = br.readLine().split(" ").map { it.toInt() }.toSet()
    
    val result = A.subtract(B)
    bw.write("${result.size}")
    bw.newLine()
    
    if (result.isNotEmpty()) {
        result.sorted().forEach {
            bw.write("$it ")
        }
    }
    
    bw.flush()
    bw.close()
}