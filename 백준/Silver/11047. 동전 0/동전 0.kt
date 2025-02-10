fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val coins = MutableList(n) { readln().toInt() }
    coins.sortDescending()
    
    var currentK = k
    var count = 0
    var currentCoin = coins[0]
    
    while (currentK > 0) {
        if (currentK < currentCoin) {
            var coinIdx = coins.indexOfFirst { it <= currentK }
            currentCoin = coins[coinIdx]
        }
        
        count += currentK / currentCoin
        currentK %= currentCoin
    }
    
    print("$count")
}