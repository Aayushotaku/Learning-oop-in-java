# Concept of Packages in Java

Packages in Java are used to group related classes, interfaces, and other types together. They are used to organize the code in a logical and structured way. Here are some key points about packages in Java:
* A package is a namespace that contains a collection of related classes, interfaces, and other types.
* Packages are used to organize code in a logical and structured way.
* Packages are used to avoid naming conflicts between classes with the same name in different packages.
* Packages are used to control access to classes and interfaces using access modifiers such as public, private, and protected.

## Package Declaration

Here is an example of a package declaration in Java:

```java
package com.example.myapp;
```

## Class Declaration Inside a Package

Here is an example of a class declaration inside a package:

```java
package com.example.myapp;

public class MyClass {
    // class body
}
```

## Importing a Class from a Package

Here is an example of how to import a class from a package:

```java
import com.example.myapp.MyClass;

public class MyOtherClass {
    // class body
}
```

## Types of Packages in Java

There are mainly two types of packages in Java:
1. **Built-in packages**: These are the packages that are provided by the Java Development Kit (JDK). These packages are used to perform various tasks such as input/output operations, networking, and database operations. Some examples of built-in packages are `java.lang`, `java.util`, and `java.io`.
2. **User-defined packages**: These are the packages that are created by the user. These packages are used to organize the code in a logical and structured way. User-defined packages are created using the `package` keyword followed by the name of the package. For example, `package com.example.myapp;`.

### Sub-packages and Inner Classes

User-defined packages can be further divided into two categories:
1. **Sub-packages**: These are the packages that are created inside another package. For example:
    ```java
    package com.example.myapp;
    package com.example.myapp.subpackage;
    ```
2. **Inner classes**: These are the classes that are defined inside another class. For example:
    ```java
    public class OuterClass {
        public class InnerClass {
            // class body
        }
    }
    ```

Packages are a fundamental concept in Java that help in organizing code, avoiding naming conflicts, and controlling access to classes and interfaces.
