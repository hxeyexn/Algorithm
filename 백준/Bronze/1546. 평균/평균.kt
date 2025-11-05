import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    
    val input = StringTokenizer(br.readLine())
    val scores = DoubleArray(N) { input.nextToken().toDouble() }
    
    // 자기 점수 중에 최댓값
    val M = scores.max()
    
    repeat(N) {
        scores[it] = scores[it] / M * 100
    }
    
    val newAverage = scores.sumOf { it } / N
    
    print(newAverage)
    
}