public class StackOverflowSimulator {

    public static void infiniteRecursion(int count) {
        System.out.println("Count: " + count);
        infiniteRecursion(count + 1);
    }

    public static void main(String[] args) {
        infiniteRecursion(1);
    }
}