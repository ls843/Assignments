public class User {
    private String name;
    private int id;

    private static int totalUsers = 0;

    public User(String name, int id) {
        this.name = name;
        this.id = id;

        totalUsers++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    public static void main(String[] args) {

        User u1 = new User("Alice", 1);
        User u2 = new User("Bob", 2);
        User u3 = new User("Charlie", 3);

        System.out.println("Total users: " + User.getTotalUsers());
    }
}