package Practice;
// Question 1: Single Inheritance
// Create a base class Animal with a method makeSound() that prints "Animal makes a sound".
// Then, create a subclass Dog that inherits from Animal and overrides the makeSound() method to print "Dog barks".
// In the main method:

// Create an Animal object and call makeSound().
// Create a Dog object and call makeSound().
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dogs extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dogs bark");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.makeSound();  // Calls Animal's makeSound()

        Dogs d1 = new Dogs();
        d1.makeSound();  // Calls Dogs' overridden makeSound()

        // Polymorphism demonstration
        Animal a2 = new Dogs();
        a2.makeSound();  // Calls Dogs' makeSound() (method overriding)
    }
}
