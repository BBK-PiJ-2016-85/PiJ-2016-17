def cons = new BufferedReader(new InputStreamReader(System.in))

class Point {
    double x
    double y
}

String strX, strY

// make firstPoint
Point firstPoint = new Point()
print "X: "
strX = cons.readLine()
firstPoint.x = Double.parseDouble(strX)
print "Y: "
strY = cons.readLine()
firstPoint.y = Double.parseDouble(strY)

// make secondPoint
Point secondPoint = new Point()
print "X: "
strX = cons.readLine()
secondPoint.x = Double.parseDouble(strX)
print "Y: "
strY = cons.readLine()
secondPoint.y = Double.parseDouble(strY)

// make thirdPoint
Point thirdPoint = new Point()
print "X: "
strX = cons.readLine()
thirdPoint.x = Double.parseDouble(strX)
print "Y: "
strY = cons.readLine()
thirdPoint.y = Double.parseDouble(strY)

// calculate distance between first and second points

double distanceFirstSecond = Math.pow(Math.pow((firstPoint.x - secondPoint.x), 2) + Math.pow((firstPoint.y - secondPoint.y), 2), 0.5)
double distanceFirstThird = Math.pow(Math.pow((firstPoint.x - thirdPoint.x), 2) + Math.pow((firstPoint.y - thirdPoint.y), 2), 0.5)
double distanceSecondThird = Math.pow(Math.pow((thirdPoint.x - secondPoint.x), 2) + Math.pow((thirdPoint.y - secondPoint.y), 2), 0.5)

if (distanceFirstSecond < distanceSecondThird && distanceFirstSecond < distanceFirstThird) {
    println "First and Second are nearest"
} else if (distanceSecondThird < distanceFirstSecond && distanceSecondThird < distanceFirstThird) {
    println "Second and Third are nearest"
} else
    println "First and Third are nearest"
