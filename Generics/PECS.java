import java.util.*;

public class PECS {

    public static <T> void copy(List<? super T> destination, List<? extends T> source) {
        for (T element : source) {
            destination.add(element);
        }
    }

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3);
        List<Number> numbers = new ArrayList<>();

        copy(numbers, integers);

        System.out.println(numbers); 
    }
}