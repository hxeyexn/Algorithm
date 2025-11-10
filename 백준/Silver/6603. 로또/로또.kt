import java.util.StringTokenizer

val sb = StringBuilder()
val br = System.`in`.bufferedReader()
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val input = StringTokenizer(br.readLine())
        val k = input.nextToken().toInt()
        if (k == 0) break
        
        val S = IntArray(k) { input.nextToken().toInt() }
        val progression = ArrayList<Int>()
        
        backtracking(k, 0, S, progression)
        sb.appendLine()
    }
    
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

    
fun backtracking(
    k: Int,
    start: Int,
    s: IntArray,
    progression: ArrayList<Int>,
) {
    if (progression.size == 6) {
        sb.appendLine(progression.joinToString(" "))
        return
    }
    
    for (i in start ..< k) {
        progression.add(s[i])
        backtracking(k, i + 1, s, progression)
        progression.removeLast()
    }
}
