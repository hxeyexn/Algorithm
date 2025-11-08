fun main() {
    val word = readln()
    val length = word.length
    val words = ArrayList<String>()
    
    for (i in 1 ..< length - 1) {
        for (j in i + 1 ..< length) {
            val newWord =
                word.slice(0 ..< i).reversed() +
                    word.slice(i ..< j).reversed() +
                    word.slice(j ..< length).reversed()
            
            words.add(newWord)
        }
    }
    
    words.sort()
    print(words[0])
}