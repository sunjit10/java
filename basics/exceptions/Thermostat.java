package basics.exceptions;

/**
 * Thermostat class demonstrates different types of exception handling in Java.
 * This class provides methods to set temperature for vehicles and machines
 * with validation to ensure temperatures are within acceptable ranges.
 */
public class Thermostat {
    
    // Constants for temperature limits
    private static final double MIN_TEMPERATURE = 32.0;
    private static final double MAX_TEMPERATURE = 120.0;
    
    /**
     * Sets the temperature for a vehicle with validation.
     * 
     * @param temp The temperature to set in degrees Fahrenheit
     * @throws Exception If the temperature is outside the valid range (32°F to 120°F)
     */
    public static void setVehicleTemp(double temp) throws Exception {
        if (temp < MIN_TEMPERATURE || temp > MAX_TEMPERATURE) {
            throw new Exception("Invalid vehicle temperature: " + temp + 
                               " (must be between " + MIN_TEMPERATURE + " and " + MAX_TEMPERATURE + ")");
        }
        System.out.println("Vehicle temperature set to " + temp + "°F");
    }

    /**
     * Sets the temperature for a machine with validation.
     * Uses an unchecked exception (RuntimeException) which doesn't require explicit handling.
     * 
     * @param temp The temperature to set in degrees Fahrenheit
     * @throws RuntimeException If the temperature is outside the valid range (32°F to 120°F)
     */
    public static void setMachineTemp(double temp) {
        if (temp < MIN_TEMPERATURE || temp > MAX_TEMPERATURE) {
            throw new RuntimeException("Invalid machine temperature: " + temp + 
                                      " (must be between " + MIN_TEMPERATURE + " and " + MAX_TEMPERATURE + ")");
        }
        System.out.println("Machine temperature set to " + temp + "°F");
    }
}
