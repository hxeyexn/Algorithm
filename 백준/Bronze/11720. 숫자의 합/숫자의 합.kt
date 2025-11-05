fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val numbers = br.readLine().map { it.digitToInt() }
    
    val sum = numbers.sumOf { it }
    print(sum)
}