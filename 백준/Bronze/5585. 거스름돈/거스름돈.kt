fun main() {
    val pay = readln().toInt()
    var change = 1000 - pay
    var count = 0
    
    // 620
    count += change / 500
    change = change % 500
    
    count += change / 100
    change = change % 100
    
    count += change / 50
    change = change % 50
    
    count += change / 10
    change = change % 10
    
    count += change / 5
    change = change % 5
    
    count += change / 1
    
    print("$count")
}