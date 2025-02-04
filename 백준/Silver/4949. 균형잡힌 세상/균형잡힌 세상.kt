import java.util.Stack

fun main() {
    val sentences = mutableListOf<String>()

    while (true) {
        val sentence = readln()
        if (sentence == ".") break
        else sentences.add(sentence)
    }

    for (sentence in sentences) { 
        val stack = Stack<Char>()
        for (s in sentence) {
            when (s) {
                '(', '[' -> stack.push(s)
                ')' -> {
                    if (!stack.isEmpty() && stack.peek() == '(') stack.pop()
                    else stack.push(s)
                }
                ']' -> {
                    if (!stack.isEmpty() && stack.peek() == '[') stack.pop()
                    else stack.push(s)
                }
            }
        }
        if (stack.isEmpty()) println("yes")
        else println("no")
    }
}
