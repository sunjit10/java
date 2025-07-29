package basics.core;

/**
 * This class demonstrates the use of variable arguments (varargs) in Java.
 * Varargs allow methods to accept a variable number of arguments of the same type.
 * They are denoted by three dots (...) after the parameter type.
 */
public class VariableArgs {
    
    /**
     * Main method that demonstrates calling methods with variable arguments.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Calling greetings with different number of arguments
        greetings("Hello");
        greetings("Good Morning");
        greetings("Have a Nice Day");
        
        // We can also call with multiple arguments at once
        // greetings("Hello", "Good Morning", "Have a Nice Day");
        
        // Calling echoMessage with count and messages
        echoMessage(3, "Ho");
        echoMessage(2, "Ha Ha");
    }
    
    /**
     * A method that accepts variable number of String arguments and prints each one.
     * The varargs parameter is treated as an array inside the method.
     * 
     * @param messages Variable number of String messages to print
     */
    private static void greetings(String... messages) {
        // Iterate through each message in the varargs array
        for (String msg : messages) {
            System.out.println(msg);
        }
    }
    
    /**
     * A method that demonstrates varargs with other parameters.
     * The variable args parameter MUST be the last parameter in the method signature.
     * 
     * @param count Number of times to print each message
     * @param messages Variable number of String messages to print
     */
    private static void echoMessage(int count, String... messages) {
        // For each message in the varargs array
        for (String msg : messages) {
            // Print it 'count' number of times
            for (int i = 0; i < count; i++) {
                System.out.println(msg);
            }
        }
    }
}
