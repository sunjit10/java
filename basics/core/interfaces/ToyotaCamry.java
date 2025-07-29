package basics.core.interfaces;

/**
 * ToyotaCamry class that implements the Car interface.
 * This class represents a Toyota Camry model with specific implementation
 * of the Car interface methods.
 * 
 * @author Sunjit
 * @version 1.0
 */
public class ToyotaCamry implements Car {

    /**
     * Returns the make of the car.
     * 
     * @return String representing the car make ("Toyota")
     */
    @Override
    public String getMake() {
        return "Toyota";
    }

    /**
     * Returns the model of the car.
     * 
     * @return String representing the car model ("Camry")
     */
    @Override
    public String getModel() {
        return "Camry";
    }
    
    /**
     * Main method to demonstrate the usage of ToyotaCamry class
     * and Car interface methods (including default and static methods).
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create an instance of ToyotaCamry
        ToyotaCamry tc = new ToyotaCamry();

        // Demonstrate default method from Car interface
        System.out.println("Car Type: " + tc.getCarType());

        // Demonstrate static method from Car interface
        System.out.println("Drive Type: " + Car.getDriveType());
        
        // Demonstrate implemented methods
        System.out.println("Make: " + tc.getMake());
        System.out.println("Model: " + tc.getModel());
    }
}

// Made with Bob
