def cons = new BufferedReader(new InputStreamReader(System.in))

int[] value = new int[5]
String[] suit = new String[5]
String str = ""
int count = 0
boolean done = false

//get cards
while (count < 5) {
    valid = false
    number = false

    while (!valid) {
        print "Enter card value (1,2, ... , 9, 10, j, q, k): "
        str1 = cons.readLine()
        if (str1 == "j") {
            value[count] = 11
            done = true
            valid = true
        } else if (str1 == "q") {
            value[count] = 12
            done = true
            valid = true
        } else if (str1 == "k") {
            value[count] = 13
            done = true
            valid = true
        } else if (str1 == "10") {
            value[count] = 10
            done = true
            valid = true
        } else
            number = (str1 == "1" || str1 == "2" || str1 == "3" || str1 == "4" || str1 == "5" ||
                    str1 == "6" || str1 == "7" || str1 == "8" || str1 == "9" || str1 == "10")

        if (!done && number) {
            value[count] = Integer.parseInt(str1);
            valid = true
        }
    }

    boolean ok = false
    while (!ok) {
        println "Enter card suit (c,d,h,s): "
        str2 = cons.readLine()
        if (str2 == "c" || str2 == "d" || str2 == "h" || str2 == "s") {
            suit[count] = str2;
            ok = true;
        }
    }

    // check not duplicate and then confirm
    boolean dupl = false;
    c = 0;
    while (c < 5) {
        if (value[count] == value[c] && suit[count] == suit[c] && count != c) {
            dupl = true
            println "DUPLICATE!!!!!!!@"
        }
        c++
    }
    if (!dupl) {
        println "You added: " + value[count] + " of " + suit[count]
        count++
    }
    done = false
}

// check if all 5 are same suit
count = 1
boolean flush = true
while (count < 5) {
    if (suit[count] != suit[count - 1]) {
        flush = false
    }
    count++
}

// get how many of each value
int[] got = new int[13]
int check = 1
while (check < 14) {
    got[check - 1] = 0
    count = 0

    while (count < 5) {
        if (check == value[count]) {
            got[check - 1]++
        }
        count++
    }
    check++
}

// how many pairs, triples and quads and do we have a consec set?
int pair = 0
int triple = 0
int quad = 0
int straight = 0
boolean consec = false
count = 1
while (count < 14) {
    if (got[count - 1] == 2) {
        pair++
    }
    if (got[count - 1] == 3) {
        triple++
    }
    if (got[count - 1] == 4) {
        quad++
    }
    if (got[count - 1] == 1) {
        straight++
        if (straight == 5) {
            consec = true
        }
    } else {
        straight = 0
    }
    count++
}

//output best hand

if (consec && flush) {
    println "STRAIGHT FLUSH"
} else if (quad == 1) {
    println "POKER"
} else if (triple == 1 && pair == 1) {
    println "FULL HOUSE"
} else if (flush) {
    println "FLUSH"
} else if (consec) {
    println "STRAIGHT"
} else if (triple == 1) {
    println "THREE OF A KIND"
} else if (pair == 2) {
    println "TWO PAIR"
} else if (pair == 1) {
    println "PAIR"
} else
    println "NOTHING"
