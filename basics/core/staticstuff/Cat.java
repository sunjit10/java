package basics.core.staticstuff;

/**
 * Cat class demonstrates the use of static and instance variables in Java.
 * This class shows how static variables are shared across all instances,
 * while instance variables are unique to each object.
 * 
 * Key concepts demonstrated:
 * - Static vs instance variables
 * - Static variable access from instance methods
 * - Tracking object count using static variables
 * - Unique ID assignment using static counters
 */
public class Cat {
    
    // Instance variable - unique for each cat
    private String name;
    
    // Static variable - shared across all cat instances
    public static String FOOD = "Cat Food";
    
    // Static counter to track total number of cats created
    private static int numCats = 0;
    
    // Instance variable for unique cat ID
    private int catId = 0;
    
    /**
     * Constructor for creating a new Cat with a given name.
     * Increments the static counter and assigns a unique ID to this cat.
     * 
     * @param name The name of the cat
     */
    public Cat(String name) {
        this.name = name;
        numCats++;
        
        // Assign the current value of the static counter as this cat's ID
        // This works because we're assigning the value of the static variable,
        // not the variable reference itself
        catId = numCats;
    }

    /**
     * Returns the total number of Cat instances created.
     * This is an instance method that returns a static value.
     * 
     * @return The total number of cats
     */
    public int getTotalCats() {
        return numCats;
    }

    /**
     * Returns a string representation of this Cat.
     * 
     * @return A string containing the cat's name and ID
     */
    @Override
    public String toString() {
        return String.format("Cat %s with id %d", name, catId);
    }

    /**
     * Returns the current cat food type.
     * This demonstrates that a non-static method can return a static value.
     * 
     * @return The current cat food type
     */
    public String getCatFood() {
        return FOOD;
    }
    
    /*
     * This commented code demonstrates that a static method cannot access
     * non-static (instance) variables directly, as they belong to specific instances.
     * 
     * public static String getCatName() {
     *     return name; // Compilation error: Cannot make a static reference to non-static field name
     * }
     */
}

// Made with Bob
