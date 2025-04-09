fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val T = br.readLine().toInt()
    
    repeat(T) {
        val N = br.readLine().toInt()
        val X = br.readLine().split(" ").map { it.toInt() }
        
        // maximum subarray 구하기
        var max = X[0]
        var current = X[0]
        
        for (i in 1 ..< N) {
            current = maxOf(X[i], current + X[i])
            max = maxOf(max, current)
        }
        bw.write("$max\n")
    }
    
    bw.flush()
    bw.close()
}