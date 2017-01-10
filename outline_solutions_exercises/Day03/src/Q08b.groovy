def cons = new BufferedReader(new InputStreamReader(System.in))

//get input

println "Text please: "
String str = cons.readLine()

// pick each letter in turn and print it out

int strLong = str.length()
int i = 0
char thisLetter

while (i < strLong) {
    thisLetter = str.charAt(i)
    if (thisLetter == ' ') {
        println()
    } else {
        print thisLetter
    }
    i++
}
println()
