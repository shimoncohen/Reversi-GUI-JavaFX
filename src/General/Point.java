package General;

/*
 * A point consisting x and y values.
 */
public class Point {
    // members
    private int x,y;

    /*
     * function name: Point.
     * input: two numbers as coordinate.
     * output: none.
     * operation: constructor.
     */
    Point(int a, int b) {
        this.x = a;
        this.y = b;
    }

    /*
     * function name: getPoint.
     * input: none.
     * output: an array of ints.
     * operation: returns the points x and y values.
     */
    public int[] getPoint() {
        int[] temp = new int[2];
        temp[0] = this.x;
        temp[1] = this.y;
        return temp;
    }

    /*
     * function name: getX.
     * input: none.
     * output: the points x value.
     * operation: returns the points x value.
     */
    public int getX() {
        return  this.x;
    }

    /*
     * function name: getY.
     * input: none.
     * output: the points y value.
     * operation: returns the points y value.
     */
    public int getY() {
        return this.y;
    }

    /*
     * function name: equals.
     * input: a Point object to compare with.
     * output: a boolean value indicating if Points are equal.
     * operation: returns true if points are equal, false otherwise.
     */
    public boolean equals(Point other) {
        return this.x == other.getX() && this.y == other.getY();
    }
}
