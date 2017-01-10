def cons = new BufferedReader(new InputStreamReader(System.in))

boolean winner = false
String playerOneGoes, playerTwoGoes

int playerOneScore = 0
int playerTwoScore = 0
int scoreGap

while (!winner) {

    println "This round choices are: "
    String entry = cons.readLine()

    playerOneGoes = entry.substring(0, 1)
    playerTwoGoes = entry.substring(1, 2)

    println "P1 picked:" + playerOneGoes + " P2 picked:" + playerTwoGoes

    if (playerOneGoes == playerTwoGoes) {
        println "SNAP"
    } else {
        if (playerOneGoes == "r" && playerTwoGoes == "s" ||
                playerOneGoes == "p" && playerTwoGoes == "r" ||
                playerOneGoes == "s" && playerTwoGoes == "p") {
            println "P1 WINS THIS ROUND"
            playerOneScore++
        } else {
            println "P2 WINS THIS ROUND"
            playerTwoScore++
        }
    }
    scoreGap = playerOneScore - playerTwoScore
    if (scoreGap == 3) {
        println "PLAYER ONE WINS"
        winner = true
    }
    if (scoreGap == -3) {
        println "PLAYER TWO WINS"
        winner = true
    }
}
