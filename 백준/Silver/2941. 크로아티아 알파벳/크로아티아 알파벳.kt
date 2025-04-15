// 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
import java.util.Queue
import java.util.LinkedList

fun main() {
    val br = System.`in`.bufferedReader()
    val word: Queue<Char> = LinkedList()
    word.addAll(br.readLine().map { it })

    val croatian = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var count = 0
    var currentAlphabet = ""

    while (word.isNotEmpty()) {
        // 2글자일 때
        if (currentAlphabet.length == 2) {
            if (croatian.contains(currentAlphabet)) {
                count++
                currentAlphabet = ""
            } else {
                currentAlphabet += word.poll()
            }
        }
        // 3글자일 때
        else if (currentAlphabet.length == 3) {
            if (croatian.contains(currentAlphabet)) {
                count++
                currentAlphabet = ""
            } else {
                currentAlphabet = currentAlphabet.drop(1)
                count++
            }
        } else {
            currentAlphabet += word.poll()
        }
    }

    if (currentAlphabet != "") {
        if (croatian.contains(currentAlphabet)) count++ 
        else count += currentAlphabet.length
    }

    print(count)
}