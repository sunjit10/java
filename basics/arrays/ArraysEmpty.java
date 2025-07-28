package basics.arrays;

/**
 * Demonstrates what happens when you only initialize a few elements of an array.
 * Uninitialized elements get default values (0 for int arrays, null for reference types).
 */
public class ArraysEmpty {
    
    public static void main(String[] args) {
        someEmptyInts();
        someEmptyStrings();
    }

    /**
     * Demonstrates partially initialized int array.
     * Uninitialized elements default to 0.
     */
    private static void someEmptyInts() {
        int[] evens = new int[5];
        evens[0] = 2;
        evens[1] = 4;
        evens[3] = 8;
        
        System.out.println("Integer array with some uninitialized elements:");
        for (int i = 0; i < evens.length; i++) {
            System.out.println("evens[" + i + "] = " + evens[i]);
        }
        System.out.println();
    }

    /**
     * Demonstrates partially initialized String array.
     * Uninitialized elements default to null.
     */
    private static void someEmptyStrings() {
        String[] cities = new String[5];
        cities[0] = "Dublin";
        cities[2] = "Tokyo";
        cities[4] = "Sydney";
        
        System.out.println("String array with some uninitialized elements:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println("cities[" + i + "] = " + cities[i]);
        }
    }
}

// Made with Bob
