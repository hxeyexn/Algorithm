fun main() {
    val br = System.`in`.bufferedReader()
    
    val n = br.readLine().toInt()
    val progression = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    progression.sort()
    
    val x = br.readLine().toInt()

    var start = 0
    var end = n - 1
    var count = 0
    
    while (start < end) {
        val sum = progression[start] + progression[end]
        
        when {
            sum > x -> end--
            // start, end 모두 이동 시키는 이유
            // 정렬되어있기 때문에 
            // start만 올리면 x보다 무조건 큼
            // end만 줄이면 x보다 무조건 작음
            sum == x -> {
                start++
                end--
                count++
            }
            else -> start++
        }
    }
    
    print(count)
}