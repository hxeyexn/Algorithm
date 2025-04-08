fun main() {
    val (A, B) = readln().split(" ").map { it.toInt() }
    val array = arrayListOf<Int>()
    var sum = 0
    
    for (i in 1 .. B) {
        for (j in 1 .. i) {
            array.add(i)
        }
    }

    for (i in A - 1 ..< B) {
        sum += array[i]
    }
    
    print(sum)
}