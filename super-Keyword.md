# Java super

`super` is used to refer to the **parent class** of a subclass
- removes confusion between subclass & superclass **methods** with the same names

Use cases
- access attributes/methods from parent class
- call parent class constructor

## Access Parent Methods

if subclass has method w/ **same name** as one in parent class, use `super` to call the parent version

```java
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void animalSound() {
        super.animalSound();
        System.out.println("The dog says ruff.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();
    }
}
```

### My Summary: 

In class animal, a method called animal sound, prints out the line, "The animal makes a sound."
Class Dog, which extends class Animal, meaning it inherits the attributes and methods of class Animal, also includes the method animalSound(). To refer to the method of the parent class, we write "**super**.animalSound();" within the class Dog animalSound() method. Within this Dog animalSound() method, we also include a new String, "The dog says ruff."

In the Main class, within the main method, we create a new Dog object and append it with the method call animalSound();. This will take our Dog object, and use the animal sound methods with it.


## Call Parent Constructor

`super()` is used to call **constructor** of parent class
- useful for reusing initialization code
- `super()` must be the **first statement** within the subclass constructor
  
```java
class Animal {
    Animal() {
        System.out.println("Animal is created");
    }
}

class Dog {
    Dog(){
        super(); // Calls parent constructor
        System.out.println("Dog is created");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
    }
}
```