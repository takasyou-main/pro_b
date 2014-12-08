public class Point {
    int x;
    int y;

    void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printPosition() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.setPosition(1, 2);
        p.printPosition();
    }
}
