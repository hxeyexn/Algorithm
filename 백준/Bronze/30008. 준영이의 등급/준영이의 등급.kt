fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val grade = readln().split(" ").map { it.toInt() }
    
    val pList = List(k) { grade[it] * 100 / n }
    
    for (p in pList) {
        when(p) {
            in 0..4 -> print("1 ")
            in 5..11 -> print("2 ")
            in 12..23 -> print("3 ")
            in 24..40 -> print("4 ")
            in 41..60 -> print("5 ")
            in 61..77 -> print("6 ")
            in 77..89 -> print("7 ")
            in 90..96 -> print("8 ")
            else -> print("9 ") 
        }
    }
}