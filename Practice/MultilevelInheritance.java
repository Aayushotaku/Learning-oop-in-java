package Practice;
// Create a class Vehicle with an attribute brand and a method showBrand().
// Then, create a subclass Car that inherits from Vehicle and adds an attribute model.
// Finally, create another subclass SportsCar that inherits from Car and adds an attribute maxSpeed.
// In the main method:

// Create a SportsCar object and set all attributes (brand, model, maxSpeed).
// Display all details using a method.
class Vehicle {  // Fixed spelling
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand); // Calls parent (Vehicle) constructor
        this.model = model;
    }

    @Override
    void showBrand() {
        super.showBrand();  // Calls Vehicle's showBrand()
        System.out.println("Model: " + model);
    }
}

class SportsCar extends Car {
    int maxSpeed;

    SportsCar(String brand, String model, int maxSpeed) {
        super(brand, model); // Calls Car constructor
        this.maxSpeed = maxSpeed;
    }

    @Override
    void showBrand() {
        super.showBrand(); // Calls Car's showBrand()
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota");
        v1.showBrand();

        Car c1 = new Car("Honda", "Civic");
        c1.showBrand();

        SportsCar sc1 = new SportsCar("Ferrari", "F8", 340);
        sc1.showBrand();
    }
}
