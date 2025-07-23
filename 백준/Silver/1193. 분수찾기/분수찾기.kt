fun main() {
    val X = readln().toInt()
    
    var n = 1
    var sum = 0
    
    var x = 0
    var y = 0
    
    while (sum + n < X) {
        sum += n
        n++
    }
    
    for (i in 1 .. X - sum) {
        if (n % 2 == 0) {
            x = i
            y = n - i + 1
        } else {
            x = n - i + 1
            y = i
        }
    }
    
    print("${x}/${y}")
}