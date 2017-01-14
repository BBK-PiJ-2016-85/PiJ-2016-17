/*
 * Write a program that read a (arbitrarily long) sequence of positive numbers.
 * The sequence is ended when the users enters “-1”.
 * At that point, the program must output the highest number in the sequence.
 *
 * Illustrates the "mid-test" loop type
*/

int value
int highest = -1
boolean values = false; // values have been entered

def cons = new BufferedReader(new InputStreamReader(System.in))

println "Enter a (arbitrarily long)  sequence of +ve numbers"
println "Enter -1 to end the sequence"

while (true) {
    print "Please enter a number: "
    String str = cons.readLine()
    value = Integer.parseInt(str)

    if (value == -1) {
        break;
    }
    values = true;

    if (value > highest) {
        highest = value;
    }
}

if (values)
    println "The highest number in the sequence is " + highest
else
    println "You did not enter any valid values"
