fun main() {
    val br = System.`in`.bufferedReader()
    val input = br.readLine().uppercase()
    val alphabet = Array(26) { 0 }
    val ACode = 'A'.code

    for (key in input) {
        val idx = key.code - ACode
        alphabet[idx]++
    }

    val max = alphabet.max()
    val count = alphabet.count { it == max }

    if (count == 1) {
        val result = alphabet.indexOf(max) + ACode
        print(result.toChar())
    } else {
        print("?")
    }
}