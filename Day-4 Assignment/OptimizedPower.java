public class OptimizedPower {
    public static long power(int x, int n) {
        if(n == 0) return 1; 

        long half = power(x, n / 2); 
        
        //power(2, 0); = 1 -> power(2, 1); = 2 -> power(2, 2); = 4 -> power(2, 5); = 32 -> power(2, 10); = 1024

        if(n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;

        long result = power(x, n);
        System.out.println(x + "^" + n + " = " + result);
    }
}