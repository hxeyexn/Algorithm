fun main() {
    val n = readln().toInt()
    val pList = readln().split(" ").map { it.toInt() }.toMutableList()
    pList.sort()
    
    var lastP = 0
    var sum = 0
    for (p in pList) {
        lastP += p
        sum += lastP
    }
    
    print("$sum")
}