fun main() {
    // 파일에는 단어가 한줄에 하나씩 적혀있다.
    // 이 중 하나는 민균이가 온라인 저지에서 사용하는 비밀번호
    // 모든 단어의 길이가 홀수
    // "tulipan"인 경우에 목록에는 "napilut"도 존재해야 함
    // 알 수 없는 이유에 의해 모두 비밀번호로 사용 가능
    // 비밀번호의 길이와 가운데 글자를 출력하는 프로그램을 작성
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val file = mutableListOf<String>()
    
    for (i in 1 .. N) {
        val word = br.readLine()
        file.add(word)
        
        if (file.contains(word.reversed())) {
            val length = word.length
            print("$length ${word[length / 2]}")
            break
        }
    }
}