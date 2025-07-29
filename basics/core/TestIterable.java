package basics.core;

import java.util.Arrays;
import java.util.Iterator;

/**
 * A class that implements the Iterable interface to allow iteration over a collection of flowers.
 * This demonstrates how to make a custom class work with Java's enhanced for loop.
 */
class Flowers implements Iterable<String> {
    // Array of flower names
    private final String[] flowers = {"rose", "daffodil", "sunflower", "daisy", "lotus"};
    
    /**
     * Implements the iterator method required by the Iterable interface.
     * This allows the Flowers class to be used in enhanced for loops.
     * 
     * @return an Iterator over the flower names
     */
    @Override
    public Iterator<String> iterator() {
        // Convert the array to a List and return its iterator
        return Arrays.asList(flowers).iterator();
    }
}

/**
 * Main class that demonstrates the use of a custom Iterable implementation.
 */
public class TestIterable {
    /**
     * Main method that creates a Flowers object and iterates through it
     * using the enhanced for loop syntax.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create an instance of our Iterable class
        Flowers someCoolFlowers = new Flowers();
        
        // Use enhanced for loop to iterate through the flowers
        // This works because Flowers implements Iterable<String>
        for (String f : someCoolFlowers) {
            System.out.println(f);
        }
    }
}
