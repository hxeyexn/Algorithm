import java.util.*

fun main() {
    // 수열의 두 수 X와 Y가 있을 때, X가 Y보다 수열에서
    // 많이 등장하는 경우에는 X가 Y보다 앞에 있어야 함
    // 만약, 등장하는 횟수가 같다면, 먼저 나온 것이 앞에 있어야 함
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (N, C) = br.readLine().split(" ").map { it.toInt() }
    
    // 가지고 있어야 할 정보
    // 숫자가 처음 나온 index, 등장 빈도
    // -> LinkedHashMap
    
    val map = LinkedHashMap<Int, Int>()
    val numer = StringTokenizer(br.readLine())
 
    repeat(N) {
        val num = numer.nextToken().toInt()
        
        map[num] = map.getOrDefault(num, 0) + 1
    }
    
    val sortedMap = map.entries.sortedByDescending { it.value }
    sortedMap.forEach { map ->
        repeat(map.value) {
            bw.write("${map.key} ")
        }
    }
    
    bw.flush()
    bw.close()
}