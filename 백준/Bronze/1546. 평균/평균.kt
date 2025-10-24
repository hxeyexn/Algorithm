fun main() {
    val br = System.`in`.bufferedReader()
    
    // N을 읽는다.
    val N = br.readLine().toInt()
    
    // 현재 성적을 읽은 후 split 한다
    val scores = br.readLine().split(" ").map { it.toDouble() }
    val max = scores.max()
    
    // 새로운 성적의 합
    var sum = 0.0
    
    // 새로운 성적을 구한다.
    for (score in scores) {
        sum += score / max * 100
    }
    
    // 새로운 평균을 구한다.
    print(sum / N)
}

