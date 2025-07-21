fun main() {
    // 사람들이 만난 기록의 수 N
    // i 번째로 만난 사람들의 이름 A, B
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()

    val people = mutableMapOf<String, Boolean>()
    people["ChongChong"] = true
    
    repeat(N) {
        val (A, B) = br.readLine().split(" ")
        
        if (people[A] == true) people[B] = true
        else if (people[B] == true) people[A] = true
    }

    print("${people.values.count { it }}")
}