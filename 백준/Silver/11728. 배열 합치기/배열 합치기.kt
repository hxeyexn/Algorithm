import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    
    val a = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val b = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    
    var i = 0
    var j = 0
    
    while(i < n && j < m) {
        if (a[i] <= b[j]) bw.write("${a[i++]} ")
        else bw.write("${b[j++]} ")
    }
    
    // b가 모두 먼저 출력된 후 b에 남은 게 있을 수 있음
    while (i < n) { bw.write("${a[i++]} ") }
    // a가 모두 먼저 출력된 후 b에 남은 게 있을 수 있음
    while (j < m) { bw.write("${b[j++]} ") }
    
    bw.flush()
    bw.close()
}