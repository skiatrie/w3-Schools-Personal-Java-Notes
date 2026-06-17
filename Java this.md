*this* refers to the current **object** in a method or constructor
- used when class attri. have same name as method/constructor

### Accessing Class Attributes

parameter may hide the class variable, inside similarly named constructor/method
- use *this* keyword to refer to the class variable.
```java
public class Main {
    int x; // class variable/attriute

    public Main(int x) { // constructor with parameter "int x"
        this.x = x; // this reference to class VARIABLE -> equals parameter
    }

    public static void main(String[] args) {
        Main myObj = new Main(5); // object with parameter of 5
        System.out.println("Value of x is " + myObj.x); myObj (.) accesses fields of class main (int x;) while this.x = x; initializes class variable x.
    }
}
```
this.x (the class variable) gets the value of x (the parameter)
without, x=x; would set x equal to itself, leaving int x; (the class variable) uninitialized

----
### Calling Constructor from Another Constructor
use this() to call another constructor in the same class
- provides default values // reuse initialization code -> no repeating!

[Example](./Car.java)