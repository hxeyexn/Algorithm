import java.math.BigDecimal

fun main() {
    val (A, B) = readln().split(" ")
    val sum = BigDecimal(A) + BigDecimal(B)
    print(sum)
}