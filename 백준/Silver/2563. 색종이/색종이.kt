fun main() {
    val br = System.`in`.bufferedReader()
    val paper = Array(101) { BooleanArray(101) { false } }
    val count = br.readLine().toInt()
    
    repeat(count) {
        val (startX, startY) = br.readLine().split(" ").map { it.toInt() }
        
        for (x in startX .. startX + 9) {
            for (y in startY .. startY + 9) {
                paper[x][y] = true
            }
        }
    }
    
    var area = 0
    paper.forEach {  area += it.count { state -> state } }
    
    print(area)
}