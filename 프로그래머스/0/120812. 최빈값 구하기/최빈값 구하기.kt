class Solution {
    fun solution(array: IntArray): Int {
        val numbers = array.toSet()
        val mode = mutableMapOf<Int, Int>()

        numbers.forEach { number ->
            mode[number] = array.filter { it == number }.size
        }

        val max = mode.values.maxOrNull()
        val maxCount = mode.count { it.value == max }

        return if (maxCount == 1) mode.filter { it.value == max }.keys.first() else -1
    }
}