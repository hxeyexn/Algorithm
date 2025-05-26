fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    
    val firstMatrix = Array(N) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }
    val secondMatrix = Array(N) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }
    
    for (i in 0 until N) {
        for (j in 0 until M) {
            firstMatrix[i][j] += secondMatrix[i][j]
            bw.write("${firstMatrix[i][j]} ")
        }
        bw.write("\n")
    }
    
    bw.flush()
    bw.close()
}