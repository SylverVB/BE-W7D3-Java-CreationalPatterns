# Factory Design Pattern

## Overview

Factory is a design pattern which creates objects in which the precise type may not be known until runtime. There are several reasons to use the factory pattern:

- **If you don't know the exact types needed before running the code.**
- **If you want to hide the creational logic, which prevents end users from creating things that they shouldn't.**
- **If you need an easy way to extend internal components.**
- **Depending on implementation, the factory pattern can be used to reuse objects, instead of making new ones, which saves space.**

### Benefits of the Factory Pattern

- **Single Responsibility**: By putting all of the construction code in a single function.
- **Open/Closed Principle**: New subclasses can be implemented and added without negatively affecting the already written classes.
- **Abstraction**: Abstracts the actual creation of the objects away from the user.

---

## Real-World Applications

The Factory design pattern offers flexibility, encapsulation, and separation of concerns within an application, making it widely applicable. Some examples include:

1. **Object Creation with Complex Initialization**:
   When an object requires complex initialization or configuration, the factory encapsulates the creation logic and provides a clean interface for creating objects.

2. **Dependency Injection**:
   In dependency injection frameworks, factories manage instances of classes with complex dependencies. They handle dependency resolution and provide appropriate instances.

3. **Database Access**:
   Factories create database connections or data access objects based on configuration or criteria.

4. **Logging**:
   Logging frameworks often use factories to create logger objects. Factories determine the appropriate logger implementation based on configuration.

5. **GUI Component Creation**:
   Factories generate GUI components like buttons, panels, or dialogs based on user preferences or application settings.

> Note: This is not an exhaustive list, but it demonstrates the versatility of the Factory design pattern.

---

## Implementation

### Steps to Create a Factory

1. **Create the abstract data type**.
2. **Create several classes that inherit the abstract data type**:
   These are the objects whose instantiation details may not be known until runtime.
3. **Set up a static method**:
   Its return type should be the abstract data type, and it will return the concrete instance.

### Example Code

```java
// Abstract Data Type
public interface Dessert {}

// Classes that inherit the abstract data type
public class Cake implements Dessert {}
public class Cookie implements Dessert {}
public class IceCream implements Dessert {}

// Good practice to throw an exception if the desired concrete instance is not found
public class DessertNotFoundException extends RuntimeException {}

// Factory class that returns the concrete instance
public class DessertFactory {
    public static Dessert getDessert(String dessertType) {
        switch(dessertType) {
            case "cake":
                return new Cake();
            case "cookie":
                return new Cookie();
            case "ice cream":
                return new IceCream();
            default:
                throw new DessertNotFoundException(dessertType + " not found!");
        }
    }
}

// Demo class
public class Demo {
    public static void main(String[] args) {
        Dessert d1 = DessertFactory.getDessert("cake");
        Dessert d2 = DessertFactory.getDessert("cookie");
        Dessert d3 = DessertFactory.getDessert("ice cream");
        Dessert d4 = DessertFactory.getDessert("candy"); // Throws DessertNotFoundException
    }
}
```

---

## Summary

- The Factory pattern creates objects with unknown types until runtime, providing flexibility.
- Reasons to use the factory pattern include:
  - Handling unknown types.
  - Hiding creational logic.
  - Enabling easy extension.
  - Reusing objects.
- Benefits include:
  - Adherence to single responsibility and open/closed principles.
  - Abstracting object creation from the user.
  - Encapsulation of object creation.
- Use cases include:
  - Dependency injection frameworks.
  - Database access.
  - Logging frameworks.
  - GUI component creation in graphical user interface development.