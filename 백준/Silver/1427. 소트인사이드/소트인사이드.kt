fun main() {
    val N = readln().toMutableList()
    N.sortDescending()
    print(N.joinToString(""))
}