# Java Inheritance (Subclass & Superclass)

- inherit attributes and methods from one class to another

Categories

- subclass (child) - inherits from another class
- superclass (parent) - class being inherited from

use the *extends* keyword to inherit from a class

---

### final Keyword

the `final` keyword ->

prevent other classes from inheriting a specified class.

```java

final class Vehicle {
    void someMethod(){
        ...
    }
}

class Car extends Vehicle {
    ...
}
```
- this code will generate an error.