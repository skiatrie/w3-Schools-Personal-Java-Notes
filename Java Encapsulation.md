Manipulating private class variables using get/set methods

1. **get** - returns value
2. **set** - sets the value

## Syntax 

- getName
- setName
- get/set method followed by variable name with **UPPERCASE** first letter.

### Examples

```java
public class Person {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("Jade");
        System.out.println(myObj.getName());
    }
}
```

### Encapsulation Pros

- control of class variables and methods
- read-only if using get method
- write-only if using set method
- change parts of code without changing others
- increased security of data
