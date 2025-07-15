fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    val M = br.readLine().toInt()
    val S = mutableSetOf<Int>()
    
    repeat(M) {
        val input = br.readLine().split(" ")
        
        when(input[0]) {
            "add" -> S.add(input[1].toInt())
            "remove" -> S.remove(input[1].toInt())
            "check" -> {
                if (S.contains(input[1].toInt())) bw.write("1") 
                else bw.write("0")
                bw.newLine()
            }
            "toggle" -> {
                if (S.contains(input[1].toInt())) {
                    S.remove(input[1].toInt()) 
                } else {
                    S.add(input[1].toInt())
                }
            }
            "all" -> {
                S.removeAll(S)
                S.addAll(1..20)
            }
            "empty" -> S.removeAll(S)
        } 
    }
    
    bw.flush()
    bw.close()
}