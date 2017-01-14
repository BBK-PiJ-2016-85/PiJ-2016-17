def cons = new BufferedReader(new InputStreamReader(System.in))

println "Please enter two numbers to multiply together"
print "First number: "
String str1 = cons.readLine()
int i = Integer.parseInt(str1)

print "Second number: "
String str2 = cons.readLine()
int j = Integer.parseInt(str2)

int count = 1
int result = 0

while (count <= j) {
    result = result + i
    count++
}

println "The result of multiplying " + i + " by " + j + " is " + result

