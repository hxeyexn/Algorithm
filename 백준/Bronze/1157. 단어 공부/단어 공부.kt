fun main() {
    val br = System.`in`.bufferedReader()
    val input = br.readLine().uppercase()
    val alphabet = mutableMapOf<Char, Int>()
    
    for (key in 'A'..'Z') {
        alphabet[key] = 0
    }
    
    for (key in input) {
        alphabet[key] = alphabet[key]?.plus(1) ?: 0
    }
    
    val max = alphabet.values.max()
    val count = alphabet.values.count { it == max }
    
    if (count == 1) {
        val result = alphabet.filterValues { it == max }.keys
        print(result.first())
    } else {
        print("?")
    }
}