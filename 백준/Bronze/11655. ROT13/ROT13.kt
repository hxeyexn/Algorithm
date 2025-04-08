fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val input = br.readLine()
    
    
    val uppercase = CharArray(26) { ' ' }
    val lowercase = CharArray(26) { ' ' }
    
    for (upper in 'A' .. 'Z') {
        val idx = upper - 'A'
        uppercase[idx] = upper
    }
    
    for (lower in 'a' .. 'z') {
        val idx = lower - 'a'
        lowercase[idx] = lower
    }
    
    for (char in input) {
        var idx = 0
        
        when {
            char.isUpperCase() -> {
                idx = char - 'A'
            
                repeat(13) {
                    if (idx == 25) idx = 0
                    else idx++
                }
                bw.write("${uppercase[idx]}")
            } 
            char.isLowerCase() -> {
                idx = char - 'a'
            
                repeat(13) {
                    if (idx == 25) idx = 0
                    else idx++
                }
                bw.write("${lowercase[idx]}")
            }
            else -> {
                bw.write("$char")
            }
        }
    }
    
    bw.flush()
    bw.close()
}