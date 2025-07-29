package basics.inner;

/**
 * Demonstrates the use of static inner classes in Java.
 * Static inner classes don't need an instance of the outer class to be instantiated.
 * They cannot directly access non-static members of the outer class.
 */
public class StaticInnerClassDemo {

    private String msg = " is working";
    
    /**
     * Static inner class ClassA.
     * Can be instantiated without an instance of the outer class.
     */
    static class ClassA {
        public void methodA() {
            System.out.println("methodA");
            // Cannot access outer class non-static variables from static inner class
            // System.out.println(msg); // This would cause a compilation error
        }
    }

    /**
     * Static inner class ClassB.
     * Can be instantiated without an instance of the outer class.
     */
    static class ClassB {
        public void methodB() {
            System.out.println("methodB");
            // Cannot access outer class non-static variables from static inner class
            // System.out.println(msg); // This would cause a compilation error
        }
    }

    /**
     * Creates instances of both static inner classes and calls their methods.
     */
    public void print() {
        ClassA classA = new ClassA();
        classA.methodA();
        ClassB classB = new ClassB();
        classB.methodB();
    }

    /**
     * Main method to demonstrate static inner classes.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        new StaticInnerClassDemo().print();
    }
}
