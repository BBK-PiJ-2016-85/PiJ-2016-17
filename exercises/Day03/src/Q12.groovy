def cons = new BufferedReader(new InputStreamReader(System.in))

// get inputs

println "Cost of item: "
String cost = cons.readLine()

println "Amount paid: "
String paid = cons.readLine()

//convert to pounds and pence - for cost
int l = cost.length()
int i = 0
int placeDot = 0
while (i < l) {
    if (cost.charAt(i) == '.') {
        placeDot = i
    }
    i++
}

String costPoundsStr = cost.substring(0, placeDot)

int costPounds = Integer.parseInt(costPoundsStr)

String costPenceStr = cost.substring(placeDot + 1, l)

int costPence = Integer.parseInt(costPenceStr)

println "It costs: " + costPounds + " pounds and " + costPence + " pence"

//convert to pounds and pence - for paid

l = paid.length()
i = 0

while (i < l) {
    if (paid.charAt(i) == '.') {
        placeDot = i
    }
    i++
}

String paidPoundsStr = paid.substring(0, placeDot)

int paidPounds = Integer.parseInt(paidPoundsStr)

String paidPenceStr = paid.substring(placeDot + 1, l)

int paidPence = Integer.parseInt(paidPenceStr)

println "You paid: " + paidPounds + " pounds and " + paidPence + " pence"

//calculate total change due
if (costPence > paidPence) {
    paidPence = paidPence + 100
    paidPounds = paidPounds - 1
}

int changePence = paidPence - costPence
int changePounds = paidPounds - costPounds

println "Change is: " + changePounds + " pounds and " + changePence + " pence"

// assign change to notes and coins
// it would be better to use a method but that is not what is required

int noteFifty = 0
while (changePounds >= 50) {
    noteFifty++
    changePounds = changePounds - 50
}

int noteTwenty = 0
while (changePounds >= 20) {
    noteTwenty++
    changePounds = changePounds - 20
}

int noteTen = 0
while (changePounds >= 10) {
    noteTen++
    changePounds = changePounds - 10
}

int noteFive = 0
while (changePounds >= 5) {
    noteFive++
    changePounds = changePounds - 5
}

int coinTwoPound = 0
while (changePounds >= 2) {
    coinTwoPound++
    changePounds = changePounds - 2
}

int coinOnePound = 0
while (changePounds >= 1) {
    coinOnePound++
    changePounds = changePounds - 1
}

int coinFiftyPence = 0
while (changePence >= 50) {
    coinFiftyPence++
    changePence = changePence - 50
}

int coinTwentyPence = 0
while (changePence >= 20) {
    coinTwentyPence++
    changePence = changePence - 20
}

int coinTenPence = 0
while (changePence >= 10) {
    coinTenPence++
    changePence = changePence - 10
}

int coinFivePence = 0
while (changePence >= 5) {
    coinFivePence++
    changePence = changePence - 5
}

int coinTwoPence = 0
while (changePence >= 2) {
    coinTwoPence++
    changePence = changePence - 2
}

int coinOnePence = 0
while (changePence >= 1) {
    coinOnePence++
    changePence = changePence - 1
}

// output

println "Number of �50 notes: " + noteFifty
println "Number of �20 notes: " + noteTwenty
println "Number of �10 notes: " + noteTen
println "Number of � 5 notes: " + noteFive
println "Number of � 2 coins: " + coinTwoPound
println "Number of � 1 coins: " + coinOnePound
println "Number of 50p coins: " + coinFiftyPence
println "Number of 20p coins: " + coinTwentyPence
println "Number of 10p coins: " + coinTenPence
println "Number of  5p coins: " + coinFivePence
println "Number of  2p coins: " + coinTwoPence
println "Number of  1p coins: " + coinOnePence
