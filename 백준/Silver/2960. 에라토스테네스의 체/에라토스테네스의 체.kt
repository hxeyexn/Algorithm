fun main() {
    val (N, K) = readln().split(" ").map { it.toInt() }
    val numbers = (2 .. N).toMutableList()

    var count = 0

    while (numbers.isNotEmpty()) {
        // 가장 작은 수 P를 찾는다.
        val P = numbers.min()

        // P의 배수를 순서대로 지우고 지울 때마다 count를 증가 시킨다.
        while (numbers.count { it % P == 0 } != 0) {
            val element = numbers.first { it % P == 0 }
            numbers.remove(element)
            count++

            if (count == K) {
                print(element)
                break
            }
        }

        if (count == K) break
    }
}