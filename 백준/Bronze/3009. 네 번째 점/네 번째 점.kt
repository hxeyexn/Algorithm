fun main() {
    val xMap = mutableMapOf<Int, Int>()
    val yMap = mutableMapOf<Int, Int>()
    
    repeat(3) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        xMap[x] = xMap.getOrDefault(x, 0) + 1
        yMap[y] = yMap.getOrDefault(y, 0) + 1
    }
    
    val x = xMap.entries.first { it.value == 1 }.key
    val y = yMap.entries.first { it.value == 1 }.key
    
    print("$x $y")
}
