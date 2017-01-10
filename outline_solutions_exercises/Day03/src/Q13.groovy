def cons = new BufferedReader(new InputStreamReader(System.in))

//get input text and its length

print "Please write a text:"
String inputText = cons.readLine()
int inputLength = inputText.length()

//test letters against each other
String frontLetter, backLetter
int i = 0
boolean palindrome = true

while (i < inputLength) {
    frontLetter = inputText.charAt(i)
    backLetter = inputText.charAt(inputLength - i - 1)
    if (frontLetter != backLetter) {
        palindrome = false
    }
    i++
}

//output
if (palindrome) {
    println "That's a palindrome"
} else {
    println "That's NOT a palindrome"
}
