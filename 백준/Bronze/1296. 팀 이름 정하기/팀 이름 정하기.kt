fun main() {
    val br = System.`in`.bufferedReader()
    val name = br.readLine()
    val n = br.readLine().toInt()
    var probability = 0
    val victoryTeamNames = mutableListOf<String>()

    repeat(n) {
        val teamName = br.readLine()
        val lCount = name.count { it == 'L' } + teamName.count { it == 'L' }
        val oCount = name.count { it == 'O' } + teamName.count { it == 'O' }
        val vCount = name.count { it == 'V' } + teamName.count { it == 'V' }
        val eCount = name.count { it == 'E' } + teamName.count { it == 'E' }

        val victory = ((lCount + oCount) * (lCount + vCount) * (lCount + eCount) * (oCount + vCount) * (oCount + eCount) * (vCount + eCount)) % 100

        if (probability < victory) {
            probability = victory
            victoryTeamNames.clear()
            victoryTeamNames.add(teamName)
        } else if (probability == victory) {
            victoryTeamNames.add(teamName)
        }
    }

    victoryTeamNames.sort()
    print(victoryTeamNames[0])
}
