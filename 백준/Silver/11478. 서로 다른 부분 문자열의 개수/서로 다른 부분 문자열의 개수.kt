fun main() {
    val br = System.`in`.bufferedReader()
    val S = br.readLine()

    val set = hashSetOf<String>()
    var count = 0
    
    for (i in S.length downTo 1) {
        var start = 0
        var end = S.length - i + 1
        
        repeat(i) {
            set.add(S.substring(start++, end++))
        }
        
        count += set.size
        set.clear()
    }
    
    print("${count}")
}
