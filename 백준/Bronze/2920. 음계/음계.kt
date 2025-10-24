fun main() {
    val input = readln().filterNot { it == ' ' }
    
    when (input) {
        "12345678" -> print("ascending")
        "87654321" -> print("descending")
        else -> print("mixed")
    }
}