def cons = new BufferedReader(new InputStreamReader(System.in))

int binary2decimal(String binInput) {
    int i = binInput.length();
    String str;
    int v;
    int decOutput = 0;
    for (int j = 0; j < i; j++) {
        str = binInput.charAt(j);
        v = Integer.parseInt(str);
        decOutput = decOutput + v * Math.pow(2, i - j - 1);
    }
    return decOutput;
}

String decimal2binary(int decInput) {
    int remainder;
    String binOutput = "";

    while (decInput >= 0.5) {
        remainder = decInput % 2;
        decInput = decInput / 2;
        binOutput = Integer.toString(remainder) + binOutput;
    }
    return binOutput;
}

String getMenuChoice() {
    while (true) {
        println "Enter b for binary to decimal, d for decimal to binary"
        print ">>> "
        String str = cons.readLine();
        if (str == "b" || str == "d") {
            return str
        } else {
            println "not valid"
        }
    }
}

String getBinInput() {
    println "Enter a binary number"
    print ">>> "
    String str = cons.readLine()
    return str
}

int getDecInput() {
    println "Enter a decimal number"
    print ">>> "
    String str = cons.readLine();
    int dec = Integer.parseInt(str)
    return dec
}


String str = getMenuChoice()
if (str == "b") {
    String binInput = getBinInput()
    int decOutput = binary2decimal(binInput)
    println "You entered the binary number: " + binInput
    println "which is: " + decOutput + " in decimal"

} else {
    int decInput = getDecInput()
    String binOutput = decimal2binary(decInput)
    println "You entered the decimal number: " + decInput
    println "which is: " + binOutput + " in binary"
}
