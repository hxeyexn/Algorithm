fun main() {
    val t = readln().toInt()
    
    repeat(t) {
        var c = readln().toInt()
        var count = mutableListOf(0, 0, 0, 0) 
        
        count[0] = c / 25
        c %= 25
        
        while (c > 0) {
            if (c % 10 == 0) {
                count[1] = c / 10
                c = 0
            } else if (c % 10 >= 5) {
                count[2]++
                c -= 5
            } else {
                count[3] = c % 10
                c -= c % 10
            }
        }
        
        println(count.joinToString(" "))
    }
}