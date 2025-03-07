
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val structure = mutableMapOf<String, MutableList<Pair<String, Int>>>()

    repeat(n + m) {
        val (p, f, c) = br.readLine().split(" ")
        structure.computeIfAbsent(p) { mutableListOf() }.add(f to c.toInt())
    }

    val q = br.readLine().toInt()
    val queries = List(q) { br.readLine() }

    fun countFiles(folder: String, files: MutableList<String>) {
        val currentFolder =  structure[folder] ?: return

        for ((name, type) in currentFolder) {
            if (type == 0) files.add(name)
            else countFiles(name, files)
        }
    }

    for (query in queries) {
        val folder = query.split("/").last()
        val files = mutableListOf<String>()
        countFiles(folder, files)
        bw.write("${files.toSet().count()} ${files.count()}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}