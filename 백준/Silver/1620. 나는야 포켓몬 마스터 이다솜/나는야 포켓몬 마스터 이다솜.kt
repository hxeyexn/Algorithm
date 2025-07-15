fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    
    // key가 번호
    val numbers = mutableListOf<String>()
    // key가 이름
    val names = mutableMapOf<String, Int>()
    
    repeat(N) {
        val name = br.readLine()
        numbers.add(name)
        names[name] = it + 1
    }
    
    repeat(M) {
        val input = br.readLine()
        
        if (input.toIntOrNull() == null) {
            bw.write("${names[input]}")
            bw.newLine()
        } else {
            bw.write("${numbers[input.toInt() - 1]}")
            bw.newLine()
        }
    }

    bw.flush()
    bw.close()
}