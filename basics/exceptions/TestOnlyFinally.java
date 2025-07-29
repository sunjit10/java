package basics.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Demonstrates the use of try-finally block without a catch clause.
 * This example shows how finally blocks always execute, even when exceptions occur,
 * and how resources can be properly closed in the finally block.
 */
public class TestOnlyFinally {
    
    /**
     * Attempts to read from a file without catching exceptions, but ensures
     * resources are properly closed using a finally block.
     * 
     * @param args Command line arguments (not used)
     * @throws FileNotFoundException If the specified file cannot be found
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = null;
        
        try {
            // This operation may throw FileNotFoundException, which is declared in the method signature
            // rather than being caught locally
            scanner = new Scanner(new File("java8/input.txt"));
            
            // Process each line in the file
            while (scanner.hasNext()) {
                System.out.println("Read line: " + scanner.nextLine());
            }
        } finally {
            // The finally block always executes, whether an exception occurs or not
            System.out.println("Closing scanner");
            
            // Best practice: Check for null before closing resources
            if (scanner != null) {
                scanner.close();
            }
        }
        
        // Note: In modern Java, this would be better implemented using try-with-resources:
        // try (Scanner scanner = new Scanner(new File("java8/input.txt"))) {
        //     while (scanner.hasNext()) {
        //         System.out.println("Read line: " + scanner.nextLine());
        //     }
        // }
    }
}
