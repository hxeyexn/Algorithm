fun main() {
    val count = readln().toInt()
    val number = readln()
    var answer = 0
    
    repeat(count) {
        answer += number[it].digitToInt()
    }
    
    println(answer)
}