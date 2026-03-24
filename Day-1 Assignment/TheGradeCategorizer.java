import java.util.Scanner;

public class TheGradeCategorizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student's percentage: ");
        double percentage = sc.nextDouble();

        if (percentage < 0 || percentage > 100) {
            System.out.println("Error: Invalid percentage entered.");
        }
        else if (percentage >= 90) {
            System.out.println("Grade: A");
        }
        else if (percentage >= 80) {
            System.out.println("Grade: B");
        }
        else if (percentage >= 70) {
            System.out.println("Grade: C");
        }
        else if (percentage >= 60) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
    }
}