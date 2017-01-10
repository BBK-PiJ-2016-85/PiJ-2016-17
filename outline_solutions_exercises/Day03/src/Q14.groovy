//get input text and its length

print "Please input some text: "
String inputText = System.console().readLine()
int inputLength = inputText.length()

//print forwards
print inputText

//print backwards using a while loop

int i = 0
while (i < inputLength) {
    backLetter = inputText.charAt(inputLength - i - 1)
    print backLetter
    i++
}

println()

//print forwards

print inputText

//print backwards using a for loop

for (i = 0; i < inputLength; i++) {
    backLetter = inputText.charAt(inputLength - i - 1)
    print backLetter
}

println()
