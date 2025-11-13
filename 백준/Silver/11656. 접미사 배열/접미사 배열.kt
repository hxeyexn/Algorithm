fun main() {
    val S = readln()
    val suffix = mutableListOf<String>()
    val sb = StringBuilder()
    
    for (i in S.indices) {
        suffix.add(S.substring(i, S.length))
    }
    
    suffix.sort()
    
    for (s in suffix) {
        sb.appendLine(s)
    }
    
    print(sb.toString())
}