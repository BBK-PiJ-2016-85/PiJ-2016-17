double calcTotalToPay(double borrowed, double atRate) {
    return borrowed * (1 + (atRate / 100))
}

double calcPayEveryYear(double borrowed, double years, double atRate) {
    double total = calcTotalToPay(borrowed, atRate)
    return total / years
}

double calcYearsOfInterest(double borrowed, double years, double atRate) {
    double total = calcTotalToPay(borrowed, atRate)
    double interest = total - borrowed
    double yearlyPayment = calcPayEveryYear(borrowed, years, atRate)
    return interest / yearlyPayment
}

def cons = new BufferedReader(new InputStreamReader(System.in))

print "Total to borrow: "
String str = cons.readLine()
double borrow = Double.parseDouble(str)

print "Number of years: "
str = cons.readLine()
double years = Double.parseDouble(str)

print "Interest rate: "
str = cons.readLine()
double rate = Double.parseDouble(str)

double total = calcTotalToPay(borrow, rate)
println "Total to pay is: " + total

double yearlyPayment = calcPayEveryYear(borrow, years, rate)
println "Yearly payment is: " + yearlyPayment

double yearsOfInterest = calcYearsOfInterest(borrow, years, rate)
println "After " + yearsOfInterest + " years, only the capital remains."
