fun main() {
    val br = System.`in`.bufferedReader()
    val sb = StringBuilder()
    
    while (true) {
        val input = br.readLine() ?: break
        
        sb.appendLine(input)
    }
    
    print(sb.toString())
}