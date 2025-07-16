fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    // N - 저장된 사이트 주소의 수
    // M - 비밀번호를 찾으려는 사이트 주소의 수
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    
    // 사이트는 중복되지 않음
    // 비밀번호는 알파벳 대문자로만 이루어짐
    val map = mutableMapOf<String, String>()
    
    repeat(N) {
        val (address, password) = br.readLine().split(" ")
        map[address] = password
    }
    
    repeat(M) {
        val address = br.readLine()
        bw.write("${map[address]}")
        bw.newLine()
    }
    
    bw.flush()
    bw.close()
}