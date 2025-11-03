import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val C = br.readLine().toInt()
    
    repeat(C) {
        val st = StringTokenizer(br.readLine())
        val N = st.nextToken().toInt()
        val scores = IntArray(N) { st.nextToken().toInt() }
        
        val average = scores.sum() / N 
        val count = scores.count { it > average }
        
        val result = (count.toDouble() / N) * 100
        println("${"%.3f".format(result)}%")
    }
}