public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Point> coordinates = readCoordinatesFromFile("C:\\Users\\dermy\\IdeaProjects\\assign1perimeter\\src\\Source");
        Shape shape = new Shape(coordinates);

        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Longest Side: " + shape.findLongestSide());
        System.out.println("Average Side: " + shape.calculateAverageSide());
    }

    private static ArrayList<Point> readCoordinatesFromFile(String filename) {
        ArrayList<Point> coordinates = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextDouble()) {
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                coordinates.add(new Point(x, y));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
            e.printStackTrace();
        }

        return coordinates;
    }
}