fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val T = br.readLine().toInt()

    repeat(T) {
        val (N, M) = br.readLine().split(" ").map { it.toInt() }
        val A = br.readLine().split(" ").map { it.toInt() }
        val B = br.readLine().split(" ").map { it.toInt() }.toMutableList()
        B.sort()
        
        var count = 0
        for (a in A) {
            var start = 0
            var end = M - 1
            
            while (start <= end) {
                var mid = (start + end) / 2
                
                if (B[mid] < a) start = mid + 1
                else end = mid - 1
            }
            count += start
        }
        
        bw.write("$count\n")
    }
    
    bw.flush()
    bw.close()
}