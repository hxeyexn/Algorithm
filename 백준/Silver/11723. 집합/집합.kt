fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    val M = br.readLine().toInt()
    val S = mutableSetOf<Int>()
    
    repeat(M) {
        val input = br.readLine().split(" ")
        val operation = input[0]
        val x = input.getOrNull(1)?.toInt() ?: 0
        
        when(operation) {
            "add" -> S.add(x)
            "remove" -> S.remove(x)
            "check" -> {
                if (S.contains(x)) bw.write("1") 
                else bw.write("0")
                bw.newLine()
            }
            "toggle" -> {
                if (S.contains(x)) {
                    S.remove(x) 
                } else {
                    S.add(x)
                }
            }
            "all" -> {
                S.clear()
                S.addAll(1..20)
            }
            "empty" -> S.clear()
        } 
    }
    
    bw.flush()
    bw.close()
}