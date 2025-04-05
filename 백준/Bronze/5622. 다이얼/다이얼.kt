fun main() { 
    val word = readln()
    val times = mutableMapOf<Char, Int>()
    var time = 3
    var count = 0
    var minTime = 0
    
    for (key in 'A' .. 'O') {
        times[key] = time
        count++
        if (count == 3) {
            time++
            count = 0
        }
    }
    
    for (key in 'P' .. 'Z') {
        times[key] = time
        if (key == 'S' || key == 'V') time++
    }
    
    for (w in word) {
        minTime += times[w] ?: 0
    }
    
    print("$minTime")
}