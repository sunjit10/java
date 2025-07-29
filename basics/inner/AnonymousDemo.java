package basics.inner;

/**
 * Demonstrates the use of anonymous classes in Java.
 * This example uses the Runnable interface to show how anonymous classes work.
 */
public class AnonymousDemo {

    private String greeting = "Good";

    public static void main(String[] args) {
        new AnonymousDemo().showDemo();
    }

    /**
     * Demonstrates two ways to implement the Runnable interface:
     * 1. Using an anonymous class
     * 2. Using a lambda expression (Java 8+)
     */
    private void showDemo() {
        // Implementation using Anonymous Class
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(greeting + " Evening");
            }
        };
        
        System.out.println("Running with anonymous class:");
        activate(anonymousRunnable);
        
        // Alternative implementation using Lambda (Java 8+)
        Runnable lambdaRunnable = () -> System.out.println(greeting + " Morning");
        
        System.out.println("Running with lambda expression:");
        activate(lambdaRunnable);
    }

    /**
     * Executes the given Runnable object.
     * 
     * @param runnable the Runnable to execute
     */
    public void activate(Runnable runnable) {
        runnable.run();
    }
}
