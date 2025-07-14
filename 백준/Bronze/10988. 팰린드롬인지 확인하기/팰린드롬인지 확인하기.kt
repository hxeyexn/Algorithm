import java.util.Stack

fun main() {
    val word = readln()
    val stack = Stack<Char>()
    var result = 0
    
    word.forEach {
        stack.push(it)
    }
    
    for (i in 0 until word.length) {
        if (word[i] == stack.pop()) result = 1
        else {
            result = 0
            break
        }
    }
    
    print(result)
}