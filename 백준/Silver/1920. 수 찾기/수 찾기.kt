fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }.sorted()
    val mCount= readln().toInt()
    val m = readln().split(" ").map { it.toInt() }

    for (i in 0 until mCount) {
        println(solve(n, i, a, m))
    }
}

fun solve(n: Int, i: Int, a: List<Int>, m: List<Int>): Int {
    var start = 0
    var end = n - 1

    while (start <= end) {
        var mid = (start + end) / 2
        when {
            m[i] < a[mid] -> end = mid - 1
            m[i] > a[mid] -> start = mid + 1
            else -> return 1
        }
    }
    return 0
}