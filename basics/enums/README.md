# Java Enums Examples

This directory contains examples demonstrating the use of enumerations (enums) in Java. Enums are special data types that enable variables to be a set of predefined constants.

## Overview

The examples are organized into two categories:

1. **Fruits** - Basic enum usage with methods and properties
2. **Weather** - Enums with associated data and behavior

## Fruits Examples

### [`Fruit.java`](./fruits/Fruit.java)

Demonstrates:
- Creating an enum with multiple constants (APPLE, BANANA, MANGO)
- Adding properties to enum constants (color, taste)
- Implementing methods in an enum (getColor(), getTaste())
- Overriding toString() for custom string representation

### [`FruitSnackApp.java`](./fruits/FruitSnackApp.java)

Demonstrates:
- Basic enum usage and comparison
- Iterating through all enum values using `values()`
- Accessing enum ordinals with `ordinal()`
- Converting strings to enum constants with `valueOf()`
- Accessing enum properties through getter methods

### [`FruitSwitchDemo.java`](./fruits/FruitSwitchDemo.java)

Demonstrates:
- Using enum constants in switch statements
- Basic switch implementation with enums
- Enhanced switch statements that utilize enum properties

## Weather Examples

### [`Seasons.java`](./weather/Seasons.java)

Demonstrates:
- Creating an enum with four constants (SUMMER, FALL, WINTER, SPRING)
- Adding a property to each constant (seasonalActivity)
- Implementing a getter method for the property
- Overriding toString() for custom string representation

### [`SeasonalApp.java`](./weather/SeasonalApp.java)

Demonstrates:
- Iterating through all values of the Seasons enum
- Displaying information about each season using the toString() method

## Key Concepts Illustrated

1. **Enum Basics**
   - Enum constants are implicitly static and final
   - Enums are type-safe (compile-time checking)
   - Each enum constant is an instance of the enum type

2. **Enum Features**
   - Properties and methods can be added to enums
   - Constructors in enums are implicitly private
   - Built-in methods: values(), valueOf(), name(), ordinal()

3. **Enum Best Practices**
   - Use enums when you have a fixed set of constants
   - Leverage enum properties to associate data with constants
   - Override toString() for better readability

## Usage

Compile and run the examples to see enums in action:

```bash
# Compile
javac -d out java/basics/enums/fruits/*.java java/basics/enums/weather/*.java

# Run Fruit examples
java -cp out basics.enums.fruits.FruitSnackApp
java -cp out basics.enums.fruits.FruitSwitchDemo

# Run Weather examples
java -cp out basics.enums.weather.SeasonalApp
