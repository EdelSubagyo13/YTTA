public class Point {
    int x, y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method untuk menampilkan koordinat
    public void printPoint() {
        System.out.println("Koordinat: (" + x + ", " + y + ")");
    }

    // Titik masuk program
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(5, 15);

        p1.printPoint();
        p2.printPoint();
    }
}
