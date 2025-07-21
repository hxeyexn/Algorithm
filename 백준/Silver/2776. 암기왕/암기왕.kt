import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    // 테스트케이스의 개수 T
    val T = br.readLine().toInt()
    
    repeat(T) {
        val N = br.readLine().toInt()
        val set = HashSet<Int>()
        val note1 = StringTokenizer(br.readLine())
        
        repeat(N) {
            set.add(note1.nextToken().toInt())
        }

        val M = br.readLine().toInt()
        val note2 = StringTokenizer(br.readLine())
        
        repeat(M) {
            val result = if (set.contains(note2.nextToken().toInt())) 1 else 0
            bw.write("$result")
            bw.newLine()
        }
    }
    
    bw.flush()
    bw.close()
}