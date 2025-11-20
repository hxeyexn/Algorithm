fun main() {
    val br = System.`in`.bufferedReader()
    
    // 견학을 희망하는 학회원의 수 N과 견학하는 팀의 최소 능력치 M
    val (N, M)  = br.readLine().split(" ").map { it.toInt() }
    val talent = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    talent.sort()
    
    var start = 0
    var end = N - 1
    var count = 0
    
    while (start < end) {
        val sum = talent[start] + talent[end]
        
        if (sum >= M) {
            // 한번 팀에 들어간 사람은 다시 팀에 못 들어감
            count++
            start++
            end--
        } else {
            start++
        }
    }
    
    print(count)
}