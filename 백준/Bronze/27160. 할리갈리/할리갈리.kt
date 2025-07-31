fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val cards = mutableMapOf<String, Int>()
    
    repeat(N) {
        val (S, X) = br.readLine().split(" ")
        cards[S] = cards.getOrDefault(S, 0) + X.toInt()
    }
    
    if (cards.values.contains(5)) print("YES") else print("NO")
}