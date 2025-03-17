# Concept of Access Modifiers in Java

Access modifiers in Java are keywords that set the accessibility of classes, methods, and other members. They determine which other classes can access a particular class or member. There are four main access modifiers in Java:

1. **Public**: The `public` access modifier makes a class, method, or member accessible from any other class.
2. **Protected**: The `protected` access modifier makes a class, method, or member accessible within its own package and by subclasses.
3. **Default (Package-Private)**: If no access modifier is specified, the member is accessible only within its own package.
4. **Private**: The `private` access modifier makes a class, method, or member accessible only within its own class.

## Examples and Detailed Explanation

### Public Access Modifier

A member with `public` access can be accessed from any other class.

```java
// filepath: c:\Users\HP\Desktop\Learning oop in java\Packages_and_Access_modifires\Example.java
package com.example;

public class PublicClass {
    public void display() {
        System.out.println("Public method");
    }
}

// filepath: c:\Users\HP\Desktop\Learning oop in java\Packages_and_Access_modifires\Test.java
package com.test;

import com.example.PublicClass;

public class Test {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        obj.display(); // Accessible
    }
}
```

### Protected Access Modifier

A member with `protected` access can be accessed within its own package and by subclasses.

```java
// filepath: c:\Users\HP\Desktop\Learning oop in java\Packages_and_Access_modifires\Example.java
package com.example;

public class ProtectedClass {
    protected void display() {
        System.out.println("Protected method");
    }
}

// filepath: c:\Users\HP\Desktop\Learning oop in java\Packages_and_Access_modifires\SubClass.java
package com.example;

public class SubClass extends ProtectedClass {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display(); // Accessible
    }
}
```

### Default (Package-Private) Access Modifier

A member with default access can be accessed only within its own package.

```java
// filepath: c:\Users\HP\Desktop\Learning oop in java\Packages_and_Access_modifires\Example.java
package com.example;

class DefaultClass {
    void display() {
        System.out.println("Default method");
    }
}

// filepath: c:\Users\HP\Desktop\Learning oop in java\Packages_and_Access_modifires\Test.java
package com.example;

public class Test {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        obj.display(); // Accessible
    }
}
```

### Private Access Modifier

A member with `private` access can be accessed only within its own class.

```java
// filepath: c:\Users\HP\Desktop\Learning oop in java\Packages_and_Access_modifires\Example.java
package com.example;

public class PrivateClass {
    private void display() {
        System.out.println("Private method");
    }

    public static void main(String[] args) {
        PrivateClass obj = new PrivateClass();
        obj.display(); // Accessible
    }
}
```

## Summary

- **Public**: Accessible from any other class.
- **Protected**: Accessible within its own package and by subclasses.
- **Default (Package-Private)**: Accessible only within its own package.
- **Private**: Accessible only within its own class.

Access modifiers are essential for encapsulation in Java, allowing you to control the visibility and accessibility of your classes and members.