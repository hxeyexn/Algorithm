fun main() {
    val br = System.`in`.bufferedReader()
    val xList = mutableListOf<Int>()
    val yList = mutableListOf<Int>()
    
    repeat(3) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        xList.add(x)
        yList.add(y)
    }
    
    val x = xList.first { value -> xList.count { it == value } == 1 }
    val y = yList.first { value -> yList.count { it == value } == 1 }
    
    print("$x $y")
}
