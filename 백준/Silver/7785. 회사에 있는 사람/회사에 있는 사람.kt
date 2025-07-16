// 현재 회사에 있는 모든 사람을 구하는 프로그램
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    // 로그에 기록된 출입 기록의 수 n
    // 10,000,000
    val n = br.readLine().toInt()
    
    // 출입 기록을 담을 map
    val record = mutableMapOf<String, String>()
    
    // n개의 줄에 출입 기록 주어짐
    // enter 출근, leave 퇴근
    // 동명이인이 없음, 대소문자가 다른 경우에는 다른 이름
    repeat(n) {
        val (name, status) = br.readLine().split(" ")
        record[name] = status
    }
    
    // 출력 - 현재 회사에 있는 사람의 이름을 사전 순의 역순으로 한 줄에 한명씩
    val result = 
        record.filter { it.value == "enter" }
            .keys.sortedDescending()
    
    result.forEach {
        bw.write("$it")
        bw.newLine()
    }
    
    bw.flush()
    bw.close()
}