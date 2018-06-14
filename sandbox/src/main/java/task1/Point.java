package task1;

public class Point {

    public double x;
    public double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double dist(Point p) {
        double d = (Math.sqrt(Math.pow(x-p.x,2)+ Math.pow(y-p.y,2)));
        return d;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
