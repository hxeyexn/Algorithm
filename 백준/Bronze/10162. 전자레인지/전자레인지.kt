fun main() {
    var t = readln().toInt()
    
    if (t % 10 != 0) print("-1")
    else {
        print("${t / 300} ")
        t = t % 300 
        
        print("${t / 60} ")
        t = t % 60
        
        print("${t / 10}")
    }
}