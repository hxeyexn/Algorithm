fun main() {
    val (A, B, C) = readln().split(" ").map { it.toLong() }
    
    var base: Long = A % C
    var exp = B
    var result = 1L
    
    while (exp > 0) {
        if (exp % 2 == 1L) result = (result * base) % C
        
        base = (base * base) % C
        exp /= 2
    }
    
    print("$result")
}
