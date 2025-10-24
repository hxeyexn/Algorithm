fun main() {
    val br = System.`in`.bufferedReader()
    val set = mutableSetOf<Int>()
    
    // 10개의 수를 읽는다
    // 10개의 수를 42로 나눈다
    repeat(10) {
        val rem = br.readLine().toInt()
        set.add(rem % 42)
    }
    
    // 서로 다른 값이 몇 개 있는지 확인한다 -> set 활용
    print(set.count())
}
