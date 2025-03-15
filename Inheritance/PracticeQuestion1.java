//Simple Inheritance:
//Question
// Create a base class Animal with properties like name and age and a method makeSound().
// Create a derived class Dog that inherits from Animal and overrides makeSound() to print "Bark".
// Test the functionality in main().


package Inheritance;
//single inheritance
class Animal {
    String name;
    int age;

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark!!");
    }
}

public class PracticeQuestion1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound(); // Calls the overridden method in Dog class
        
    }
}
