fun main() {
    val br = System.`in`.bufferedReader()

    val (N, d, k, c) = br.readLine().split(" ").map { it.toInt() }
    val belt = IntArray(N) { br.readLine().toInt() }
    
    var start = 0
    var end = k - 1
    var max = 0
    
    while (start <= N - 1) {
        var count = 0
        val visit = BooleanArray(3001) { false }
        
        if (start < end) {
            for (i in start .. end) {
                if (!visit[belt[i]]) {
                    count++
                    visit[belt[i]] = true
                }
            }
        } else {
            for (i in start ..< N) {
                if (!visit[belt[i]]) {
                    count++
                    visit[belt[i]] = true
                }
            }
            for (i in 0 .. end) {
                if (!visit[belt[i]]) {
                    count++
                    visit[belt[i]] = true
                }
            }
        }

        if (!visit[c]) count++
        if (max < count) max = count
        
        start++
        if (end == N - 1) end = 0
        else end++
    }
    
    println(max)
}