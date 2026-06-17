**attributes**: variables declared within a class
"The class attributes" -> variables within a class

```java
public class main {
    int x = 1;
    int y = 2;
}
```
- the class attributes are x and y
- AKA "fields"

---

### Accessing attribute

- create obj of class & use to print attribute

```java
public class main {
    int x = 5;

    public static void main (String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
```
---

### Modify attribute
```java
int x;
public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25;
}
```

### Override
```java
int x = 5;
public static void main(String[] args) {
    Main newObj = new Main();
    myObj.x = 10;
}
```
### Final
```java
final int x = 5;
public static void main(String[] args){
    Main myObj = new Main();
    myObj.x = 10; // results in error, cannot assign a value to **final** variable
}
```
final: modifier, used to make variable unchanging

---

### Multiple Objects
```java
public class main {
    int x = 5;
    public static void main(String[] args) {
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        myObj2.x = 25;
        System.out.println("Object 1 is " + myObj1.x + " and object 2 is " + myObj2.x + ".")
    }
}
```

### Multiple Attributes

```java
public class main {
    string first_name = Jade;
    string last_name = Moultrie;
    int age = 20;
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println("Name: " + myObj.first_name + " " + myObj.last_name + "/nAge: " + myObj.age);
    }
}
```
Code Example [file](./Multiple_Attributes.Java)