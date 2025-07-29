# Java Inner Classes

This package demonstrates various types of inner classes in Java and related concepts.

## Overview

Inner classes are classes defined within other classes or methods. Java supports several types of inner classes, each with its own characteristics and use cases. This package provides examples of:

- Regular (non-static) inner classes
- Static inner classes
- Local inner classes (defined within methods)
- Anonymous inner classes
- Effectively final variables with inner classes

## Classes in this Package

### 1. InnerClassDemo.java

Demonstrates regular (non-static) inner classes:
- Inner classes have access to all members of the enclosing class, including private members
- Inner class instances are associated with an instance of the outer class
- Shows different ways to instantiate inner classes

### 2. StaticInnerClassDemo.java

Demonstrates static inner classes:
- Static inner classes don't need an instance of the outer class to be instantiated
- They cannot directly access non-static members of the outer class
- Useful when the inner class doesn't need access to instance-specific data

### 3. ClassWithinMethod.java

Demonstrates local inner classes (defined within methods):
- Classes defined inside method bodies
- Can access the enclosing class's instance variables
- Shows how to reference the enclosing class's members explicitly and implicitly

### 4. EffectivelyFinalDemo.java

Demonstrates the concept of effectively final variables:
- A variable is "effectively final" when it's not explicitly declared as final, but its value is never changed after initialization
- Local variables referenced from inner classes must be final or effectively final
- Shows the restrictions on modifying effectively final variables

### 5. AnonymousDemo.java

Demonstrates anonymous inner classes:
- Classes defined without a name, typically implementing an interface or extending a class
- Created and instantiated in a single expression
- Compares anonymous classes with lambda expressions (Java 8+)

## Key Concepts

1. **Inner Class Access**: Inner classes can access all members of the enclosing class, including private members.

2. **Instance Association**: Non-static inner classes are associated with an instance of the outer class.

3. **Static Inner Classes**: Don't require an outer class instance but cannot access non-static members of the outer class.

4. **Local Inner Classes**: Defined within methods and can access effectively final local variables.

5. **Effectively Final**: Variables that are not explicitly declared as final but are never modified after initialization.

6. **Anonymous Classes**: Unnamed classes defined and instantiated in a single expression, often used for one-time implementations.

## Usage

Each class in this package contains a `main` method that demonstrates the concepts. Run any of the classes to see the inner class behavior in action.

// Made with Bob
