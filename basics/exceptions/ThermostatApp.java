package basics.exceptions;

/**
 * ThermostatApp - Demonstrates the difference between checked exceptions (java.lang.Exception)
 * and unchecked exceptions (java.lang.RuntimeException).
 * 
 * This application shows how:
 * 1. Checked exceptions must be explicitly caught or declared in the method signature
 * 2. Unchecked exceptions don't require explicit handling
 */
public class ThermostatApp {
    
    public static void main(String[] args) {
        
        // Example 1: Handling a checked exception (java.lang.Exception)
        // The compiler forces us to either catch this exception or declare it in the method signature
        try {
            Thermostat.setVehicleTemp(134.3); // This temperature is outside the valid range
        } catch (Exception e) {
            System.err.println("Caught checked exception: " + e.getMessage());
            // Using System.err instead of printStackTrace() for cleaner output
        }
        
        // Example 2: Unchecked exception (java.lang.RuntimeException)
        // No need to explicitly catch or declare RuntimeExceptions
        // This will crash the program if the temperature is invalid
        try {
            Thermostat.setMachineTemp(140.3); // This temperature is outside the valid range
        } catch (RuntimeException e) {
            System.err.println("Caught unchecked exception: " + e.getMessage());
            // In real applications, you might want to handle even unchecked exceptions
        }
        
        // Example 3: Successful temperature setting (no exception)
        try {
            Thermostat.setVehicleTemp(75.0); // This is a valid temperature
        } catch (Exception e) {
            System.err.println("This should not happen with valid temperature: " + e.getMessage());
        }
    }
}

