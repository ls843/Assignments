import java.util.Scanner;

public class ReversePalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a multi-digit integer: ");
        int originalNumber = sc.nextInt();
        int number = originalNumber; 
        int reversedNumber = 0;

        while(number != 0) {
            int lastDigit = number % 10;        
            reversedNumber = reversedNumber * 10 + lastDigit; 
            number = number / 10;              
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a Palindrome.");
        } else {
            System.out.println(originalNumber + " is NOT a Palindrome.");
        }
    }
}