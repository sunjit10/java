# Java Generics

This directory contains examples demonstrating various aspects of Java generics. Generics enable you to create classes, interfaces, and methods that operate with types as parameters, providing type safety at compile time.

## Core Concepts

### Basic Generic Classes

- **[Pair.java](Pair.java)**: A generic class with two type parameters (`T` and `S`), demonstrating how to create a class that can hold two values of potentially different types.
- **[PairDemo.java](PairDemo.java)**: Shows how to use the `Pair` class with concrete types (`String` and `Integer`).

### Generic Arrays

- **[GenericsArray.java](GenericsArray.java)**: Demonstrates creating a generic array wrapper class. Shows the challenges with generic arrays in Java and how to work around them using type casting.

## Subdirectories

### basics

Contains examples showing fundamental generic concepts:

- **[AnimalWrapperDemo.java](basics/AnimalWrapperDemo.java)**: A simple generic wrapper class that can hold any type of object. Demonstrates how generics work with inheritance.
- **Animal Hierarchy**: A class hierarchy (`Creature` → `Mammal` → `Cat`) used to demonstrate generics with inheritance relationships.

### bounds

Demonstrates type bounds in generics:

- **[BoundsDemo.java](bounds/BoundsDemo.java)**: Shows how to use bounded wildcards (`? extends Mammal`) to restrict which types can be used with a generic method. Demonstrates the concept of upper bounds in generics.

### methods

Shows how to create generic methods:

- **[SearchInGenericList.java](methods/SearchInGenericList.java)**: Demonstrates creating a generic method that can work with lists of any type.

## Key Generics Concepts Illustrated

1. **Type Parameters**: Using letters like `T`, `E`, `S` to represent generic types
2. **Multiple Type Parameters**: As shown in `Pair<T,S>`
3. **Generic Methods**: Methods that introduce their own type parameters
4. **Type Bounds**: Restricting generic types using extends keyword
5. **Wildcards**: Using `?` with bounds to create flexible APIs
6. **Type Erasure**: Understanding that generic type information is removed at runtime

## Common Use Cases

- Creating type-safe collections
- Building reusable data structures
- Implementing algorithms that work with multiple types
- Ensuring compile-time type safety

## Best Practices

- Use meaningful type parameter names when possible
- Favor bounded wildcards for API flexibility
- Be aware of type erasure limitations
- Use generic methods when only a single method needs to be generic
