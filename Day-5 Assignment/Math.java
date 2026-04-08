class MathUtils {
    private MathUtils() {}

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static long factorial(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }

        long result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}

public class Math {
    public static void main(String[] args) {

        System.out.println("Is 4 even? " + MathUtils.isEven(4));
        System.out.println("Factorial of 5: " + MathUtils.factorial(5));
        System.out.println("Max of 10 and 20: " + MathUtils.max(10, 20));

        // MathUtils m = new MathUtils(); 
    }
}