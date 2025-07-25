fun main() {
    // 미국 전역의 나무들이 주어졌을때, 각 종이 전체에서 몇 %를 차지하는지
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    // Map 쓰기 Map의 key는 나무 이름 value 그루 수
    val trees = mutableMapOf<String, Int>()
    
    // 각 종의 이름을 사전순으로 출력
    // 그 종이 차지하는 비율을 백분율로 소수점 4째자리까지
    while(true) {
        val name = br.readLine() ?: break
        
        trees[name] = trees.getOrDefault(name, 0) + 1
    }
    
    val treeCount = trees.values.sum()
    val sortedTrees = trees.toSortedMap()

    sortedTrees.forEach { (k, v) ->
        val percentage = (v.toDouble() / treeCount) * 100.0                 
        bw.write("$k ${String.format("%.4f", percentage)}")
        bw.newLine()
    }
    
    bw.flush()
    bw.close()
}