fun main() {
    val br = System.`in`.bufferedReader()
    val X = br.readLine().toInt()
    val N = br.readLine().toInt()
    var totalAmount: Int = 0
    
    repeat(N) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        totalAmount += a * b
    }
    
    if (X == totalAmount) print("Yes") else print("No")
}