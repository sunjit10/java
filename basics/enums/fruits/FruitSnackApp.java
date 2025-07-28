package basics.enums.fruits;

/**
 * Application that demonstrates the use of the Fruit enum.
 * This class shows various ways to work with enum values and their properties.
 */
public class FruitSnackApp {

    /**
     * Main entry point for the application.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        Fruit fruit1 = Fruit.APPLE;
        Fruit fruit2 = Fruit.MANGO;
        Fruit fruit3 = Fruit.APPLE;
        
        System.out.println("===== Basic Enum Information =====");
        basicInfo(fruit1, fruit2, fruit3);
        
        System.out.println("\n===== All Enum Values =====");
        showValues();
        
        System.out.println("\n===== Enum Ordinals =====");
        showOrdinals();
        
        System.out.println("\n===== Enum valueOf() =====");
        showValueOf();
        
        System.out.println("\n===== Fruit Properties =====");
        showFruitProperties();
    }

    /**
     * Displays basic information about enum instances.
     * 
     * @param fruit1 First fruit instance
     * @param fruit2 Second fruit instance
     * @param fruit3 Third fruit instance (same as first)
     */
    private static void basicInfo(Fruit fruit1, Fruit fruit2, Fruit fruit3) {
        System.out.println("First fruit: " + fruit1);
        System.out.println("Second fruit: " + fruit2);
        System.out.println("Enum class: " + fruit1.getClass());
        System.out.println("Are fruit1 and fruit3 the same instance? " + (fruit1 == fruit3));
    }

    /**
     * Demonstrates how to iterate through all enum values.
     */
    private static void showValues() {
        for (Fruit fruit : Fruit.values()) {
            System.out.println(fruit);
        }
    }

    /**
     * Shows the ordinal values of each enum constant.
     * Ordinals represent the position of the enum constant in its declaration.
     */
    private static void showOrdinals() {
        for (Fruit fruit : Fruit.values()) {
            String msg = String.format("Fruit %s has ordinal %d", fruit, fruit.ordinal());
            System.out.println(msg);
        }
    }
    
    /**
     * Demonstrates the valueOf() method to convert a string to an enum constant.
     */
    private static void showValueOf() {
        Fruit mango = Fruit.valueOf("MANGO");
        System.out.println("Is Fruit.valueOf(\"MANGO\") == Fruit.MANGO? " + (mango == Fruit.MANGO));
    }
    
    /**
     * Demonstrates accessing the properties of each fruit.
     * Shows how to use the getColor() and getTaste() methods.
     */
    private static void showFruitProperties() {
        for (Fruit fruit : Fruit.values()) {
            System.out.printf("%-6s - Color: %-7s, Taste: %s%n", 
                    fruit.name(), fruit.getColor(), fruit.getTaste());
        }
    }
}
