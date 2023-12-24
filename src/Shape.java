import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> points;

    public Shape(ArrayList<Point> points) {
        this.points= points;
    }

    public double findPer() {
        double per = 0;
        int size = points.size();

        for (int i=0;i<size;i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i+1)%size);

            per = currentPoint.distanceto(nextPoint);
        }
        return per;
    }
    public double findlongestSide() {
        double longestSide = 0;

        for (Point point : points) {
            for (Point otherPoint : points) {
                double distance = point.distanceto(otherPoint);
                if (distance > longestSide) {
                    longestSide = distance;
                }
            }
        }

        return longestSide;
    }
    public double findaverageside() {
        double averageside=0;
        double totalsidelength = 0;
        int numsides = points.size();

        for (int i=0;i<numsides;i++) {
            Point currentpoint=points.get(i);
            Point nextPoint = points.get((i+1)%numsides);

            totalsidelength += currentpoint.distanceto(nextPoint);
        }
        return totalsidelength/numsides;
    }
}
