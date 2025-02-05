fun main() {
    val n = readln().toInt()
    val numbers = 
        MutableList(n) { 
            val input = readln().split(" ").map { it.toInt() }
            input[0] to input[1]
        }
    
    numbers.sortBy { it.first }
    numbers.sortBy { it.second }

    numbers.map { println("${it.first} ${it.second}") }
}