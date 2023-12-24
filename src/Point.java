public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distanceto(Point destination) {
        double xdiff = destination.getX() - this.x;
        double ydiff = destination.getY() - this.y;

        return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
    }
}
