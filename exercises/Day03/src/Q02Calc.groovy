def cons = new BufferedReader(new InputStreamReader(System.in))

double p = 0.0
double q = 0.0
double answer = 0.0

String str

//get inputs
println "Please provide two numbers"
print "First number: "
str = cons.readLine()
p = Double.parseDouble(str)
println "Entered: " + p

print "Second number: "
str = cons.readLine()
q = Double.parseDouble(str)
println "Entered: " + q

print "What do you want to do?  a = add, s = subtract, m = multiply, d = divide: "
str = cons.readLine()
println "Entered: " + str

// calculate
switch (str) {
    case "+":
        answer = p + q
        break
    case "-":
        answer = p - q
        break
    case "x":
        answer = p * q
        break
    case "/":
        answer = p / q
        break
    default:
        println "Invalid operator " + str
}

//output
println "The answer is: " + answer
