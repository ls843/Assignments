public class Car {
    String make;
    String model;
    int year;
    double currentSpeed;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.currentSpeed = 0.0;
    }

    public void accelerate(double speedIncrease) {
        currentSpeed += speedIncrease;
    }

    public void brake(double speedDecrease) {
        currentSpeed -= speedDecrease;

        if(currentSpeed < 0) {
            currentSpeed = 0;
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);

        car1.accelerate(30.5);
        car2.accelerate(50.0);

        car1.brake(10.0);
        car2.brake(5.0);

        System.out.println(car1.make + " " + car1.model + " speed: " + car1.currentSpeed);
        System.out.println(car2.make + " " + car2.model + " speed: " + car2.currentSpeed);
    }
}