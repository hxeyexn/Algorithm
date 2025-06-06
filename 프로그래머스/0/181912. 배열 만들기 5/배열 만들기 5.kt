class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray = intStrs.map { it.slice(s until (s + l)).toInt() }.filter { it > k }.toIntArray()
}