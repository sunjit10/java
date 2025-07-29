package basics.core.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates how to implement and use the Comparable interface for sorting objects
 * based on multiple fields in a specific priority order.
 * 
 * This example shows sorting Person objects by name (primary) and age (secondary)
 * as defined in the Person class's compareTo method.
 * 
 * Expected output:
 * Bob : 20
 * Charles : 30
 * Mike : 40
 * Mike : 50
 */
public class ComparableMultiFields {
    
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Mike", 50));
        persons.add(new Person("Bob", 20));
        persons.add(new Person("Mike", 40));
        persons.add(new Person("Charles", 30));
        
        // Display unsorted list
        System.out.println("Unsorted list:");
        persons.forEach(System.out::println);
        
        // Sort the list using the natural ordering defined by Person's compareTo method
        Collections.sort(persons);
        
        // Display sorted list
        System.out.println("\nSorted list (by name, then by age):");
        persons.forEach(System.out::println);
    }
}
