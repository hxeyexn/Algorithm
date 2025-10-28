fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val progression = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    var (start, end) = 0 to 0
    var sum = progression[0]
    var count = 0
    
    while (true) {
        // 현재 부분합이 M과 같으면 count 증가
        if (sum == M) count++
        
        // 현재 부분 합이 크거나 같다면 start를 1 증가
        // 현재 부분 합이 작다면 end를 1 증가
        if (sum >= M) {
            sum -= progression[start++]
        } else {
            end++
            if (end == N) break
            sum += progression[end]
        }
    }
    
    print(count)
}