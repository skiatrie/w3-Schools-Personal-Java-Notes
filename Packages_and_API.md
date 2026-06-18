# Java Packages and API

Packages organize likewise classes - like folders organize files in a file directory

[Official Oracle Java API Documentation](https://docs.oracle.com/javase/8/docs/api/)

Categories of Packages
- Built-in (from Java API)
- User-defined

## Built-in Packages

Java API - library of prewritten classes

    contains components for:
        -  managing input
        -  database programming
        etc.

import a single class (methods/attributes) or enitre package (collection of classes)

```java
import package.name.Class; // single class
import package.name.*; // entire package
import java.util.Scanner;
```
- `java.util` is the name of the package, while `Scanner` is the class of the package.
- create objects of the class, and use available methods found in documentation

### Import Package
java.util also contains date and time components, and other utility classes

`import java.util.*;` imports the entire package, including all of the classes within.

---

## User-Defined Packages

Java uses a file system directory to store packages.

keyword `package` creates a new package.

### Creating New Package
```java
package newpack;
class NewPackageClass {
    public static void main(String[] args) {
        System.out.prinln("New package.");
    }
}
```

### Saving New Package 
Save file as NewPackageClass.java, compile class:

`javac NewPackageClass.java`

Compile Package:

`javac -d . NewPackageClass.java`

-d specifies destination where to save class file
keep pckg within same dir, use "." dot sign

- package name should be all lowercase
- a new folder will be created, named "newpack"

### Running New Package

in the compiler, write:

```
java newpack.NewPackageClass

>> Output

New package.
```