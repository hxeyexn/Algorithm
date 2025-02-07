fun main() {
    val t = readln().toInt()
    
    repeat(t) {
        var c = readln().toInt()
        
        print("${c / 25} ")
        c %= 25
        
        print("${c / 10} ")
        c %= 10
        
        print("${c / 5} ")
        c %= 5
        
        println("${c}")
    }
}