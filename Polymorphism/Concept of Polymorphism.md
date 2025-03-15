Polymorphism is the ability of an object to take on multiple forms. Inother words, an object can change its behavior or characteristics based on the context in which it is used. This is achieved through the use of inheritance, interfaces, and polymorphic methods.
for example , a car can be a sedan, SUV, truck, etc. all arecar but have different characteristics and behaviors. This is polymorphism.
types of polymorphism

1. method overloading
2. method overriding

Method overloading is a feature of object-oriented programming (OOP) that allows multiple methods with the same name tobe defined, but with different parameters. This is useful when you want to perform different actions based on the number or types of arguments passed to a method.
Example:
class Calculator {
int add(int a, int b) {
return a + b;
}
int add(int a, int b, int c) {
return a + b + c;
}
}
In this example, the Calculator class has two methods named add, but with different parameters. The first method takes two int parameters, and the second method takes three int parameters. This is an example of method overloading.
Method overriding is a feature of object-oriented programming (OOP) that allows a subclass to provide a different implementation of a method that is already defined in its superclass. This is useful when you want to change the behavior of a method in a subclass.
Example:
class Animal {
void sound() {
System.out.println("The animal makes a sound.");
}
}
class Dog extends Animal {
void sound() {
System.out.println("The dog barks.");
}
}
In this example, the Dog class overrides the sound method of the Animal class. The Dog class provides a different implementation of the sound method, which is specific to dogs. This is an example of method overriding.

                Polymorphisim explain like i am 5 yrs old
                Alright! Imagine you have a magic toy that can transform into different things. Sometimes it becomes a car, sometimes a plane, and sometimes a boat. Even though it's the same toy, it can act differently based on what you want it to be.

In Java, polymorphism is like this magic toy! A single thing (a method or an object) can take different forms and behave differently.

There are two types of polymorphism in Java:

1. Compile-time polymorphism (Method Overloading) – Like a superhero with different powers depending on the situation.
2. Runtime polymorphism (Method Overriding) – Like a shape-shifting robot that behaves differently in different places.

3. Method Overloading (Compile-time Polymorphism)
   Imagine you have a talking toy that says different things depending on how you press the button. If you press it once, it says "Hello!", but if you press it twice, it says "Goodbye!".

In Java, method overloading means having multiple methods with the same name but different parameters. Java decides which one to use based on the arguments given.

#### Example:

```java
class TalkingToy {
    void talk() {
        System.out.println("Hello!");
    }

    void talk(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

public class Main {
    public static void main(String[] args) {
        TalkingToy toy = new TalkingToy();
        toy.talk(); // Calls the first talk() method
        toy.talk("Alice"); // Calls the second talk() method
    }
}
```

**Output:**

```
Hello!
Hello, Alice!
```

The same method name **talk()** behaves differently based on the input, just like the talking toy!

---

### 2. **Method Overriding (Runtime Polymorphism)**

Imagine you have a pet that can make sounds. If it's a dog, it barks. If it's a cat, it meows. Even though they are all pets, they make different sounds.

In Java, **method overriding** means a child class **changes the behavior** of a method from the parent class.

#### Example:

```java
class Pet {
    void makeSound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Pet {
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

class Cat extends Pet {
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Pet myPet;

        myPet = new Dog();
        myPet.makeSound(); // Dog's version of makeSound() is called

        myPet = new Cat();
        myPet.makeSound(); // Cat's version of makeSound() is called
    }
}
```

**Output:**

```
Bark! Bark!
Meow! Meow!
```

Even though we are using the same method **makeSound()**, the behavior **changes** based on whether the pet is a dog or a cat.

---

Final Summary

- Method Overloading → Same method name, different input (Compile-time).
- **Method Overriding** → Same method name, different behavior (Runtime).

Just like how your magic toy can be a car or a boat, Java methods can change how they act depending on the situation! 🚗🚀⛵
