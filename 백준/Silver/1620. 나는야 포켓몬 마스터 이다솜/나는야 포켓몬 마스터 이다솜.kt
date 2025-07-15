// 포켓몬의 개수 N / 내가 맞춰야 하는 문제의 개수 M
// N과 M은 1보다 크거나 같고, 100,000보다 작거나 같은 자연수
// 둘째 줄부터 N개의 줄에 포켓몬의 번호가 1번인 포켓몬부터 N번에 해당하는
// 포켓몬까지 한 줄에 하나씩 입력으로 들어옴
// 포켓몬 이름은 모두 영어(첫 글자만 대문자이고, 나머지는 소문자)
// 단, 일부 포켓몬은 마지막 문자만 대문자일 수도 있음
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    
    // key가 번호
    val numbers = mutableMapOf<Int, String>()
    // key가 이름
    val names = mutableMapOf<String, Int>()
    
    repeat(N) {
        val name = br.readLine()
        numbers[it + 1] = name
        names[name] = it + 1
    }
    
    repeat(M) {
        val input = br.readLine()
        
        if (input.toIntOrNull() == null) {
            bw.write("${names[input]}\n")
        } else {
            bw.write("${numbers[input.toInt()]}\n")
        }
    }

    bw.flush()
    bw.close()
}