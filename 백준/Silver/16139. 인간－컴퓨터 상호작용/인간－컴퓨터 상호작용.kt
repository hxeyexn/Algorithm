fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val input = br.readLine()
    val q = br.readLine().toInt()

    val prefixSum = Array(26) { IntArray(input.length + 1) { 0 } }

    for (idx in 1 .. input.length) {
        for (j in 0..25) {
            prefixSum[j][idx] = prefixSum[j][idx - 1]
        }

        val char = input[idx - 1]
        prefixSum[char - 'a'][idx] = prefixSum[char - 'a'][idx - 1] + 1
    }

    repeat(q) {
        val (a, l, r) = br.readLine().split(" ")
        val char = a.toCharArray().first()
        val count = prefixSum[char - 'a'][r.toInt() + 1] - prefixSum[char - 'a'][l.toInt()]
        bw.write("$count\n")
    }

    bw.flush()
    bw.close()
}