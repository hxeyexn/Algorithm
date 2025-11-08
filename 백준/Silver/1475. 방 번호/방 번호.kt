fun main() {
    // 필요한 세트의 개수의 최솟값
    // 6은 9를 뒤집어서 이용할 수 있고,
    // 9는 6을 뒤집어서 이용할 수 있음
    val N = readln().map { it.digitToInt() }
    
    val array = IntArray(10) { 0 }
    
    for (n in N) {
        if (n == 6) {
            array[9] += 1
            continue
        }
        
        array[n] += 1
    }
    
    if (array[9] % 2 == 0) array[9] /= 2
    else array[9] = (array[9] / 2) + 1
    
    print("${array.max()}")
}