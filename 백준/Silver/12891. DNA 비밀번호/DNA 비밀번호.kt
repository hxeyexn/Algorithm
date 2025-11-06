fun main() {
    val br = System.`in`.bufferedReader()
    val (S, P) = br.readLine().split(" ").map { it.toInt() }
    val dna = br.readLine()

    val input = br.readLine().split(" ").map { it.toInt() }
    val condition = mutableMapOf('A' to input[0], 'C' to input[1], 'G' to input[2], 'T' to input[3])
    val latestCondition = mutableMapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)


    (0 until P).forEach {
        val char = dna[it]
        latestCondition[char] = latestCondition.getValue(char) + 1
    }

    var start = 0
    var end = P - 1
    var count = 0

    while (true) {
        val isValidCount =
            latestCondition.getValue('A') >= condition.getValue('A')
                    && latestCondition.getValue('C') >= condition.getValue('C')
                    && latestCondition.getValue('G') >= condition.getValue('G')
                    && latestCondition.getValue('T') >= condition.getValue('T')

        if (isValidCount) count++

        latestCondition[dna[start]] = latestCondition.getValue(dna[start]) - 1
        start++

        if (end == S - 1) break
        
        val newChar = dna[++end]
        latestCondition[newChar] = latestCondition.getValue(newChar) + 1
    }

    print(count)
}