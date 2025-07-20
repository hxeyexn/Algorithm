fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val gomgom = HashSet<String>()
    var count = 0
    
    repeat(N) {
        val input = br.readLine()
        
        if (input == "ENTER") {
            count += gomgom.size
            gomgom.clear()
        } else {
            gomgom.add(input)
        }
    }
    
    count += gomgom.size
    
    print("$count")
}