def cons = new BufferedReader(new InputStreamReader(System.in))

//get input text and its length

print "Please write a text: "
String inputText = cons.readLine()

int inputLength = inputText.length()

//loop to: get a letter, count instances in input text and save letter

int i = 0
int j
int count = 0
char thisLetter
String checkedLetters = ""
int checkedLettersLength
boolean done = false

while (!done) {

    //get letter and count instances
    print "Which letter would you like to count now?:"
    char searchLetter = cons.readLine()

    // repeated letter check HERE...
    checkedLettersLength = checkedLetters.length()
    j = 0

    while (j < checkedLettersLength) {
        if (searchLetter == checkedLetters.charAt(j)) {
            done = true
        }
        j++
    }

    while (i < inputLength) {
        thisLetter = inputText.charAt(i)
        if (thisLetter == searchLetter) {
            count++
        }
        i++
    }

    // add letter to string of letters checked
    checkedLetters = checkedLetters + searchLetter

    // output and reset variables for loop
    if (done) {
        println "Thank you for your cooperation. Good bye!"
    } else {
        println "There are " + count + " in your text."
    }
    count = 0
    i = 0
}
