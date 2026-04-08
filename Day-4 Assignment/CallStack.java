public class CallStack {
    public static void countDown(int n) {
        if(n == 0) return;

        System.out.print(n + " ");
        countDown(n - 1);
    }

    public static void countUp(int n) {
        if(n == 0) return;

        countUp(n - 1);
        System.out.print(n + " ");
    }
    
    public static void main(String[] args) {
        System.out.print("Count Down: ");
        countDown(5);

        System.out.println();

        System.out.print("Count Up: ");
        countUp(5);
    }
}
