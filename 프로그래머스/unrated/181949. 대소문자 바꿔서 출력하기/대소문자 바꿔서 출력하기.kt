fun main(args: Array<String>) {
    val s1 = readLine()!!
    val alphabet = s1.toList()
    
    for (i in alphabet.indices) {
        if (alphabet[i].isUpperCase()) {
            print(alphabet[i].lowercase())
        } else {
            print(alphabet[i].uppercase())
        }
    }
}