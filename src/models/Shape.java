class Shape {
    ArrayList<Point> points;

    public Shape(ArrayList<Point> points) {
        this.points = points;
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        int n = points.size();

        for (int i = 0; i < n; i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % n);
            perimeter += current.calculateDistance(next);
        }

        return perimeter;
    }

    public double findLongestSide() {
        double longestSide = 0;

        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            double sideLength = current.calculateDistance(next);
            longestSide = Math.max(longestSide, sideLength);
        }

        return longestSide;
    }

    public double calculateAverageSide() {
        double totalSideLength = 0;

        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            totalSideLength += current.calculateDistance(next);
        }

        return totalSideLength / points.size();
    }
}
