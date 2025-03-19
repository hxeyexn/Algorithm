fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    
    val array = Array(n + 1) { IntArray(m + 1) { 0 } }

    for (i in 1..n) {
        val input = br.readLine().split(" ").map { it.toInt() }
        for (j in 1 .. m) {
            array[i][j] = input[j - 1]
        }
    }
    
    val k = br.readLine().toInt()
    
    val inputs = List(k) { br.readLine() }
    
    inputs.forEach {
        var sum = 0
        
        val (i, j, x, y) = it.split(" ").map { input -> input.toInt() }
        
        for (a in i..x) {
            for (b in j..y) {
                sum += array[a][b]
            }
        }
        println(sum)
    }
}