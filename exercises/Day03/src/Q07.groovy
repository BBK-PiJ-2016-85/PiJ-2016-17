def cons = new BufferedReader(new InputStreamReader(System.in))

class Point {
    double x
    double y
}


class Rectangle {
    Point upLeft
    Point downRight
}


String strX, strY

// make Up Left Corner
Point upLeftCorner = new Point()
print "Up Left X: "
strX = cons.readLine()
upLeftCorner.x = Double.parseDouble(strX)
print "Up Left Y: "
strY = cons.readLine()
upLeftCorner.y = Double.parseDouble(strY)

// make Down Right Corner
Point downRightCorner = new Point()
print "Down RightX: "
strX = cons.readLine()
downRightCorner.x = Double.parseDouble(strX)
print "Down Right Y: "
strY = cons.readLine()
downRightCorner.y = Double.parseDouble(strY)

// make first rectangle
Rectangle myFirstRectangle = new Rectangle()
myFirstRectangle.upLeft = upLeftCorner
myFirstRectangle.downRight = downRightCorner

// make Up Left Corner TWO
Point upLeftCornerTwo = new Point()
print "Up Left X: "
strX = cons.readLine()
upLeftCornerTwo.x = Double.parseDouble(strX)
print "Up Left Y: "
strY = cons.readLine()
upLeftCornerTwo.y = Double.parseDouble(strY)

// make Down Right Corner TWO
Point downRightCornerTwo = new Point()
print "Down RightX: "
strX = cons.readLine()
downRightCornerTwo.x = Double.parseDouble(strX)
print "Down Right Y: "
strY = cons.readLine()
downRightCornerTwo.y = Double.parseDouble(strY)

// make second rectangle
Rectangle mySecondRectangle = new Rectangle()
mySecondRectangle.upLeft = upLeftCornerTwo
mySecondRectangle.downRight = downRightCornerTwo

// make testPoint
Point testPoint = new Point()
print "test point X: "
strX = cons.readLine()
testPoint.x = Double.parseDouble(strX)
print "test point Y: "
strY = cons.readLine()
testPoint.y = Double.parseDouble(strY)

boolean insideFirst = false
boolean insideSecond = false

// see if testpoint inside first rectangle
boolean insideHorizontal = false
boolean insideVertical = false

if (testPoint.x > myFirstRectangle.upLeft.x && testPoint.x < myFirstRectangle.downRight.x) {
    insideHorizontal = true
}
if (testPoint.y < myFirstRectangle.upLeft.y && testPoint.y > myFirstRectangle.downRight.y) {
    insideVertical = true
}

if (insideHorizontal && insideVertical) {
    insideFirst = true
}

// see if testpoint inside second rectangle
insideHorizontal = false
insideVertical = false

if (testPoint.x > mySecondRectangle.upLeft.x && testPoint.x < mySecondRectangle.downRight.x) {
    insideHorizontal = true
}
if (testPoint.y < mySecondRectangle.upLeft.y && testPoint.y > mySecondRectangle.downRight.y) {
    insideVertical = true
}
if (insideHorizontal && insideVertical) {
    insideSecond = true
}

// output

if (insideFirst && insideSecond) {
    println "inside both"
} else {
    if (insideFirst || insideSecond) {
        println "inside one"
    }
}
if (!insideFirst && !insideSecond) {
    println "outside both"
}
