fun main() {
    val br = System.`in`.bufferedReader()
    val (S, P) = br.readLine().split(" ").map { it.toInt() }
    val dna = br.readLine()

    val input = br.readLine().split(" ").map { it.toInt() }
    val condition = mutableMapOf('A' to input[0], 'C' to input[1], 'G' to input[2], 'T' to input[3])
    val latestCondition = mutableMapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)

    for (idx in 0 until P) {
        val char = dna[idx]
        latestCondition[char] = latestCondition.getValue(char) + 1
    }

    var count = 0

    for (end in P .. S) {
        val isValid = latestCondition.all { (k, v) -> v >= condition.getValue(k) }
        if (isValid) count++
        if (end == S) break
        
        val endDna = dna[end]
        val startDna = dna[end - P]
        latestCondition[endDna] = latestCondition.getValue(endDna) + 1
        latestCondition[startDna] = latestCondition.getValue(startDna) - 1
    }

    print(count)
}