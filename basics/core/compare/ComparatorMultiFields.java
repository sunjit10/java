package basics.core.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates different ways to use Comparators for sorting Person objects.
 * Shows sorting by name, reverse name sorting, and reverse age sorting.
 * 
 * Sample data:
 * Input:  Mike 50, Bob 20, Mike 40, Charles 30
 * Expected output after various sorts is shown in the program.
 */
public class ComparatorMultiFields {
    
    /**
     * Main method that demonstrates different sorting approaches using Comparators.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create and populate a list of Person objects
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Mike", 50));
        persons.add(new Person("Bob", 20));
        persons.add(new Person("Mike", 40));
        persons.add(new Person("Charles", 30));

        // Sort by name only using a dedicated Comparator class
        System.out.println("\nOnly Sorted with Name, ignoring Age");
        Collections.sort(persons, new OnlySortNameComparator());
        persons.forEach(System.out::println);

        // Sort by name in reverse order using a dedicated Comparator class
        System.out.println("\nNow showing with Reverse Name Sort");
        Collections.sort(persons, new PersonReverseComparator());
        persons.forEach(System.out::println);

        // Sort by age in reverse order using an anonymous Comparator
        System.out.println("\nReverse sort based on only Age");
        persons.sort((p1, p2) -> -1 * Integer.compare(p1.getAge(), p2.getAge()));
        persons.forEach(System.out::println);
        
        // Alternative ways to sort (examples of modern Java syntax)
        System.out.println("\nAlternative ways to sort:");
        
        // Using Comparator.comparing with method reference
        System.out.println("Sort by name using Comparator.comparing:");
        persons.sort(Comparator.comparing(Person::getName));
        persons.forEach(System.out::println);
        
        // Using Comparator.comparing with reversed()
        System.out.println("\nSort by age in descending order:");
        persons.sort(Comparator.comparing(Person::getAge).reversed());
        persons.forEach(System.out::println);
        
        // Using thenComparing for multi-field sorting
        System.out.println("\nSort by name, then by age:");
        persons.sort(Comparator.comparing(Person::getName)
                              .thenComparing(Person::getAge));
        persons.forEach(System.out::println);
    }
}

/**
 * Comparator that sorts Person objects by name only.
 */
class OnlySortNameComparator implements Comparator<Person> {
    /**
     * Compares two Person objects by name.
     * 
     * @param p1 the first Person to compare
     * @param p2 the second Person to compare
     * @return a negative integer, zero, or a positive integer as the first Person's name
     *         is less than, equal to, or greater than the second Person's name
     */
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

/**
 * Comparator that sorts Person objects by name in reverse order.
 */
class PersonReverseComparator implements Comparator<Person> {
    /**
     * Compares two Person objects by name in reverse order.
     * 
     * @param p1 the first Person to compare
     * @param p2 the second Person to compare
     * @return a negative integer, zero, or a positive integer as the first Person's name
     *         is greater than, equal to, or less than the second Person's name
     */
    @Override
    public int compare(Person p1, Person p2) {
        return -1 * p1.getName().compareTo(p2.getName());
    }
}
