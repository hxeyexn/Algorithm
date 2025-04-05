// 1. 평균 계산 -> 모든 수의 합 / 수의 개수
// 2. 중앙값 계산 -> 정렬, 중앙값 찾기 0 1 2 3 4
fun main() {
    val numbers = Array(5) { 0 }
    
    repeat(numbers.size) {
        val n = readln().toInt()
        numbers[it] = n
    }
    
    val avg = numbers.sum() / numbers.size
    println("$avg")
    
    numbers.sort()
    val mid = numbers[numbers.size / 2]
    println("$mid")
}