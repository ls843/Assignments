public class PassByValue {
    public static void modifyPrimitive(int a) {
        a = 99;
        System.out.println("Inside modifyPrimitive: a = " + a);
    }

    public static void modifyArray(int[] b) {
        b[0] = 99;
        System.out.println("Inside modfiyArray: b[0] = " + b[0]);
    }
    public static void main(String[] args) {

        int a = 10;
        int[] b = {10, 20};

        modifyPrimitive(a);
        modifyArray(b);

        System.out.println("After method call:");
        System.out.println("a = " + a);
        System.out.println("b[0] = " + b[0]);
    }
}
