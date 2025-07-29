package basics.core.staticstuff;

/**
 * MainApp demonstrates the usage of static and instance variables/methods in Java.
 * This class creates Cat objects and shows how static members are shared across instances.
 * 
 * Key concepts demonstrated:
 * - Creating multiple instances of a class
 * - Accessing static variables through class name and instance
 * - Modifying static variables and seeing the effect across all instances
 */
public class MainApp {
    
    /**
     * Main method that serves as the entry point for the application.
     * 
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create two Cat instances with different names
        Cat cat1 = new Cat("Squeaky");
        Cat cat2 = new Cat("Perkines");
        
        // Display string representation of each cat
        System.out.println(cat1);
        System.out.println(cat2);
        
        // Demonstrate that both cats share the same static counter
        System.out.println("Total Cats: " + cat1.getTotalCats());
        System.out.println("Total Cats: " + cat2.getTotalCats());
        
        // Access static variable directly through class name (preferred way)
        System.out.println("They eat " + Cat.FOOD);
        
        // Modify the static variable - affects all instances
        Cat.FOOD = "Purina Cat Food";
        
        // Access the modified static variable through an instance method
        System.out.println("Now they eat " + cat2.getCatFood());
    }
}
