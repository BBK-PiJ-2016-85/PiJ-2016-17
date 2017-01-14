def cons = new BufferedReader(new InputStreamReader(System.in))

class Point {
    double x
    double y

    double distanceTo(Point p) {
        return Math.pow((Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2)), 0.5)
    }

    double distanceToOrigin() {
        Point origin = new Point()
        origin.x = 0
        origin.y = 0
        return distanceTo(origin)
    }

    void moveTo(double a, double b) {
        this.x = a
        this.y = b
    }

    void moveTo(Point p) {
        this.x = p.x
        this.y = p.y
    }

    Point clone() {
        Point p = new Point()
        p.x = x
        p.y = y
        return p
    }

    Point opposite() {
        Point p = new Point()
        p.x = -x
        p.y = -y
        return p
    }
}

Point first = new Point()
first.x = 3.0
first.y = 4.0

Point another = new Point()
another.x = 2.0
another.y = 3.0

Point given = new Point()
given.x = 20
given.y = 30


println "First point is: " + first.x + ", " + first.y
println "Another point is: " + another.x + ", " + another.y
println "======"

println "From the first point..."
println "...distance to another point is: " + first.distanceTo(another)
println "...distance to origin point is: " + first.distanceToOrigin()
println "======"

println "Now we use moveTo(5,10) to move this point to 5,10..."

first.moveTo(5.0, 10.0)

println "First point is: " + first.x + ", " + first.y
println "Another point is: " + another.x + ", " + another.y
println "======"

println "Given point is: " + given.x + ", " + given.y
println "Now change this point(first) to move to the given point..."

first.moveTo(given)

println "First point is: " + first.x + ", " + first.y
println "======"
println "Now clone() that point to build the point zpt"

zpt = first.clone()

println "zpt point is: " + zpt.x + ", " + zpt.y
println "======"
println "and then return a copy of current point zpt * -1"

zptMinus = zpt.opposite()

println "zptMinus  is: " + zptMinus.x + ", " + zptMinus.y
