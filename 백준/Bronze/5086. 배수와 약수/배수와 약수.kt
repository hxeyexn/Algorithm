fun main() {
    val sb = StringBuilder()
    
    while(true) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        if (a == 0 && b == 0) break
        
        val result = 
            when {
                b % a == 0 -> "factor"
                a % b == 0 -> "multiple"
                else -> "neither"
            }
        
        sb.appendLine(result)
    }
    
    print(sb.toString())
}