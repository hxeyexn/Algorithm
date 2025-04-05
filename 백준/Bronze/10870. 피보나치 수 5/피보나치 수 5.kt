fun main() {
    val n = readln().toInt()
    val fibo = Array(n + 2) { 0 }
    
    fibo[0] = 0
    fibo[1] = 1
    
    if (n == 0 || n == 1) print(fibo[n])
    else {
        for (i in 2 .. n) {
            fibo[i] = fibo[i - 1] + fibo[i - 2]
        }
        print(fibo[n])
    }
}