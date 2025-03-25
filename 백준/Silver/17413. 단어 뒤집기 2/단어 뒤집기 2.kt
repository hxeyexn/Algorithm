fun main() {
    val br = System.`in`.bufferedReader()
    val input = br.readLine()
    val result = mutableListOf<String>()
    var isTag = false
    var current = charArrayOf()

    for (char in input) {
        when (char) {
            '<' -> {
                if (current.isNotEmpty()) {
                    current.reverse()
                    result.add(current.joinToString(""))
                    current = charArrayOf()
                }
                isTag = true
                current += char
            }
            '>' -> {
                isTag = false
                current += char
                result.add(current.joinToString(""))
                current = charArrayOf()
            }
            ' ' -> {
                if (!isTag) {
                    current.reverse()
                    result.add("${current.joinToString("")} ")
                    current = charArrayOf()
                } else {
                    current += ' '
                }
            }
            else -> {
                current += char
            }
        }
    }

    current.reverse()
    result.add(current.joinToString(""))
    result.forEach { print(it) }
}