fun main() { 
    val word = readln()
    var minTime = 0
   
    for (w in word) {
        minTime += 
            when (w) {
                in 'A' .. 'C' -> 3
                in 'D' .. 'F' -> 4
                in 'G' .. 'I' -> 5
                in 'J' .. 'L' -> 6
                in 'M' .. 'O' -> 7
                in 'P' .. 'S' -> 8
                in 'T' .. 'V' -> 9
                in 'W' .. 'Z' -> 10
                else -> 0
            }
    }
    
    print("$minTime")
}