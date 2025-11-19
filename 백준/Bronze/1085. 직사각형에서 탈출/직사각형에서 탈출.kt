import kotlin.math.min

fun main() {
    val (x, y, w, h) = readln().split(" ").map { it.toInt() }
    
    val minY = min(y, h - y)
    val minX = min(x, w - x)
    
    val minLength = min(minX, minY)
    print(minLength)
}