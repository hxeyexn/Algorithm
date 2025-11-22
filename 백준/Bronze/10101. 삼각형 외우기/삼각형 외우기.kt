fun main() {
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()
    
    val sum = first + second + third
    val set = mutableSetOf(first, second, third)
    
    val result = 
        when {
            sum == 180 && set.size == 1 -> "Equilateral"
            sum == 180 && set.size == 2 -> "Isosceles"
            sum == 180 && set.size == 3 -> "Scalene"
            else -> "Error"
        }
    
    print(result)
}