def cons = new BufferedReader(new InputStreamReader(System.in))

print "Enter a number to check if it is prime: "
String str = cons.readLine()

int i = Integer.parseInt(str)
int j = 2
String result = ""

while (j < i) {
    if (i % j == 0) {
        result = "not"
        break
    }
    j++
}

println("The number " + i + " is " + result + " prime")
