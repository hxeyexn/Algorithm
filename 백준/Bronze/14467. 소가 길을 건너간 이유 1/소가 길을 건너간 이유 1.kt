fun main() {
    val n = readln().toInt()
    val cows = mutableMapOf<Int, MutableList<Int>>()
    
    var result = 0
    
    repeat(n) {
        val (num, position) = readln().split(" ").map { it.toInt() }
        cows.computeIfAbsent(num) { mutableListOf() }.add(position)
    }
    
    cows.forEach {
        var currentPosition = it.value[0]
        
        for (i in 1 until it.value.size) {
            if (it.value[i] != currentPosition) {
                currentPosition = it.value[i]
                result++
            }
        }
    }
    
    print(result)
}