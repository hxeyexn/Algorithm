fun main() {
    val br = System.`in`.bufferedReader()
    val input = br.readLine()
    val result = StringBuilder()
    val current = StringBuilder()
    var isTag = false

    for (char in input) {
        when (char) {
            '<' -> {
                if (current.isNotEmpty()) {
                    current.reverse()
                    result.append(current)
                    current.clear()
                }
                isTag = true
                current.append(char)
            }
            '>' -> {
                isTag = false
                current.append(char)
                result.append(current)
                current.clear()
            }
            ' ' -> {
                if (!isTag) {
                    current.reverse()
                    result.append(current)
                    result.append(' ')
                    current.clear()
                } else {
                    current.append(' ')
                }
            }
            else -> {
                current.append(char)
            }
        }
    }

    current.reverse()
    result.append(current)
    print(result)
}