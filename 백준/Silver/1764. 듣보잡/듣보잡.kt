// 듣도 못한 사람의 명단에는 중복되는 이름이 없음
// 보도 못한 사람의 명단도 마찬가지
// 듣보잡의 수와 그 명단을 사전순으로 출력한다.
fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val br = System.`in`.bufferedReader()
    
    val map = mutableMapOf<String, Pair<Boolean, Boolean>>()
    
    // N 만큼 순회하면서 map에 넣는다. 이때 pair first 값 업데이트
    // M 만큼 순회하면서 map에 넣는다. 이때 pair second 값 업데이트
    
    repeat(N) {
        val name = br.readLine()
        map[name] = true to false
    }
    
    repeat(M) {
        val name = br.readLine()
        val hear = map[name]?.first ?: false
        map[name] = hear to true
    }
    
    val result = 
        map.filter { it.value.first && it.value.second }
            .toSortedMap()
    
    println(result.size)
    
    result.keys.forEach {
        println(it)
    }
}