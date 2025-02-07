fun main() {
    var count = 1
    
    while (true) {
        val (l, p, v) = readln().split(" ").map { it.toInt() }
        if (l == 0 && p == 0 && v == 0) break

        val restV = v - (v / p) * p
        val day = (v / p) * l + if (restV > l) l else restV

        println("Case ${count++}: $day")
    }
}