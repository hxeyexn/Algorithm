fun main() {
    // 입력을 읽는다
    val performance = readln().filterNot { it == ' ' }
    // val performance = readln().replace(" ", "")
    
    // ascending / descending을 가지고 있는다.
    val ascending = "12345678"
    val descending = "87654321"
    
    // 값을 비교한다
    when(performance) {
        ascending -> print("ascending")
        descending -> print("descending")
        else -> print("mixed")
    }
}