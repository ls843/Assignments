public class GeometryCalculator {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public int calculateArea(int length, int width) {
        return length * width;
    }

    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }   

    public static void main(String[] args) {
        GeometryCalculator calc = new GeometryCalculator();

        double circleArea = calc.calculateArea(5.0);
        System.out.println("Area of Circle:" + circleArea);

        int rectangleArea = calc.calculateArea(4, 6);
        System.out.println("Area of Rectangle:" + rectangleArea);

        double triangleArea = calc.calculateArea(3.0, 4.0, true);
        System.out.println("Area of Triangle:" + triangleArea);
    }
}