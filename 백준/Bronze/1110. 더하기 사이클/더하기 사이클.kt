fun main() {
    val N = String.format("%02d", readln().toInt())
    var count = 0
    var newNum = N

    while (true) {
        val sum = newNum.sumOf { it.digitToInt() }
        newNum = "${newNum.last()}${sum % 10}"
        count++
        if (N == newNum) break
    }

    print("$count")
}