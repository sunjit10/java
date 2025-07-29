# Java Threads

This directory contains examples demonstrating various aspects of Java threading and concurrency. These examples showcase how to create and manage threads, handle synchronization issues, and use thread pools.

## Overview

Multithreading in Java allows applications to perform multiple tasks concurrently, improving efficiency and responsiveness. This package provides examples of:

- Basic thread creation and execution
- Thread synchronization and race conditions
- Thread pools using the Executor framework
- Lambda expressions with Runnable interface

## Classes in this Package

### 1. RunnableUsingLambda.java

Demonstrates creating threads using lambda expressions:
- Shows how to implement the Runnable interface using lambda syntax
- Creates and starts multiple threads
- Illustrates thread naming and identification
- Demonstrates the effect of thread joining on execution flow

### 2. IncrementingWithUnexpectedOutput.java

Demonstrates a classic race condition problem:
- Shows what happens when multiple threads access and modify a shared variable without synchronization
- Illustrates how concurrent access can lead to unpredictable results
- The final value is always less than expected due to lost updates

### 3. IncrementingWithExpectedOutput.java

Demonstrates solving the race condition using synchronization:
- Uses the synchronized keyword with an object lock
- Shows how proper synchronization ensures thread safety
- Guarantees the correct final value when multiple threads increment a shared counter

### 4. ExecutorsThreadPoolDemo.java

Demonstrates the use of thread pools with the Executor framework:
- Shows how to create a scheduled thread pool
- Illustrates scheduling tasks to run at fixed intervals
- Demonstrates a more modern approach to concurrency than raw threads

## Key Concepts Demonstrated

1. **Thread Creation**: Different ways to create and start threads in Java
2. **Thread Safety**: Identifying and solving race conditions with synchronization
3. **Concurrency Issues**: Understanding common problems in multithreaded applications
4. **Thread Pools**: Using the Executor framework for efficient thread management
5. **Lambda Expressions**: Modern syntax for implementing the Runnable interface

## Best Practices

- Always synchronize access to shared mutable state
- Consider using higher-level concurrency utilities instead of raw threads
- Be aware of potential deadlocks when using multiple locks
- Use thread pools to limit resource consumption and improve performance
- Prefer concurrent collections over synchronized collections when appropriate

## Usage

Each Java file contains a `main` method that demonstrates the concepts. Run any of the classes to see the threading behavior in action.

```bash
# To compile and run an example
javac threads/RunnableUsingLambda.java
java threads.RunnableUsingLambda

// Made with Bob
