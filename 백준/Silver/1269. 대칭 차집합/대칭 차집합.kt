// 자연수를 원소로 갖는 두 집합 A, B
// A - B / B - A의 합집합을 A와 B의 대칭 차집합
// 두 집합의 대칭 차집합의 원소의 개수를 출력

fun main() {
    val br = System.`in`.bufferedReader()
    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    
    val A = br.readLine().split(" ").toSet()
    val B = br.readLine().split(" ").toSet()
    
    var count = 0
    
    for (x in A) {
        if (!B.contains(x)) count++
    }
    
    for (x in B) {
        if (!A.contains(x)) count++
    }
    
    print("${count}")
}