# Java Exceptions

This directory contains examples demonstrating various aspects of Java exception handling.

## Files Overview

### 1. Thermostat.java & ThermostatApp.java
Demonstrates the difference between checked and unchecked exceptions:
- `Thermostat` class provides two methods:
  - `setVehicleTemp()` throws a checked exception (`Exception`)
  - `setMachineTemp()` throws an unchecked exception (`RuntimeException`)
- `ThermostatApp` shows how to handle both types of exceptions:
  - Checked exceptions must be explicitly caught or declared
  - Unchecked exceptions don't require explicit handling

### 2. TestOnlyFinally.java
Shows the behavior of `finally` blocks in exception handling:
- Demonstrates a try-finally block without a catch clause
- Shows that `finally` blocks always execute, even when exceptions occur
- Illustrates proper resource cleanup in finally blocks
- Includes comments about modern try-with-resources approach

### 3. UncheckedDemo.java
Illustrates handling of unchecked exceptions:
- Demonstrates two approaches to dealing with `NumberFormatException`
- Shows proper handling of unchecked exceptions with try-catch blocks
- Demonstrates what happens when unchecked exceptions are not handled
- Uses interactive console input to trigger exceptions

## Key Concepts Covered

1. **Checked vs. Unchecked Exceptions**
   - Checked exceptions (subclasses of `Exception`) must be declared in method signatures or handled with try-catch
   - Unchecked exceptions (subclasses of `RuntimeException`) don't require explicit handling

2. **Exception Handling Patterns**
   - Basic try-catch blocks
   - Try-finally without catch (when exceptions are propagated)
   - Resource cleanup in finally blocks

3. **Resource Management**
   - Proper closing of resources in finally blocks
   - Comments about modern try-with-resources approach

4. **Interactive Exception Handling**
   - User input validation
   - Providing second chances after exceptions

## Running the Examples

Each example can be run independently:

```bash
# Run the Thermostat example
javac basics/exceptions/Thermostat.java basics/exceptions/ThermostatApp.java
java basics.exceptions.ThermostatApp

# Run the finally block example
javac basics/exceptions/TestOnlyFinally.java
java basics.exceptions.TestOnlyFinally

# Run the unchecked exception example
javac basics/exceptions/UncheckedDemo.java
java basics.exceptions.UncheckedDemo
```

Note: The `TestOnlyFinally.java` example expects a file at "java8/input.txt" which may need to be created or the path adjusted.
