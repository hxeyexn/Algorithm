fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val cards = mutableMapOf<Long, Int>()
    
    repeat(N) {
        val num = br.readLine().toLong()
        cards[num] = cards.getOrDefault(num, 0) + 1
    }
    
    val max = cards.values.max()
    val result = cards.filter { it.value == max }.toSortedMap()
    print("${result.firstKey()}")
}