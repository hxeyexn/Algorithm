// A -> D, B -> E, C -> F 알파벳 문자를 3개씩 건너뛰어
fun main() { 
    // key 변환 후, 변환 전
    val caesar = mutableMapOf<Char, Char>()
    
    // A는 65, B는 66
    ('A' .. 'W').forEach {
        caesar[it + 3] = it
    }
    
    ('A' .. 'C').forEach {
        caesar[it] = it + 23
    }
    
    val input = readln()
    
    repeat(input.length) {
        print("${caesar[input[it]]}")
    }
}