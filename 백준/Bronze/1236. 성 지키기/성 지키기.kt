// 영식이는 직사각형 모양의 성을 가지고 있음
// 모든 행과 모든 열에 한 명 이상의 경비원이 있으면 좋겠다고 생각
// 성의 크기와 경비원이 어디있는지 주어짐
// 몇 명의 경비원을 최소로 추가해야 영식이를 만족시키는 지 구하기

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    
    // 1. 입력을 담을 배열, ., X
    val castle = Array(N) { br.readLine().toCharArray() }
    
    // 2. 모든 배열을 탐색한다
    // 2-1. X를 가지고 있다면 x와 y를 각각 set에 업데이트 한다
    val xValues = mutableSetOf<Int>()
    val yValues = mutableSetOf<Int>()
    
    for (i in 0 until N) {
        for (j in 0 until M) {
            if (castle[i][j] == 'X') {
                xValues.add(i)
                yValues.add(j)
            }
        }
    }
    
    // 3. 최솟값 계산
    val minX = N - xValues.size
    val minY = M - yValues.size
    
    print(maxOf(minX, minY))
}