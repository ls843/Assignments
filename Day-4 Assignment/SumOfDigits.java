public class SumOfDigits {
    public static int sumDigits(int num) {
        if(num < 10) {
            return num;
        }

        return (num % 10) + sumDigits(num / 10); 
    }
    public static void main(String[] args) {
        int num = 253;
        int result = sumDigits(num);

        System.out.println("Sum of digits of " + num + " = " + result);
    }
}