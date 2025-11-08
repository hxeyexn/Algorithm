fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    
    val students = Array(n) { br.readLine().split(" ").map { it.toInt() } }
    val chance = IntArray(n) { 0 }
    var currentStudent = 0
    
    for (i in 0 ..< n) {
        for (j in 0 ..< n) {
            if (i == j) continue
            
            for (k in 0 .. 4) {
                if (students[i][k] == students[j][k]) {
                    chance[i] += 1
                    break
                }
            }
        }
    }
    
    val president = chance.indexOfFirst { it == chance.maxOrNull() }
    print(president + 1)
}
