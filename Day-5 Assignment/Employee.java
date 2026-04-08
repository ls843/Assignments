public class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employee(int id, String name) {
        this(id, name, "Unassigned", 0.0);
    }

     public Employee(int id, String name, String department) {
        this(id, name, department, 0.0);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Alice", "HR", 50000);

        Employee e2 = new Employee(2, "Bob");

        Employee e3 = new Employee(3, "Charlie", "IT");

        System.out.println(e1.name + " | " + e1.department + " | " + e1.salary);
        System.out.println(e2.name + " | " + e2.department + " | " + e2.salary);
        System.out.println(e3.name + " | " + e3.department + " | " + e3.salary);
    }
}
