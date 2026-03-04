public class Stack<T> {
    private T[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public Stack() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(T value) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        T value = elements[--size];
        elements[size] = null;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");

        System.out.println(stack.pop());  // B
        System.out.println(stack.peek()); // A
        System.out.println(stack.isEmpty()); // false
    }
}
