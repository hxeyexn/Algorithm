import kotlin.math.*

fun main() {
    val alphabet = mutableMapOf<Char, Int>()
    var value = 1
    
    for (char in 'a'..'z') {
        alphabet[char] = value++
    }

    val l = readln().toInt()
    val input = readln()
    
    var sum = 0
    
    repeat(l) {
        val num = alphabet[input[it]] ?: 0
        sum += (num * (31.0).pow(it)).toInt()
    }
    
    println("$sum")
}