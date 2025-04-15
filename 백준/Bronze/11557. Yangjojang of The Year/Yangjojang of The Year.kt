// 어느 학교가 술을 가장 많이 먹는지 궁금
// 학교별로 한 해동안 술 소비량이 주어진다
// 가장 술 소비가 많은 학교 이름을 출력

// 입력
// 테스트 케이스의 숫자 T
// 학교의 숫자 정수 N(1 <= N <= 100)
// N줄에 걸쳐 학교 이름, 해당 학교가 지난 한 해동안 소비한 술의 양

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    val T = br.readLine().toInt()
    
    repeat(T) {
        val N = br.readLine().toInt()
        val schools = mutableMapOf<String, Int>()
        
        repeat(N) {
            val (name, consumption) = br.readLine().split(" ")
            schools[name] = consumption.toInt()
        }
        
        val schoolName = schools.filter { it.value == schools.values.max() }.keys.first()
        bw.write("$schoolName\n")
    }
    
    bw.flush()
    bw.close()
}