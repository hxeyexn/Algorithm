// A -> D, B -> E, C -> F 알파벳 문자를 3개씩 건너뛰어
fun main() {    
    val caesar = 
        mapOf<Char, Char>(
            'D' to 'A',
            'E' to 'B',
            'F' to 'C',
            'G' to 'D',
            'H' to 'E',
            'I' to 'F',
            'J' to 'G',
            'K' to 'H',
            'L' to 'I',
            'M' to 'J',
            'N' to 'K',
            'O' to 'L',
            'P' to 'M',
            'Q' to 'N',
            'R' to 'O',
            'S' to 'P',
            'T' to 'Q',
            'U' to 'R',
            'V' to 'S',
            'W' to 'T',
            'X' to 'U',
            'Y' to 'V',
            'Z' to 'W',
            'A' to 'X',
            'B' to 'Y',
            'C' to 'Z',
        )
    
    val word = readln()
    
    repeat(word.length) {
        print("${caesar[word[it]]}")
    }
}