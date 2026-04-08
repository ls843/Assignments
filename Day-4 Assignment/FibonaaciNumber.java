public class FibonaaciNumber {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 5; 
        int fibN = fibonacci(n);

        System.out.println("Fibonacci number F(" + n + ") = " + fibN);
    }
}