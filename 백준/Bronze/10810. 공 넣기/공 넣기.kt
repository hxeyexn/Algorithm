fun main() {
    // 가장 처음 바구니에는 공이 들어있지 않음
    // 바구니에는 공을 1개만 넣을 수 있음
    // 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고
    // 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣음
    // 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣음
    // 공을 넣을 바구니는 연속되어 있어야 함
    
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val result = IntArray(N + 1) { 0 }
    
    repeat(M) {
        val (i, j, k) = br.readLine().split(" ").map { it.toInt() }
        
        (i .. j).forEach {
            result[it] = k
        }
    }
    
    (1 .. N).forEach {
        bw.write("${result[it]} ")
    }
    
    bw.flush()
    bw.close()
}