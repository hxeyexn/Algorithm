import java.util.LinkedList
import java.util.Stack

fun main() {
    val br = System.`in`.bufferedReader()
    val sb = StringBuilder()
    val n = br.readLine().toInt()
    
    val numbers = IntArray(n) { br.readLine().toInt() }    
    val stack = Stack<Int>()
    
    var latestNum = 1
    var isPossible = true
    
    // 가장 최근에 나온 수보다 progression이 크면 그만큼 + 출력 후 -출력 한번, i 변경
    // 가장 최근에 나온 수보다 작으면 - 한번 출력, i 변경
    for (number in numbers) {
        while (latestNum <= number) {
            stack.push(latestNum++)
            sb.appendLine('+')
        }
        
        if (number != stack.peek()) {
            isPossible = false
            break
        }
        
        stack.pop()
        sb.appendLine('-')
    }
    
    if (isPossible) print(sb)
    else print("NO")
}