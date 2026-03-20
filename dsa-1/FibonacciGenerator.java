import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many terms of the Fibonacci sequence do you want to see? ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci sequence:");
        for (int i = 1; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
    }
}