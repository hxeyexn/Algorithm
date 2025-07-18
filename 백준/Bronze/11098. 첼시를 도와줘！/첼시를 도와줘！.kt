fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    
    repeat(n) {
        val p = br.readLine().toInt()
        var player = ""
        var max = 0
        
        repeat(p) {
            val (C, name) = br.readLine().split(" ")
            if (C.toInt() > max) {
                max = C.toInt()
                player = name
            }
        }
        
        println(player)
    }
}