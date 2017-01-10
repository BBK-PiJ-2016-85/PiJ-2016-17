def cons = new BufferedReader(new InputStreamReader(System.in))

boolean firstNumber = true
String insequence = "Yes"
int prev

println "Enter a (arbitrarily long)  sequence of +ve numbers"
println "Enter -1 to end the sequence"

while (true) {
    print "Please enter a number: "
    String str = cons.readLine()
    value = Integer.parseInt(str)

    if (value == -1) {
        break
    }

    if (firstNumber) {
        firstNumber = false
    } else {
        if (prev != (value - 1)) {
            insequence = "No"
        }
    }
    prev = value
}

println insequence
