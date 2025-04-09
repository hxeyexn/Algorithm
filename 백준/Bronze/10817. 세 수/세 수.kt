fun main() {
    val input = readln().split(" ").map { it.toInt() }.toMutableList()
    input.sort()
    
    print(input[1])
}