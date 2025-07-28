package basics.enums.fruits;

/**
 * Represents different types of fruits with their properties.
 * Each fruit has a color and taste characteristic.
 */
public enum Fruit {

    /**
     * Apple fruit - typically red and sweet/tart in taste.
     */
    APPLE("Red", "Sweet-Tart"),
    
    /**
     * Banana fruit - yellow and sweet in taste.
     */
    BANANA("Yellow", "Sweet"),
    
    /**
     * Mango fruit - orange/yellow and sweet in taste.
     */
    MANGO("Orange", "Sweet");

    private final String color;
    private final String taste;

    /**
     * Constructor for the Fruit enum.
     * 
     * @param color The typical color of the fruit
     * @param taste The characteristic taste of the fruit
     */
    Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    /**
     * Gets the color of the fruit.
     * 
     * @return The color of the fruit
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the taste of the fruit.
     * 
     * @return The taste characteristic of the fruit
     */
    public String getTaste() {
        return taste;
    }

    /**
     * Returns a string representation of this fruit including its name, color, and taste.
     * 
     * @return A formatted string with the fruit's properties
     */
    @Override
    public String toString() {
        return name() + " (" + color + ", " + taste + ")";
    }
}
