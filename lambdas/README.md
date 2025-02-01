# Lambda Trail

## Imperative vs Declarative Programming

Imperative focusses on the "How" where as Declarative focusses on the "What"

Imperative is not thread safe, very verbose and not customizable.

- [Example 1](./ImperativevsDeclarative1.java)
- [Example 2](./ImperativevsDeclarative2.java)

## Functional Interface

Any Interface that has `exactly ONE` public method is a Functional Interface

Other name for Functional Interface is `SAM`

SAM = Single Abstract 

```
@FunctionalInterface
public interface Runnable {
  public abstract void run();
}
```

- [MyFuncInterface](./funcinterface/basics/MyFuncInterface.java)
- [MyFuncInterfaceImpl](./funcinterface/basics/MyFuncInterfaceImpl.java) 

## Lambda Basics

- Lambda is equivalent to a function without a name
- Lambda's are also referred to as `Anonymous` functions.
- Lamdba can be `assigned to a variable` and passed around
- Just like other functions, Lambda's also have method parameters, body and return type

### Lambda Syntax

```()  ->  { }```

Here:
- () are the input parameters
- -> Arrow
- { } is the Lambda Body

[Runnable - Old Way vs Using Lambda](./funcinterface/basics/TraditionalRunnable.java)

[Comparator - Old Way vs Using Lambda](./funcinterface/basics/TraditionalComparator.java)

### Functional Interfaces introduced in Java 8

- Consumer:  `void accept(T t)`
  - [Basics](./consumer/ConsumerBasicsStringUpper.java)
  - BiConsumer
- Predicate
  - BiPredicate
- Function 
  - BiFunction
  - UnaryOperator
  - BinaryOperator
- Supplier