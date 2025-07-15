// 교집합으로 풀기
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }

    val unhidden = mutableSetOf<String>()
    val unseen = mutableSetOf<String>()
    
    repeat(N) {
        val name = br.readLine()
        unhidden.add(name)
    }
    
    repeat(M) {
        val name = br.readLine()
        unseen.add(name)
    }
    
    val result = unhidden.intersect(unseen).sorted()
    
    bw.write("${result.size}\n")
    result.forEach {
        bw.write("${it}\n")
    }
    
    bw.flush()
    bw.close()
}