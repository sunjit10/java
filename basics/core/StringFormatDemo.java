package basics.core;

/**
 * Demonstrates the usage of String.format() method in Java.
 * String.format() allows for formatted string creation using format specifiers.
 * Common format specifiers include:
 * %s - String
 * %d - Integer
 * %f - Float/Double
 * %n - Platform-specific line separator
 */
public class StringFormatDemo {

    // Constants for format strings
    final static String CAT_FORMAT_STR1 = "Count of cats: %d\n";
    final static String CAT_FORMAT_STR2 = "There are %d cats";
    
    /**
     * Main method that serves as the entry point for the application.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        stringFormat();
        
        // Adding more examples of String formatting
        demonstrateMoreFormattingOptions();
    }

    /**
     * Demonstrates basic String formatting with integer values.
     * Uses predefined format strings to create formatted output.
     */
    private static void stringFormat() {
        // Format a string with an integer value and a newline character
        String catCount = String.format(CAT_FORMAT_STR1, 3);
        System.out.println(catCount);

        // Format a string with just an integer value
        String catCount2 = String.format(CAT_FORMAT_STR2, 3);
        System.out.println(catCount2);
    }
    
    /**
     * Demonstrates additional String formatting options with various data types.
     * Shows formatting for different numeric types, precision control,
     * padding, and alignment.
     */
    private static void demonstrateMoreFormattingOptions() {
        System.out.println("\n--- More Formatting Examples ---");
        
        // String formatting
        System.out.println(String.format("Hello, %s!", "Java"));
        
        // Multiple arguments
        System.out.println(String.format("Name: %s, Age: %d", "Alice", 30));
        
        // Decimal formatting with precision
        System.out.println(String.format("Pi: %.2f", Math.PI));  // 2 decimal places
        
        // Width and padding
        System.out.println(String.format("Number: [%5d]", 42));    // Right-aligned, width 5
        System.out.println(String.format("Number: [%-5d]", 42));   // Left-aligned, width 5
        System.out.println(String.format("Number: [%05d]", 42));   // Zero-padded, width 5
        
        // Formatting different number types
        System.out.println(String.format("Decimal: %d, Hex: %x, Octal: %o", 255, 255, 255));
        
        // Formatting with argument index
        System.out.println(String.format("%2$s, %1$s!", "World", "Hello"));
    }
}
