fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val ropes = MutableList(N) { br.readLine().toInt() }
    ropes.sort()
    
    var max = ropes.max()
    
    for (i in 0 ..< ropes.size) {
        val tempMax = ropes[i] * (ropes.size - i) 
        
        if (tempMax > max) max = tempMax
    }
    
    print(max)
}