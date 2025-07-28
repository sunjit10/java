package basics.enums.fruits;

/**
 * Demonstrates using enum values in a switch statement.
 * This class shows how to handle different fruit types with specific messages.
 */
public class FruitSwitchDemo {
    
    /**
     * Main entry point for the application.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("===== Basic Switch Demo =====");
        demonstrateBasicSwitch(Fruit.BANANA);
        
        System.out.println("\n===== Enhanced Switch Demo =====");
        // Demonstrate for all fruits
        for (Fruit fruit : Fruit.values()) {
            demonstrateEnhancedSwitch(fruit);
        }
    }
    
    /**
     * Demonstrates a basic switch statement with enum values.
     * 
     * @param fruit The fruit to evaluate in the switch statement
     */
    private static void demonstrateBasicSwitch(Fruit fruit) {
        System.out.println("Evaluating: " + fruit);
        
        switch(fruit) {
            case APPLE:
                System.out.println("Apple a Day");
                break;
            case BANANA:
                System.out.println("Banana for Potassium");
                break;
            case MANGO:
                System.out.println("Tropical Mango");
                break;
            default:
                System.out.println("Invalid Fruit");
        }
    }
    
    /**
     * Demonstrates an enhanced switch that uses the fruit's properties.
     * 
     * @param fruit The fruit to evaluate in the switch statement
     */
    private static void demonstrateEnhancedSwitch(Fruit fruit) {
        System.out.println("Fruit: " + fruit.name());
        
        switch(fruit) {
            case APPLE:
                System.out.printf("An %s is %s and has a %s taste. Perfect for pies!%n", 
                        fruit.name(), fruit.getColor(), fruit.getTaste());
                break;
            case BANANA:
                System.out.printf("A %s is %s and has a %s taste. Great for smoothies!%n", 
                        fruit.name(), fruit.getColor(), fruit.getTaste());
                break;
            case MANGO:
                System.out.printf("A %s is %s and has a %s taste. Excellent for tropical desserts!%n", 
                        fruit.name(), fruit.getColor(), fruit.getTaste());
                break;
            default:
                System.out.println("Unknown fruit type");
        }
    }
}
