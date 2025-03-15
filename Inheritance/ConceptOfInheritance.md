# Concept of Inheritance in Java

Inheritance is a mechanism that allows one class to inherit the properties and behavior of another class. Inheritance is a fundamental concept in object-oriented programming (OOP) and is used to create a new class that is a modified version of an existing class. Inheritance is achieved by creating a new class that extends an existing class. The new class inherits all the properties and behavior of the existing class and can also add new properties and behavior or override the ones inherited from the existing class.

## Types of Inheritance:
1. **Single Inheritance**: In this type of inheritance, a child class inherits from a single parent class. For example, a class called "Vehicle" can have a child class called "Car" that inherits from it.
2. **Multiple Inheritance**: In this type of inheritance, a child class can inherit from multiple parent classes. For example, a class called "Vehicle" can have a child class called "Car" that inherits from it, and another child class called "Truck" that also inherits from it. However, multiple inheritance can lead to the "diamond problem" where a child class inherits conflicting properties from its parent classes.
3. **Multilevel Inheritance**: In this type of inheritance, a child class inherits from a parent class that itself inherits from another parent class. For example, a class called "Vehicle" can have a child class called "Car" that inherits from it, and another child class called "Truck" that inherits from "Car".
4. **Hierarchical Inheritance**: In this type of inheritance, a parent class can have multiple child classes. For example, a class called "Vehicle" can have child classes called "Car", "Truck", and "Motorcycle".

Inheritance is a powerful tool in object-oriented programming that allows for code reuse and the creation of a hierarchy of classes. It is a fundamental concept in OOP and is used to create a new class that is a modified version of an existing class.

## Example of Inheritance in Java

To make the concept of inheritance clearer, let's consider an example:

```java
// Parent class
public class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

// Child class
public class Car extends Vehicle {
    public void honk() {
        System.out.println("Car is honking");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Inherited method from Vehicle class
        myCar.honk();  // Method from Car class
    }
}
```

In this example:
- The `Vehicle` class is the parent class with a method `start()`.
- The `Car` class is the child class that extends the `Vehicle` class and adds a new method `honk()`.
- In the `Main` class, we create an object of the `Car` class and call both the inherited `start()` method and the `honk()` method.

This demonstrates how the `Car` class inherits the properties and behavior of the `Vehicle` class and can also add new properties and behavior.