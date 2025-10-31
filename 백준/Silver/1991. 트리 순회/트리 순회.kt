val br = System.`in`.bufferedReader()
val sb = StringBuilder()

// 노드의 개수
val N = br.readLine().toInt()
val leftTree = mutableMapOf<String, String>()
val rightTree = mutableMapOf<String, String>()

fun main() {
    repeat(N) {
        val (node, left, right) = br.readLine().split(" ")
        
        leftTree[node] = left
        rightTree[node] = right
    }
    
    preorder("A")
    sb.append("\n")
    
    inorder("A")
    sb.append("\n")
    
    postorder("A")
    sb.append("\n")
    
    print(sb.toString())
}

// 전위, 중위, 후위 구현
// 부모 -> 왼 -> 오
fun preorder(
    node: String, 
) {
    sb.append(node)
    if (leftTree[node] != ".") preorder(leftTree.getValue(node))
    if (rightTree[node] != ".") preorder(rightTree.getValue(node))
}

// 왼 -> 부모 -> 오
fun inorder(
    node: String,
) {
    if (leftTree[node] != ".") inorder(leftTree.getValue(node))
    sb.append(node)
    if (rightTree[node] != ".") inorder(rightTree.getValue(node))
}

// 왼 -> 오 -> 부모
fun postorder(
    node: String,
) {
    if (leftTree[node] != ".") postorder(leftTree.getValue(node))
    if (rightTree[node] != ".") postorder(rightTree.getValue(node))
    sb.append(node)
}
