package basics.core.staticstuff;

/**
 * TestStaticBlock demonstrates the use of static initialization blocks in Java.
 * This class shows how static blocks are executed during class loading,
 * even before any constructors or methods are called.
 * 
 * Key concepts demonstrated:
 * - Static initialization blocks
 * - Static variable initialization
 * - Order of execution in Java classes
 */
public class TestStaticBlock {
    // Static variables - shared across all instances of this class
    static int NUM_CONTINENTS;
    static String OUR_PLANET;

    /**
     * Static initialization block - executes when the class is loaded,
     * before any constructors or methods are called.
     * This is useful for initializing static variables that require
     * more complex initialization than can be done in a single line.
     */
    static {
        // Note: Cannot declare new variables inside static block with static keyword
        // int NUM_CONTINENTS = 7; // This would create a local variable, not initialize the static field
        
        // Initialize the static variables
        NUM_CONTINENTS = 7;
        OUR_PLANET = "Earth";
    }
    
    /**
     * Main method that serves as the entry point for the application.
     * 
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Format and display a message using the static variables
        String msg = String.format("There are %d Continents in our Planet %s", 
                                  getNumContinents(), OUR_PLANET);
        System.out.println(msg);
    }
    
    /**
     * Returns the number of continents.
     * This method demonstrates accessing a static variable from a static method.
     * 
     * @return The number of continents
     */
    public static int getNumContinents() {
        return NUM_CONTINENTS;
    }
}

// Made with Bob
