fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val files = Array(N) { br.readLine() }
    
    val temp = Array(files[0].length) { mutableSetOf<Char>() }
    for (file in files) {
        for (idx in file.indices) {
            temp[idx].add(file[idx])
        }
    }
    
    for (i in temp.indices) {
        if (temp[i].size > 1) {
            temp[i].clear()
            temp[i].add('?')
        }
    }
    
    temp.forEach {
        print(it.joinToString(""))
    }
}