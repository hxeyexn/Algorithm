fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val aNumbers = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    aNumbers.sort()

    val m = br.readLine().toInt()
    val numbers = br.readLine().split(" ").map { it.toInt() }

    val result = Array(m) { 0 }

    repeat (m) {
        var start = 0
        var end = n - 1

        while (start <= end) {
            val mid = (start + end) / 2

            when {
                numbers[it] == aNumbers[mid] -> {
                    result[it] = 1
                    break
                }
                numbers[it] > aNumbers[mid] -> start = mid + 1
                numbers[it] < aNumbers[mid] -> end = mid - 1
            }
        }
    }

    result.forEach { bw.write("$it\n") }
    bw.flush()
    bw.close()
}