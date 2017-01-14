def cons = new BufferedReader(new InputStreamReader(System.in))

println "Please enter two numbers and we will calculate the quotient and remainder"
print "First number: "
String str1 = cons.readLine()
int i = Integer.parseInt(str1)

print "Second number: "
String str2 = cons.readLine()
int j = Integer.parseInt(str2)

int quotient = 0
int remainder = 0;
int work = 0

while (work + j <= i) {
    work = work + j
    quotient = quotient + 1
}
remainder = i - work

println "" + i + " divided by " + j + " is " + quotient + ", remainder " + remainder

