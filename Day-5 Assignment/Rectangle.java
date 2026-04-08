public class Rectangle {
    double width;
    double length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(int side) {
        this.width = side;
        this.length = side;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        Rectangle r2 = new Rectangle(5);

        Rectangle r3 = new Rectangle(5, 10);

        System.out.println("r1: " + r1.length + " x " + r1.width);
        System.out.println("r2: " + r2.length + " x " + r2.width);
        System.out.println("r3: " + r3.length + " x " + r3.width);
    }
}
