
fun main() {
    val br = System.`in`.bufferedReader()
    
    // N을 읽음
    val N = br.readLine().toInt()
    // N개의 정수를 읽음
    val numbers = br.readLine().split(" ").map { it.toInt() }
    
    // maxOrNull, minOrNull
    val min = numbers.minOrNull()
    val max = numbers.maxOrNull()
    
    print("$min $max")
}