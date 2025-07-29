package basics.core;

/**
 * This class demonstrates various aspects of boolean operations in Java:
 * 1. Boolean comparison with primitive types
 * 2. Double negation (!!someBoolean) behavior
 * 3. Boolean operators (&&, ||) and their precedence
 * 4. Type checking with instanceof
 */
public class TestBoolean {
    public static void main(String[] args) {
        testNumbers();
        testBooleanPrimitives();

        // Testing instanceof with non-Boolean object
        Object enabledObj = "true";
        if (enabledObj == null) {
            enabledObj = false;
        }
        // This will print because enabledObj is a String, not a Boolean
        if (!(enabledObj instanceof Boolean)) {
            System.out.println("Does this print?");
        }
    }

    /**
     * Demonstrates equality comparison with integers and double negation
     * with boolean values.
     */
    private static void testNumbers() {
        int i = 3;
        int j = 3;
        boolean isEqual = i == j;      // true because i and j have the same value
        boolean isNotEqual = i != j;   // false because i and j are equal
        System.out.println("isEqual " + isEqual + " isNotEqual " + isNotEqual);
        
        // Double negation (!!): First ! negates the boolean, second ! negates it again
        // resulting in the original value
        if (!!isEqual) {
            System.out.println("This shows that !! cancels out and !!isEqual is same as isEqual");
        }   
    }
    
    /**
     * Demonstrates boolean operators and operator precedence.
     * Shows how && and || operators work together and how parentheses
     * affect the evaluation order.
     */
    private static void testBooleanPrimitives() {
        boolean isWinter = true;
        boolean shouldWearCoat = false;
        boolean isSummer = false;
        
        // This won't print because shouldWearCoat is false
        if (isWinter && shouldWearCoat) {
            System.out.println("Should wear coat1");
        }
        
        // This will print because:
        // 1. !isSummer is true
        // 2. || has lower precedence than &&
        // 3. (isWinter && shouldWearCoat) is false, but !isSummer is true
        if (!isSummer || isWinter && shouldWearCoat) {
            System.out.println("Should wear coat2");
        }
        
        // This won't print because:
        // 1. (!isSummer || isWinter) is true
        // 2. But shouldWearCoat is false
        // 3. true && false = false
        if ((!isSummer || isWinter) && shouldWearCoat) {
            System.out.println("Should wear coat3");
        }
        
        // This will print because:
        // 1. !isSummer is true
        // 2. We don't need to evaluate the right side of || due to short-circuit evaluation
        if (!isSummer || (isWinter && shouldWearCoat)) {
            System.out.println("Should wear coat4");
        }
    }
}
