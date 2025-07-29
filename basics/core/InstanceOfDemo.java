package basics.core;

import java.io.Serializable;

/**
 * Base class that implements Serializable interface.
 */
class Animal implements Serializable { 
    private static final long serialVersionUID = 100L; 
}

/**
 * Mammal class that extends Animal.
 */
class Mammal extends Animal { }

/**
 * CatFamily class that extends Mammal.
 */
class CatFamily extends Mammal { }

/**
 * Tiger class that extends CatFamily.
 */
class Tiger extends CatFamily { }

/**
 * This class demonstrates the usage of the instanceof operator in Java.
 * The instanceof operator checks if an object is an instance of a specific class
 * or implements a specific interface.
 */
public class InstanceOfDemo {
    
    /**
     * Main method to demonstrate instanceof operator with different object types.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Test instanceof operator with different classes in the inheritance hierarchy
        checkInstanceOf("Tiger", new Tiger());
        checkInstanceOf("CatFamily", new CatFamily());
        checkInstanceOf("Mammal", new Mammal());
        checkInstanceOf("Animal", new Animal());

        // Test if objects are instances of Serializable interface
        checkIfSerializable("Tiger", new Tiger());
        checkIfSerializable("CatFamily", new CatFamily());
        checkIfSerializable("Mammal", new Mammal());
        checkIfSerializable("Animal", new Animal());
    }

    /**
     * Checks if an object is an instance of various classes in the inheritance hierarchy.
     * 
     * @param str description of the object being checked
     * @param object the object to check with instanceof
     */
    private static void checkInstanceOf(String str, Object object) {
        System.out.println("Checking for " + str);
        System.out.println(object instanceof Tiger);     // Is it a Tiger?
        System.out.println(object instanceof CatFamily); // Is it a CatFamily?
        System.out.println(object instanceof Mammal);    // Is it a Mammal?
        System.out.println(object instanceof Animal);    // Is it an Animal?
    }

    /**
     * Checks if an object is an instance of Serializable interface.
     * 
     * @param str description of the object being checked
     * @param object the object to check with instanceof
     */
    private static void checkIfSerializable(String str, Object object) {
        System.out.println("Serializable testing for " + str);
        System.out.println(object instanceof Serializable);
    }
}
