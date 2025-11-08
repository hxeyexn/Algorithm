fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    
    val A = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val operatorCount = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val operators = ArrayList<Int>()
    val results = ArrayList<Int>()
    val currentOperators = ArrayList<Int>()

    for (i in 0 .. 3) {
        while (operatorCount[i] > 0) {
            operators.add(i)
            operatorCount[i] -= 1
        }
    }
    
    val visited = BooleanArray(operators.size) { false }
    backtracking(N, A, visited, operators, results, currentOperators)

    println("${results.maxOrNull()}")
    println("${results.minOrNull()}")
}

fun backtracking(
    n: Int,
    a: IntArray,
    visited: BooleanArray,
    operators: ArrayList<Int>,
    results: ArrayList<Int>,
    currentOperators: ArrayList<Int>,
) {
    if (currentOperators.size == n - 1) {
        var result = a[0]
        
        for (i in 0 ..< n - 1) {
            when {
                currentOperators[i] == 0 -> result += a[i + 1]
                currentOperators[i] == 1 -> result -= a[i + 1]
                currentOperators[i] == 2 -> result *= a[i + 1]
                else -> result /= a[i + 1]
            }
        }

        results.add(result)
        return
    }
    
    for (i in 0 ..< operators.size) {
        if (visited[i]) continue
        
        currentOperators.add(operators[i])
        visited[i] = true
        
        backtracking(n, a, visited, operators, results, currentOperators)
        
        currentOperators.removeLast()
        visited[i] = false
    }
}