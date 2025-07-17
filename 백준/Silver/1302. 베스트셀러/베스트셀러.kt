fun main() {
    // 오늘 하루 동안 팔린 책의 개수 N
    // N개의 줄에 책의 제목이 입력
    // 책의 제목의 길이는 50보다 작거나 같고, 알파벳 소문자로만 이루어짐
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val books = mutableMapOf<String, Int>()
    
    repeat(N) {
        val title = br.readLine()
        val count = books.getOrPut(title) { 0 }
        books[title] = count + 1
    }
    
    val max = books.values.max()
    
    // 가장 많이 팔린 책의 제목을 출력, 여러 개일 경우 사전 순으로 가장 앞서는 제목 출력
    val result = books.filter { it.value == max }.toSortedMap()
    println("${result.firstKey()}")
}