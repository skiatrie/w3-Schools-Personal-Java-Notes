**Modifiers**, control the access level for classes, attributes, methods, constructors.

**Access** Modifiers - control access level

**Non-Access** Modifiers - do not control, but other functionality

## Access Modifiers
public - accessible by any other class
*default* - only accessible by classes in same package, used when no modifier specified

### For attributes / methods / constructors

public - accessible for  all classes

private - only accessible within declared class

default - only accessible within the same package

protected - accessible within same package, and **subclasses**

---

### Example
```java
public class Person {
    public String name = "Jade";
    private int age = 20;

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name); // Prints object person name
        System.out.println(p.age); // Error: int age is private access in Person
    }
}
```

# Non-Access Modifiers

Do not control visibility, but add other features to classes, methods, and attributes

---

## Final

Prevent ability to override existing attribute values, declare as `final`
`final int age` = 20

---

## Static 

Static method belongs to class, not to any object. Can call it without creating an object of class

```java
public class Main {
    static void myStaticMethod() {
        System.out.println("Calling method without object.");
    }
    public static void main(String[] args) {
        myStaticMethod(); // Simply call method ();
        Main.myStaticMethod(); // Call using the class NAME
    }
}
```
- static method cannot use variables or methods that belong to an object

---

## Abstract

Abstract method belongs to an `abstract` class: it does not have a body. The body is in the **subclass**

```java
// abstact class
abstract class Main {
    public String fname = "Jade";
    public int age = 20;
    public **abstract** void study(); // abstract method
}

// Subclass - inherits main
class Student extends Main {
    public int gradYear = 2027;
    public void study() { // abstract method body here
        System.out.println("Study every day.");
    }
}
```
Second file
```java
class Second {
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println("Student name: " + myObj.fname);
        System.out.println("Student age: " + myObj.age);
        System.out.println("Graduation year: " + myObj.gradyear);
        myObj.study(); // CALL abstract method
    }
}
```

---

## Use Cases

For **classes**,

    `final` - cannot be inherited by other classes
    `abstract` - cannot be used to create objects (to access, must be inherited from another class)



For **attributes / methods**,

    `final`  attributes/methods cannot be overriden/modified
    `static`  attributes/methods belong to the class, not to objects. Methods can be called w/o creating objs.
    `abstract` can only be used in an abstract class, and used on methods. Methods dont have a body. The body is inherited from subclass.

    `transient`  attributes/methods are skipped when **serializing** obj containing them
    `synchronized` methods can only be accessed by 1 thread at a time

    `volatile` - the value of attribute not cached thread-locally, always read from "main memory"


