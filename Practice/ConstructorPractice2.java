package Practice;

class Car {
    String name;
    double price;

    // Non-Parameterized Constructor (Default Constructor)
    public Car() {
        this.name = "Toyota"; // Default brand name
        this.price = 50000.00; // Default price
    }

    // Parameterized Constructor
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Car Name: " + this.name);
        System.out.println("Car Price: " + this.price);
    }
}

public class ConstructorPractice2 {
    public static void main(String[] args) {
        Car c1 = new Car("Lambo", 100000.00); // Calls Parameterized Constructor
        c1.display();

        Car c2 = new Car(); // Calls Non-Parameterized Constructor
        c2.display();
    }
}

