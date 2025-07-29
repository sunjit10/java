package basics.inner;

/**
 * Demonstrates the concept of effectively final variables in Java.
 * A variable is "effectively final" when it's not explicitly declared as final,
 * but its value is never changed after initialization and it's used within an inner class.
 */
public class EffectivelyFinalDemo {
    
    public static void main(String[] args) {
        new EffectivelyFinalDemo().someMethod();
    }
    
    private void someMethod() {
        // This variable is "effectively final" because:
        // 1. It's not explicitly declared as final
        // 2. Its value is never changed after initialization
        // 3. It's referenced from inside an inner class
        String westernCity = "Tuscon";
        
        // Local inner class that uses the effectively final variable
        class Cities {
            Cities() {
                // Cannot change the value of westernCity here
                // Uncommenting the line below would cause a compilation error:
                // westernCity = "Santa Fe";
                
                System.out.println("Western city: " + westernCity);
            }
        }
        
        // Create an instance of the local inner class
        new Cities();
        
        // Cannot change the value of westernCity even outside the inner class
        // Uncommenting the line below would cause a compilation error:
        // westernCity = "Reno";
    }
}
