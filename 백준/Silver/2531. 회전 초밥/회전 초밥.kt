fun main() {
    val br = System.`in`.bufferedReader()

    val (N, d, k, c) = br.readLine().split(" ").map { it.toInt() }
    val belt = IntArray(N) { br.readLine().toInt() }
    
    // 초밥 번호별로 윈도우 내 등장 횟수를 저장할 배열
    val count = IntArray(d + 1) { 0 }
    
    // 초밥 종류 수
    var kind = 0
    
    // 초기 윈도우 설정
    for (i in 0 ..< k) {
        if (count[belt[i]] == 0) kind++
        count[belt[i]]++
    }
    
    // max 설정, 쿠폰 체크
    var max = if (count[c] == 0) kind + 1 else kind
    
    // 슬라이딩 윈도우 시작
    for (i in 1 ..< N) {
        // 제거할 초밥
        val remove = belt[(i - 1) % N]
        count[remove]--
        if (count[remove] == 0) kind--
        
        // 추가할 초밥
        val add = belt[(i + k - 1) % N]
        if (count[add] == 0) kind++
        count[add]++
        
        // 쿠폰 재확인
        val current = if (count[c] == 0) kind + 1 else kind
        
        // max 값 설정
        if (max < current) max = current
    }
    
    print(max)
}