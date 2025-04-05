fun main() {
    val fibo = mutableListOf(0, 1)
    val n = readln().toInt()

    if (n == 0 || n == 1) print(n)
    else {
        for (i in 0 .. n - 2) {
            fibo.add(fibo[i] + fibo[i + 1])
        }
        print(fibo.last())
    }
}