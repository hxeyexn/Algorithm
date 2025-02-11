fun main() {
    val elements = 
        readln().split("-").map { element ->
            element.split("+").sumOf { it.toInt() }
        }
    
    var sum = elements[0]
    
    for (idx in 1..< elements.size) {
        sum -= elements[idx]
    }
    
    print("$sum")
}