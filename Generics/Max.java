public class Max {

    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(10, 20, 5));        
        System.out.println(findMax(3.5, 2.1, 9.8));      
        System.out.println(findMax("A", "Z", "M"));
    }
}