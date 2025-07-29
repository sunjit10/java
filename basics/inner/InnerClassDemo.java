package basics.inner;

/**
 * Demonstrates the use of inner (non-static nested) classes in Java.
 * Inner classes have access to all members of the enclosing class,
 * including private members.
 */
public class InnerClassDemo {
    
    private String msg = "yep";
    
    /**
     * First inner class example
     */
    public class ClassX {
        public void methodX() {
            System.out.println("methodX");
            System.out.println(msg);
        }
    }
    
    /**
     * Second inner class example
     */
    public class ClassY {
        public void methodY() {
            System.out.println("methodY");
        }
    }
    
    /**
     * Creates and uses inner class instances from within the outer class
     */
    public void print() {
        // You don't have to do InnerClassDemo.ClassA
        ClassX classX = new ClassX();
        classX.methodX();
        
        ClassY classY = new ClassY();
        classY.methodY();
    }
    
    public static void main(String[] args) {
        // Method 1: Create inner class instances through an outer class instance method
        new InnerClassDemo().print();
        
        // Cannot do the lines below
        // InnerClassDemo.ClassX cX = new InnerClassDemo.ClassX();
        // cX.methodX();

        // Method 2: Create inner class instances directly with special syntax
        InnerClassDemo icd = new InnerClassDemo();
        InnerClassDemo.ClassX cX = icd.new ClassX();
        cX.methodX();
    }
}

// Made with Bob
