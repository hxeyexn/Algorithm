import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val M = br.readLine().toInt()
    
    val input = StringTokenizer(br.readLine())
    val materials = IntArray(N) { input.nextToken().toInt() }
    materials.sort()
    
    var start = 0
    var end = N - 1
    var count = 0

    while (start < end) {
        val sum = materials[start] + materials[end]
        
        when {
            sum < M -> start++
            sum > M -> end--
            else -> {
                start++
                end--
                count++
            }
        }
    } 
    
    print("$count")
}