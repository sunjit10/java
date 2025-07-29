package basics.inner;

/**
 * Demonstrates the concept of local inner classes (classes defined within methods).
 * Local inner classes have access to the enclosing class's instance variables.
 */
public class ClassWithinMethod {

    private String name;
    private String city;
    
    /**
     * Default constructor initializing instance variables.
     */
    ClassWithinMethod() {
        name = "LOL";
        city = "SpringField";
    }
    
    public static void main(String[] args) {
        ClassWithinMethod myClass = new ClassWithinMethod();
        myClass.complicatedMethod1();
        myClass.complicatedMethod2();
    }
    
    /**
     * Demonstrates a simple local inner class that doesn't access instance variables.
     */
    public void complicatedMethod1() {
        // Local inner class definition
        class PrintName {
            PrintName() {
                System.out.println("PrintName constructor");
            }
        }
        
        // Create an instance of the local inner class
        new PrintName();
        System.out.println(name);
    }

    /**
     * Demonstrates a local inner class that accesses enclosing class's instance variables.
     * Shows different ways to reference the enclosing class's members.
     */
    public void complicatedMethod2() {
        // Local inner class with methods
        class PrintName2 {
            PrintName2() {
                System.out.println("PrintName2 constructor");
            }
            
            /**
             * Implicitly accesses the enclosing class's name variable.
             */
            public void doYouKnowTheName() {
                System.out.println(name);
            }
            
            /**
             * Implicitly accesses the enclosing class's city variable.
             */
            private void doYouKnowTheCity() {
                System.out.println(city);
            }
            
            /**
             * Explicitly accesses the enclosing class's name variable.
             */
            public void doYouKnowTheName2() {
                // Would not work, this would mean name is defined for PrintName2 class
                // System.out.println(this.name); 
                
                // Explicitly reference the enclosing class's instance variable
                System.out.println(ClassWithinMethod.this.name);
            }
        }
        
        // Create and use the local inner class
        PrintName2 pn = new PrintName2();
        pn.doYouKnowTheName();
        pn.doYouKnowTheCity();
        pn.doYouKnowTheName2();
    }
}
