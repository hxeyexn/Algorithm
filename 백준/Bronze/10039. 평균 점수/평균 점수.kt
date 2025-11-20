fun main() {
    var sum = 0
    
    repeat(5) {
        val score = readln().toInt()
        
        if (score < 40) sum += 40
        else sum += score
    }
    
    println(sum / 5)
}