fun main() {
    val (R1, S) = readln().split(" ").map { it.toInt() }
    val result = S * 2 - R1
    
    print(result)
}