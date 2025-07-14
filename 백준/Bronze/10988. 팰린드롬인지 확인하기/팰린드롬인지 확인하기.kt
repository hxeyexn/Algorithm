import java.util.Stack

fun main() {
    val word = readln()
    val stack = Stack<Char>()
    var result = 1
    
    word.forEach {
        stack.push(it)
    }
    
    for (i in 0 until word.length / 2) {
        if (word[i] != stack.pop()) {
            result = 0
            break
        }
    }
    
    print(result)
}