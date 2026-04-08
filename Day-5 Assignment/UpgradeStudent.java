public class UpgradeStudent {
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
        if(gpa < 0.0 || gpa > 4.0) {
            System.out.println("Error: GPA must be between 0.0 and 4.0");
            return; 
        }

        this.gpa = gpa;
    }

    public static void main(String[] args) {
        UpgradeStudent s = new UpgradeStudent();

        s.setGpa(3.5);
        System.out.println("GPA: " + s.getGpa());

        s.setGpa(5.0); 
        System.out.println("GPA after invalid attempt: " + s.getGpa());

        s.setGpa(-1.0); 
        System.out.println("Final GPA: " + s.getGpa());
    }
}

