import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
   
    val (N, K) = br.readLine().split(" ").map { it.toInt() }
    val countries = Array(N) { IntArray(4) { 0 } }
    
    for (i in countries.indices) {
        val input = StringTokenizer(br.readLine())
        
        for (j in 0 .. 3) {
            countries[i][j] = input.nextToken().toInt() 
        }
    }
    
    countries.sortWith(
        compareByDescending<IntArray> { it[1] }
            .thenByDescending { it[2] }
            .thenByDescending { it[3] }
    )
    
    val idx = countries.indexOfFirst { it[0] == K }
    val target = countries[idx]
    var rank = 1
    
    for (i in 0 ..< idx) {
        val country = countries[i]
        
        if (country[1] > target[1] || 
            country[1] == target[1] && country[2] > target[2] ||
            country[1] == target[1] && country[2] == target[2] && country[3] > target[3]) {
            rank++
        }
    }
    
    print(rank)
}