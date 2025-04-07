fun main() {
    val N = readln().toInt()
    
    var count = 0
    var sum = 1
    var start = 1
    var end = 1
    
    while (end <= N) {
        when {
            sum < N -> sum += ++end
            sum == N -> {
                count++
                sum -= start++
            }
            sum > N -> sum -= start++
        }
    }
    
    print(count)
}