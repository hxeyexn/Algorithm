fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    var mul = 1
    var result = IntArray(10) { 0 }
    
    repeat(3) {
        mul *= br.readLine().toInt()
    }
    
    for (num in mul.toString()) {
        result[num.digitToInt()] += 1
    }
    
    for (count in result) {
        bw.write("${count}\n")
    }
    
    bw.flush()
    bw.close()
}