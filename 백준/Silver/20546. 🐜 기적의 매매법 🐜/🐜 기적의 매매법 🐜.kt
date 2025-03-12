fun main() {
    val cash = readln().toInt()
    val stockPrice = readln().split(" ").map { it.toInt() }

    var junhyunStock = 0
    var junhyunCash = cash

    stockPrice.forEach {
        while (junhyunCash >= it) {
            val count = junhyunCash / it
            junhyunStock += count
            junhyunCash -= it * count
        }
    }

    junhyunCash += stockPrice[13] * junhyunStock

    var sungminStock = 0
    var sungminCash = cash

    for (i in 3 until stockPrice.size) {
        val third = stockPrice[i - 1]
        val second = stockPrice[i - 2]
        val first = stockPrice[i - 3]

        if (first > second && second > third && third > stockPrice[i] && sungminCash >= stockPrice[i]) {
            val count = sungminCash / stockPrice[i]
            sungminStock += count
            sungminCash -= stockPrice[i] * count
        }
        if (first < second && second < third && third < stockPrice[i]) {
            sungminCash += stockPrice[i] * sungminStock
            sungminStock = 0
        }
    }

    if (sungminStock != 0) sungminCash += stockPrice[13] * sungminStock

    when {
        junhyunCash > sungminCash -> print("BNP")
        junhyunCash < sungminCash -> print("TIMING")
        else -> print("SAMESAME")
    }
}