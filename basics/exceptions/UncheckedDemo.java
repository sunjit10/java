package basics.exceptions;

import java.util.Scanner;

/**
 * Demonstrates handling of unchecked exceptions in Java.
 * 
 * This class shows two approaches to dealing with NumberFormatException,
 * which is an unchecked exception that occurs when attempting to parse
 * non-numeric strings to numbers.
 */
public class UncheckedDemo {
    
    /**
     * Main method that demonstrates different approaches to handling unchecked exceptions.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demonstrate handling an unchecked exception with try-catch
        handlingUncheckedException(scanner);
        
        // Demonstrate what happens when an unchecked exception is not handled
        showUncheckedException(scanner);
        
        // Always close resources to prevent resource leaks
        scanner.close();
    }
    
    /**
     * Demonstrates proper handling of NumberFormatException.
     * 
     * This method attempts to parse user input as an integer and provides
     * a second chance if the first input is not a valid number.
     * 
     * @param scanner Scanner object for reading user input
     */
    private static void handlingUncheckedException(Scanner scanner) {
        System.out.println("Enter a number (or non-number to see exception handling) > ");
        String input = scanner.nextLine();
        int numericValue;
        
        try {
            // Attempt to parse the input as an integer
            numericValue = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            // Handle the exception by giving the user another chance
            System.out.println("Try again, the earlier entry was not a number");
            input = scanner.nextLine();
            numericValue = Integer.parseInt(input); // Note: This could still throw an exception
        }
        
        System.out.println("You entered " + numericValue);
    }
    
    /**
     * Demonstrates what happens when NumberFormatException is not handled.
     * 
     * This method will crash the program if a non-numeric input is provided,
     * showing the default behavior of unchecked exceptions when not caught.
     * 
     * @param scanner Scanner object for reading user input
     * @throws NumberFormatException if input cannot be parsed as an integer
     */
    private static void showUncheckedException(Scanner scanner) {
        System.out.println("Enter a number (or non-number to see unhandled exception) > ");
        String input = scanner.nextLine();
        
        // This will throw NumberFormatException if input is not a valid integer
        int numericValue = Integer.parseInt(input);
        
        // This line will only execute if no exception was thrown
        System.out.println("You entered " + numericValue);
    }
}

