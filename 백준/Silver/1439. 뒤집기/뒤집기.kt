import kotlin.math.min

fun main() {
    val S = readln()
    var prev = ' '

    var zeroCount = 0
    var oneCount = 0

    for (i in 0 ..< S.length) {
        val isZero = S[i] == '0'

        if (prev != S[i] && isZero) zeroCount++
        else if (prev != S[i] && !isZero) oneCount++

        prev = S[i]
    }

    val min = min(zeroCount, oneCount)
    print("$min")
}
