package basics.core;

import static java.lang.Math.PI;
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

/**
 * Demonstrates the use of static imports in Java.
 * Static imports allow direct access to static members (fields and methods)
 * of a class without qualifying them with the class name.
 */
public class StaticImports {
    
    /**
     * Main method to demonstrate various static imports.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Using PI constant without Math class qualifier
        out.println("Value of PI: " + PI);
        
        // Using abs() method without Math class qualifier
        out.println("Absolute value of -9.2: " + abs(-9.2));
        out.println("Absolute value of 8.4: " + abs(8.4));
        
        // Additional examples using other imported static methods
        double x = 16.0;
        double y = 25.0;
        
        out.println("Square root of " + x + ": " + sqrt(x));
        out.println("Maximum of " + x + " and " + y + ": " + max(x, y));
        out.println("Minimum of " + x + " and " + y + ": " + min(x, y));
        out.println(x + " raised to power 2: " + pow(x, 2));
    }
}
