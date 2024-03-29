# Design Principles & Patterns

> Before exploring the different design patterns we'll focus on some key design principles that we'll try to use will learning these patterns.

## Design Principles

Moodle
: A well-known online learning platform

Encapsulate what varies
:    Identify the aspects of your application that vary and separate them from what stays the same.
  
- **Program to an interface, not an Implementation:**

  Program to an interface, not an implementation. Depend on abstractions, not on concrete classes.
  
- **Favor Composition Over Inheritance:**

  Classes should prefer code reuse and polymorphic behavior over inheriting from a parent or base class.

- **SOLID Principles:**
  - **Single Responsibility Principle:**

    A class should have just one reason to change.
  - **Open/Close Principle:**

    Classes should be _Open_ to extension but _Closed_ for modification
  - **Liskov Substitution Principle:**

    When extending a class, you should be able to pass objects of the subclass in place of objects of the parent class without breaking the client code.
  - **Interface Segregation Principle:**

    Clients shouldn't be forced to depend on methods they do not use.
  - **Dependency Inversion Principle:**
  
    High-level classes shouldn't depend on low level classes. Both should depend on abstractions. Abstractions shouldn't depend on details. Details should depend on abstractions.

<br>

## Design Patterns

> We'll be exploring the different GoF patterns.

### Creational
Creational patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

### Structural
Structural patterns are concerned with how classes and objects are composed to form larger structures, while keeping this structures flexible and efficient.

### Behavioral 
Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects.

#### Strategy Pattern 

##### Example 
<img src="./.images/strategy.png">
