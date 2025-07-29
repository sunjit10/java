package basics.core.compare;

import java.util.Scanner;

/**
 * Demonstrates the built-in Comparable interface and its compareTo method.
 * The compareTo method returns:
 * - A negative value if the current object is "less than" the compared object
 * - Zero if both objects are equal
 * - A positive value if the current object is "greater than" the compared object
 * 
 * This example shows string comparison using the compareTo method.
 */
public class ComparableBasics {
    
    /**
     * Main method that demonstrates string comparison using compareTo.
     * Takes two strings as input from the user and compares them.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create scanner for user input
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt for and read first string
            System.out.println("Enter String 1:");
            String str1 = scanner.nextLine();
            
            // Prompt for and read second string
            System.out.println("Enter String 2:");
            String str2 = scanner.nextLine();
            
            // Compare str1 to str2
            int comparison1 = str1.compareTo(str2);
            System.out.println(str1 + " compared to " + str2 + ": " + comparison1);
            explainComparison(comparison1);
            
            // Compare str2 to str1
            System.out.println("\n" + str2 + " compared to " + str1 + ": ");
            int comparison2 = str2.compareTo(str1);
            System.out.println(comparison2);
            explainComparison(comparison2);
        }
    }
    
    /**
     * Helper method to explain the meaning of a comparison result.
     * 
     * @param comparisonResult the result from a compareTo operation
     */
    private static void explainComparison(int comparisonResult) {
        if (comparisonResult < 0) {
            System.out.println("(First string comes before second string lexicographically)");
        } else if (comparisonResult > 0) {
            System.out.println("(First string comes after second string lexicographically)");
        } else {
            System.out.println("(Both strings are lexicographically equal)");
        }
    }
}
