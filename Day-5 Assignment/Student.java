public class Student {
    private int studentId;
    private String name;
    private double gpa;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.setStudentId(101);
        s.setName("Alice");
        s.setGpa(8.5);

        System.out.println("ID: " + s.getStudentId());
        System.out.println("Name: " + s.getName());
        System.out.println("GPA: " + s.getGpa());
    }
}