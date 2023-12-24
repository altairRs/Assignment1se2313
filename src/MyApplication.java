import java.util.ArrayList;
import java.util.Random;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Point> Points = generateRandomPoints(10);

        Shape shape = new Shape(Points);

        System.out.println("Perimeter: " + shape.findPer());
        System.out.println("Longest Side: " + shape.findlongestSide());
        System.out.println("Average Side: " + shape.findaverageside());
    }

    private static ArrayList<Point> generateRandomPoints(int numPoints) {
        ArrayList<Point> points = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numPoints; i++) {
            points.add(new Point(random.nextInt(100), random.nextInt(100)));
        }

        return points;
    }
}
