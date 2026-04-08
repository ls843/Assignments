class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private MenuItem[] items;
    private int itemCount;

    public Order() {
        items = new MenuItem[10];
        itemCount = 0;
    }

    public void addMenuItem(MenuItem item) {
        if(itemCount > items.length) {
            System.out.println("Cannot add more than 10 items");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    public double calculateTotal() {
        double total = 0;

        for(int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }

        return total;
    }

    public void printReceipt() {
        System.out.println("------ Coffee Shop Receipt ------");

        for(int i = 0; i < itemCount; i++) {
            System.out.println(items[i].getName() + " - $" + items[i].getPrice());
        }

        System.out.println("-------------------------------");
        System.out.println("Total: $" + calculateTotal());
    }
}

public class CoffeeShop {
    public static void main(String[] args) {
        MenuItem coffee = new MenuItem("Coffee", 3.50);
        MenuItem muffin = new MenuItem("Muffin", 2.75);
        MenuItem sandwich = new MenuItem("Sandwich", 5.25);

        Order myOrder = new Order();

        myOrder.addMenuItem(coffee);
        myOrder.addMenuItem(muffin);
        myOrder.addMenuItem(sandwich);

        myOrder.printReceipt();
    }
}