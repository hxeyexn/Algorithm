class Solution {
    fun solution(s: String): Int {
        var newStr = s
        var answer: Int = 0
        val number = mapOf(
            "zero" to "0",
            "one" to "1",
            "two" to "2",
            "three" to "3",
            "four" to "4",
            "five" to "5",
            "six" to "6",
            "seven" to "7",
            "eight" to "8",
            "nine" to "9",
        )

        number.forEach { (key, value) ->
            if (s.contains(key)) {
                newStr = newStr.replace(key, value)
            }
        }

        return newStr.toInt()
    }
}