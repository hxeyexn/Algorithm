import java.util.LinkedList
import java.util.Stack

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    
    val progression = LinkedList<Int>()
    repeat(n) {
        progression.add(br.readLine().toInt())
    }
    
    var result = ArrayList<Char>()
    var latestNum = 0
    val stack = Stack<Int>()
    
    // 가장 최근에 나온 수보다 progression이 크면 그만큼 + 출력 후 -출력 한번, i 변경
    // 가장 최근에 나온 수보다 작으면 - 한번 출력, i 변경
    while (progression.isNotEmpty()) {
        val currentNum = progression.removeFirst()
        
        if (latestNum < currentNum) {
            for (i in latestNum + 1 .. currentNum) {
                stack.push(i)
                result.add('+')
            } 
            
            latestNum = currentNum
            stack.pop()
            result.add('-')
        } else {
            val remove = stack.peek()
            
            if (currentNum != remove) {
                result.clear()
                break
            }
            
            stack.pop()
            result.add('-')
        }
    }
    
    if (result.isNotEmpty()) {
        for (r in result) {
            bw.write("$r")
            bw.newLine()
        }
    } else {
        bw.write("NO")
    }
    
    bw.flush()
    bw.close()
}