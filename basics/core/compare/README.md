# Java Comparison Examples

This directory contains examples demonstrating Java's comparison mechanisms using the `Comparable` interface and `Comparator` interface.

## Overview

Java provides two primary mechanisms for comparing objects:

1. **Comparable Interface**: For implementing natural ordering within a class
2. **Comparator Interface**: For implementing custom ordering strategies outside a class

## Files in this Directory

### Person.java

A model class representing a person with name and age properties. This class:
- Implements `Comparable<Person>` interface
- Defines natural ordering based on name (primary) and age (secondary)
- Properly implements `equals()` and `hashCode()` methods
- Provides getters and a meaningful `toString()` method

### ComparableBasics.java

Demonstrates the basic usage of Java's built-in `Comparable` interface through String comparison:
- Shows how `compareTo()` method works with String objects
- Explains the meaning of negative, zero, and positive return values
- Uses interactive input to compare two strings

### ComparableMultiFields.java

Shows how to implement and use the `Comparable` interface for custom objects:
- Demonstrates sorting `Person` objects using their natural ordering
- Illustrates multi-field comparison (by name first, then by age)
- Uses `Collections.sort()` with objects that implement `Comparable`

### ComparatorMultiFields.java

Demonstrates various ways to use the `Comparator` interface for flexible sorting:
- Creating dedicated `Comparator` classes for specific sorting needs
- Using anonymous comparators with lambda expressions
- Using modern Java syntax with `Comparator.comparing()`, `reversed()`, and `thenComparing()`
- Shows different sorting strategies:
  - By name only
  - By name in reverse order
  - By age in reverse order
  - Multi-field sorting

## Key Concepts

- **Natural Ordering**: The inherent order defined by a class implementing `Comparable`
- **Custom Ordering**: External ordering strategies defined by `Comparator` implementations
- **Multi-field Comparison**: Sorting objects based on multiple properties in a specific priority
- **Method References**: Modern Java syntax for creating comparators (`Person::getName`)
- **Comparator Chaining**: Combining multiple comparators for complex sorting logic

## Usage

Each example can be run independently to demonstrate different aspects of Java's comparison mechanisms.
