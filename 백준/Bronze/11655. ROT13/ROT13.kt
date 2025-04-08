fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val input = br.readLine()

    for (char in input) {
        when {
            char.isUpperCase() -> {
                var char = char
            
                repeat(13) {
                    if (char == 'Z') char = 'A'
                    else char += 1
                }
                bw.write("$char")
            } 
            char.isLowerCase() -> {
                var char = char
            
                repeat(13) {
                    if (char == 'z') char = 'a'
                    else char += 1
                }
                bw.write("$char")
            }
            else -> {
                bw.write("$char")
            }
        }
    }
    
    bw.flush()
    bw.close()
}