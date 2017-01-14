def cons = new BufferedReader(new InputStreamReader(System.in))

println "Please input three numbers for sorting"

print "First number: "
String str1 = cons.readLine()
int a = Integer.parseInt(str1)

print "Second number: "
String str2 = cons.readLine()
int b = Integer.parseInt(str2)

print "Third number: "
String str3 = cons.readLine()
int c = Integer.parseInt(str3)

int min, mid, max

if (a > b) {
    if (a > c) {
        max = a
        if (b > c) {
            mid = b
            min = c
        } else {
            mid = c
            min = b
        }
    } else {
        mid = a
        if (b > c) {
            max = b
            min = c
        } else {
            max = c
            min = b
        }
    }
} else {
    if (b > c) {
        max = b
        if (a > c) {
            mid = a
            min = c
        } else {
            mid = c
            min = a
        }
    } else {
        mid = b
        max = c
        min = a
    }
}

println "low is: " + min + ", middle is: " + mid + ", highest is: " + max
