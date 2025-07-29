# Java Loops Examples

This package demonstrates various loop constructs in Java, including different variations of `for` loops and `while` loops.

## Overview

Java provides several looping mechanisms to execute a block of code repeatedly:

- `for` loops
- `while` loops
- `do-while` loops

This package contains examples of each type with different implementation patterns.

## For Loops

The `ForLoop.java` class demonstrates three variations of for loops:

1. **Standard for loop with missing condition**: Initialization and increment in the for statement, but no condition specified
   ```java
   for (int i = 0; ; i++) { ... }
   ```

2. **For loop with increment in body**: Initialization in the for statement, but increment inside the loop body
   ```java
   for (int i = 0; ; ) { ... i++; }
   ```

3. **For loop with external initialization**: Initialization outside the for statement
   ```java
   int i = 0;
   for ( ; ; ) { ... i++; }
   ```

All examples use a `break` statement to exit the loop when a condition is met.

## While Loops

The `WhileLoop.java` class demonstrates equivalent implementations using while loops:

1. **While loop with break**: Equivalent to the first for loop example
   ```java
   int i = 0;
   while (true) { ... i++; }
   ```

2. **While loop with increment at end**: Equivalent to the second for loop example
   ```java
   int i = 0;
   while (true) { ... i++; }
   ```

3. **While loop with external initialization**: Equivalent to the third for loop example
   ```java
   int i = 0;
   while (true) { ... i++; }
   ```

4. **Do-while loop**: Executes the loop body at least once before checking the condition
   ```java
   int i = 0;
   do { ... i++; } while (i <= 3);
   ```

5. **Standard while loop**: Uses a condition in the while statement instead of `while(true)` with a break
   ```java
   int i = 0;
   while (i <= 3) { ... i++; }
   ```

## Key Differences

- **For loops** are typically used when the number of iterations is known in advance
- **While loops** are used when the number of iterations depends on a condition that might change during execution
- **Do-while loops** ensure the loop body executes at least once, even if the condition is initially false

## Running the Examples

To run the examples:

```bash
# Compile
javac basics/loops/ForLoop.java
javac basics/loops/WhileLoop.java

# Run
java basics.loops.ForLoop
java basics.loops.WhileLoop
```

Each example will print the value of the loop counter to demonstrate the flow of execution.
