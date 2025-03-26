fun main() {
    val (H, W) = readln().split(" ").map { it.toInt() }
    val sky = Array(H) { IntArray(W) { -1 } }
    
    for (h in 0 ..< H) {
        val input = readln()
        var current = 0
        
        for (w in 0 ..< W) {
            if (input[w] == 'c') {
                current = 0
                sky[h][w] = 0
                current++
            } 
            else if (current != 0) {
                sky[h][w] = current
                current++
            } 
        }
    }
    
    sky.forEach {
        println(it.joinToString(" "))
    }
}