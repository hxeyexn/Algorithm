fun main() {
    val (N, K) = readln().split(" ").map { it.toInt() }
    val isRemoved = BooleanArray(N + 1) { false }
    var count = 0

    for (i in 2 .. N) {
        if (isRemoved[i]) continue
        
        for (j in i .. N step i) {
            if (!isRemoved[j]) {
                isRemoved[j] = true
                count++
                
                if (count == K) {
                    print(j)
                    return
                }
            }
        }
    }
}