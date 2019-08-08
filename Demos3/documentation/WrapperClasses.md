# Wrapper Classes

Java provides wrapper classes for primitive data types, to convert them into objects. This is essential for handling primitive data in collections.

Some wrappers are listed below:-

1. **int** - Integer
2. **char** - Character
3. **double** - Double
4. **float** - Float
5. **boolean** - Boolean

The process of turning a primitive data into an object is called boxing.

```Java
int i = 10;
Integer n = new Integer(i);
```

The reverse process is called unboxing.

```Java
int i = n.intValue();
```

Java 1.5 onwards, autoboxing has been implemented.

```Java
Integer n3 = 20;
int j = n3;
```
