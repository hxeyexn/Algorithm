fun main() {
    val (X, Y) = readln().split(" ")
    val revX = X.reversed()
    val revY = Y.reversed()
    
    val revSum = (revX.toInt() + revY.toInt()).toString()
    
    print(revSum.reversed().toInt())
}