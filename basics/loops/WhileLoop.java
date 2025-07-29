package basics.loops;

/**
 * Demonstrates while loop equivalents of the for loop examples in ForLoop.java
 */
public class WhileLoop {
    public static void main(String[] args) {
        whileLoop1();
        whileLoop2();
        whileLoop3();
        doWhileExample();
        standardWhileLoop();
    }

    /**
     * Equivalent to forloop1() - initialization before loop, increment inside loop
     * For loop equivalent: for (int i = 0; ;i++) { ... }
     */
    private static void whileLoop1() {
        System.out.println("\n=== While Loop 1 ===");
        int i = 0;
        while (true) {
            System.out.println("i " + i);
            if (i > 3) {
                break;
            }
            i++;
        }
    }

    /**
     * Equivalent to forloop2() - initialization before loop, increment at end of loop body
     * For loop equivalent: for (int i = 0; ; ) { ... i++; }
     */
    private static void whileLoop2() {
        System.out.println("\n=== While Loop 2 ===");
        int i = 0;
        while (true) {
            System.out.println("i " + i);
            if (i > 3) {
                break;
            }
            i++;
        }
    }

    /**
     * Equivalent to forloop3() - initialization outside loop
     * For loop equivalent: int i = 0; for ( ; ; ) { ... i++; }
     */
    private static void whileLoop3() {
        System.out.println("\n=== While Loop 3 ===");
        int i = 0;
        while (true) {
            System.out.println("i " + i);
            if (i > 3) {
                break;
            }
            i++;
        }
    }

    /**
     * Additional example using do-while loop
     * This ensures the loop body executes at least once before checking the condition
     */
    private static void doWhileExample() {
        System.out.println("\n=== Do-While Loop Example ===");
        int i = 0;
        do {
            System.out.println("i " + i);
            i++;
        } while (i <= 3);
    }

    /**
     * Example of a standard while loop with condition in the while statement
     * This is more common than using while(true) with a break
     */
    private static void standardWhileLoop() {
        System.out.println("\n=== Standard While Loop ===");
        int i = 0;
        while (i <= 3) {
            System.out.println("i " + i);
            i++;
        }
    }
}
