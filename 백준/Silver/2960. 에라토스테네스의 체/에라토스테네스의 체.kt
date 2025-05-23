fun main() {
    val (N, K) = readln().split(" ").map { it.toInt() }
    val numbers = (2 .. N).toMutableList()
    var count = 0

    while (numbers.isNotEmpty()) {
        val P = numbers.min()
        val iterator = numbers.iterator()

        while (iterator.hasNext()) {
            val num = iterator.next()
            
            if (num % P == 0) {
                iterator.remove()
                count++

                if (count == K) {
                    print(num)
                    return
                }
            }
        }
    }
}