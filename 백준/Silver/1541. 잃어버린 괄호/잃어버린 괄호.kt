fun main() {
    val elements = 
        readln().split("-").map { element ->
            if (element == "") 0
            else element.split("+").sumOf { it.toInt() }
        }

    var sum = 0
    
    if (elements[0] == 0) {
        sum += elements[1].unaryMinus()
        
        for (idx in 2..< elements.size) {
            sum += elements[idx].unaryMinus()
        }
    } else {
        sum += elements[0]
        
        for (idx in 1..< elements.size) {
            sum += elements[idx].unaryMinus()
        }
    }
    
    print("$sum")
}