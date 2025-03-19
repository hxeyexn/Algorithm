fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val numbers = br.readLine().split(" ").map { it.toInt() }
    val sum = IntArray(n + 1) { 0 }
    
    for (i in 1 .. n) {
        sum[i] = sum[i - 1] + numbers[i - 1]
    }
    
    repeat(m) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        bw.write("${sum[j] - sum[i - 1]}\n")
    }
    
    bw.flush()
    bw.close()
}