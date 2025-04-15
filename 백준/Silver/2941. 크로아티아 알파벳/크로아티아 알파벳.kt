// 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
fun main() {
    val br = System.`in`.bufferedReader()
    var word = br.readLine()
    
    val croatian = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    
    for (alphabet in croatian) {
        word = word.replace(alphabet, "#")
    }
    
    print(word.length)
}