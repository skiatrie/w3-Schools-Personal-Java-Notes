**Methods** can be used to perform actions (like functions) when it is called

```java
public class Main {
    static void myMethod() {
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        myMethod(); // <- method call
    }
}
```

---
### Access Methods w/ Obj

- create methods, add parameters
- call methods on object inside main
  
```java
public class Main {
    public void fullThrottle() {
        System.out.println("The car is at full throttle!");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max Speed: " + maxSpeed);
    }
    public static void main(String[] args) {
        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
```

1. to use Main class and its methods, create obj of the Main class. **new** keyword
2. combine obj and method by "." and add parameters inside () if needed


    "." is used to access object's attributes and methods

    call method: ();

    class must match filename