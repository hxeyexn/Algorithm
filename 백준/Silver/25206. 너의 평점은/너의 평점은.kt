fun main() {
    // 전공평점은 전공과목별(학점 x 과목평점)의 합을 학점의 총합으로 나눈값
    // 전공평점 출력
    // P인 과목은 계산에서 제외해야 함
    val br = System.`in`.bufferedReader()
    val avgTable = 
        mutableMapOf(
            "A+" to 4.5, 
            "A0" to 4.0,
            "B+" to 3.5,
            "B0" to 3.0,
            "C+" to 2.5,
            "C0" to 2.0,
            "D+" to 1.5,
            "D0" to 1.0,
            "F" to 0.0,
            "P" to 0.0,
        ) 
    var sum: Double = 0.0
    var totalScore: Double = 0.0
    
    while(true) {
        val input = br.readLine()
        if (input == null) break
        
        val (subject, score, grade) = input.split(" ")

        sum += score.toDouble() * avgTable.getOrDefault(grade, 0.0)
        if (grade != "P") totalScore += score.toDouble()
    }

    print("${sum / totalScore}")
}