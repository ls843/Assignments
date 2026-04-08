public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);

        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);
    }
}
