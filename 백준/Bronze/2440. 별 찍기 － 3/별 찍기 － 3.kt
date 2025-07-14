fun main() {
    val n = readln().toInt()
    
    for (i in n downTo 1) {
        repeat(i) {
            print("*")
        }
        
        println()
    }
}