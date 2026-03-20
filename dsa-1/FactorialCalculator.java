import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int factorial = 1;
        int i = 1;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            while (i <= num) {
                factorial = factorial * i;  
                i++;                        
            }

            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }
}
