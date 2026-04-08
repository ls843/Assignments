public class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public static void main(String[] args) {
        Box b1 = new Box(10, 10, 10);
        Box b2 = b1;

        b2.width = 50;

        System.out.println("b1.width:" + b1.width);
    }
}
