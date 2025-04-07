fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    while (true) {
        val n = br.readLine().toInt()
        if (n == -1) break

        var deno = mutableListOf(1)
        var i = 2
        
        while (i * i <= n) {
            if (n % i == 0) deno.addAll(listOf(i, n / i))
            i++
        }
        
        if (deno.sum() == n) {
            deno.sort()
            bw.write("$n = ")
            bw.write("${deno.joinToString(" + ")}\n")
        } else {
            bw.write("$n is NOT perfect.\n")
        }
    }
    
    bw.flush()
    bw.close()
}
