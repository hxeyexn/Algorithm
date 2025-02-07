fun main() {
    val n = readln().toInt()
    val seats = readln()
    
    val sCount = seats.count { it == 'S' }
    val lCount = seats.count { it == 'L' } / 2
    
    val count = sCount + lCount + 1
    
    if (count > n) print("$n") else print("$count")
}