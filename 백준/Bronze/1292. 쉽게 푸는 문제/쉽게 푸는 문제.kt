fun main() {
    val (A, B) = readln().split(" ").map { it.toInt() }
    val array = IntArray(B + 1) { 0 }
    
    var idx = 1
    var currentNum = 1
    
    while (idx <= B) {
        for (num in 1 .. currentNum) {
            if (idx > B) break
            array[idx++] = currentNum
        }
        currentNum++
    }
    
    print(array.slice(A .. B).sum())
}