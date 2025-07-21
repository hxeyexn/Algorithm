fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    // 테스트케이스의 개수 T
    val T = br.readLine().toInt()
    
    repeat(T) {
        val N = br.readLine().toInt()
        val note1 = mutableMapOf<Int, Boolean>()
        val tempNote1 = br.readLine().split(" ").map { it.toInt() }
        
        for (x in tempNote1) {
            note1[x] = true
        }
        
        val M = br.readLine().toInt()
        val note2 = br.readLine().split(" ").map { it.toInt() }
        
        for (x in note2) {
            val result = if (note1.containsKey(x)) 1 else 0
            bw.write("$result")
            bw.newLine()
        }
    }
    
    bw.flush()
    bw.close()
}