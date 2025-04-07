fun main() {
    val M = readln().toInt()
    val N = readln().toInt()
    val primes = mutableListOf<Int>()
    
    for (num in M .. N) {
        if (isPrime(num)) primes.add(num)
    }
    
    if (primes.isEmpty()) print("-1")
    else {
        println("${primes.sum()}")
        println("${primes.min()}")
    }
}

fun isPrime(num: Int): Boolean {
    // 1. 1이면 소수가 아니다
    if (num == 1) return false
    // 2. num을 1과 자기 자신이 아닌 수로 나눠서 나누어떨어지면 소수가 아니다.
    // 이때, num의 제곱근까지만 확인하면 된다. -> 시간 복잡도를 줄일 수 있다.
    
    // 다만 sqrt은 실수를 활용하기 때문에 부동소수점 오차로 인해 정확하지 않을 수 있다.
    // 되도록이면 sqrt 함수 사용은 피하는 것이 좋다.
    var i = 2
    while (i * i <= num) {
        if (num % i++ == 0) return false
    }
    
    return true
}