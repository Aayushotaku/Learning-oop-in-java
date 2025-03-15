# Concept of Constructor in Java

A constructor in Java is a special method that is called when an object is created from a class. It is used to initialize the attributes of the class. To explain this in more detail, let's consider an example of a simple class called `Person`:

```java
public class Person {
    public String name;
    public int age;
}
```

In this example, the `Person` class has two attributes: `name` and `age`.

The constructor is a special method that is called when an object is created from the `Person` class. It is used to initialize the attributes of the class. Here is an example of a constructor for the `Person` class:

```java
public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

In this example, the constructor `Person(String name, int age)` takes two parameters: `name` and `age`. These parameters are used to initialize the `name` and `age` attributes of the class. The `this` keyword is used to refer to the current object being created. The constructor is called when an object is created from the `Person` class, like this:

```java
Person person = new Person("John", 30);
```

In this example, the constructor `Person(String name, int age)` is called with the parameters `"John"` and `30`. The constructor initializes the `name` and `age` attributes of the `person` object with these values.

The constructor is a special method in Java that is called when an object is created from a class. It is used to initialize the attributes of the class.

There are 3 types of constructors in Java:
1. **No-arg constructor** - It is a constructor that does not take any parameters.
2. **Parameterized constructor** - It is a constructor that takes parameters.
3. **Copy constructor** - It is a constructor that takes an object of the same class as a parameter and creates a new object.