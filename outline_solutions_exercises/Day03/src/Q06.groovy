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

// make rectangle
Rectangle myRectangle = new Rectangle()
myRectangle.upLeft = upLeftCorner
myRectangle.downRight = downRightCorner

// make testPoint
Point testPoint = new Point()
print "test point X: "
strX = cons.readLine()
testPoint.x = Double.parseDouble(strX)
print "test point Y: "
strY = cons.readLine()
testPoint.y = Double.parseDouble(strY)

// see if testpoint inside
boolean insideHorizontal = false
boolean insideVertical = false

if (testPoint.x > myRectangle.upLeft.x && testPoint.x < myRectangle.downRight.x) {
    insideHorizontal = true
}
if (testPoint.y < myRectangle.upLeft.y && testPoint.y > myRectangle.downRight.y) {
    insideVertical = true
}
if (insideHorizontal && insideVertical) {
    println "Inside"
} else {
    println "Outside"
}
