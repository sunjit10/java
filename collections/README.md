# Java Collections Framework Examples

This directory contains examples demonstrating the usage of the Java Collections Framework. The examples are organized into subdirectories based on collection types.

## Directory Structure

- **lists**: Examples of List implementations (ArrayList, LinkedList)
- **maps**: Examples of Map implementations (HashMap, LinkedHashMap, TreeMap)
- **sets**: Examples of Set implementations
  - **hashset**: HashSet examples
  - **linkedhashset**: LinkedHashSet examples
  - **treeset**: TreeSet examples

## Lists

The `lists` directory contains examples demonstrating:

- Basic list operations (add, remove, iterate)
- Different ways to iterate through lists
- Performance comparison between ArrayList and LinkedList
- Immutable vs mutable lists
- List sorting with Comparable and Comparator
- Creating lists from other lists
- Working with unmodifiable lists

## Maps

The `maps` directory contains examples demonstrating:

- Basic HashMap operations
- Map initialization techniques
- Different ways to iterate through maps
- Comparison between LinkedHashMap and TreeMap
- Using custom objects as keys in maps
- Map manipulation and transformation

## Sets

The `sets` directory contains examples demonstrating:

- **HashSet**:
  - Basic operations (add, remove, contains)
  - Handling duplicates (HashSet doesn't allow duplicates)
  - Storing custom objects in HashSets
  - Set operations (union, intersection)

- **LinkedHashSet**:
  - Maintaining insertion order unlike HashSet

- **TreeSet**:
  - Sorted set implementation
  - Natural ordering and custom comparators

## Key Concepts Demonstrated

1. **Collection Types**: Different collection types and their specific use cases
2. **Performance**: Performance characteristics of different implementations
3. **Iteration**: Various ways to iterate through collections
4. **Sorting**: Sorting collections using Comparable and Comparator
5. **Immutability**: Creating immutable collections
6. **Custom Objects**: Using custom objects in collections with proper equals() and hashCode() implementations

## Usage

Each Java file contains standalone examples that can be compiled and run independently. Most examples include comments explaining the key concepts being demonstrated.

```bash
# To compile and run an example
javac collections/lists/ListOfNumbers.java
java collections.lists.ListOfNumbers
