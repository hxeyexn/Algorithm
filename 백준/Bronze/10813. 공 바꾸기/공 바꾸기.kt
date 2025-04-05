fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val basket = Array(N + 1) { 0 }
    
    for (i in 1..N) {
        basket[i] = i
    }
    
    repeat(M) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        basket[i] = basket[j].also { basket[j] = basket[i] }
    }
    
    for (num in 1 .. N) {
        print("${basket[num]} ")
    }
}