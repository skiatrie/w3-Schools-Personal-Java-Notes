# Type Casting

converting from one data type to another

**Widening Casting** - convert from smaller to larger type size
**Narrowing Casting** - convert from larger type to smaller  type size

## Widening Casting

- done automatically when passing small size to large size type
- no risk losing info (int safely fits into double)

```java
int myInt = 9;
double myDouble = myInt; // auto cast
System.out.println(myDouble); // prints 9.0
```

## Narrowing Casting

- done *manually* by placing type in parenthesis in front of value
- required becasue narrowing may result in data loss

```java
double myDouble = 9.78d;
int myInt = (int) myDouble; // manual cast
System.out.println(myInt); // prints 9
```

---

# int to String

use integer classes (ex.) : toString(), String.valueOf(), String.format()
StringBuilder / StringBuffer : appending int values as strings

Methods
1. toString() of Integer class
2. valueOf() of String class
3. Integer(int).toString() of Integer class
4. concatenation w/ empty string


### toString()
static method that returns String obj representing int parameter. 
Argument is converted and returned as string instance

```java
String str1 = Integer.toString(a);
```

### valueOf()

convert Integer to String
```java
String str3 = String.valueof(c);
```

### Integer(int).toString()d

- use an instance of the Integer class to invoke its toString method
- if variable is prim type int, use toString() or valueOf()
- if instance of Integer (wrapper class of int), invoke its toString() method 

```java
int d = 1;
String str1 = new Integer(d).toString();
```
