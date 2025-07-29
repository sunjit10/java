package basics.core;

/**
 * Represents a person with a name.
 * Demonstrates proper implementation of equals() method.
 */
class Person {
    private String name;
    
    /**
     * Constructs a Person with the specified name.
     * 
     * @param name the person's name
     */
    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        // Check if same object reference
        if (this == o) {
            return true;
        }
        
        // Check for null and correct type
        if (o == null || !(o instanceof Person)) {
            return false;
        }
        
        // Check if this object's name is null
        if (this.name == null) {
            return false;
        }
        
        // Cast and compare name values
        Person p = (Person) o;
        return name.equals(p.name);
    }
    
    @Override
    public int hashCode() {
        // Always implement hashCode when overriding equals
        return name != null ? name.hashCode() : 0;
    }
}

/**
 * Demonstrates the behavior of the equals() method.
 * Shows how to compare objects for equality using both reference equality (==)
 * and logical equality (equals method).
 */
public class EqualsDemo {
    public static void main(String[] args) {
        // Create two Person objects with the same name
        Person p1 = new Person("Mike");
        Person p2 = new Person("Mike");
        
        // Create a reference to the first Person
        Person p3 = p1;
        
        // Demonstrate reference equality (==)
        System.out.println("Reference equality demonstrations:");
        System.out.println("p1 == p2: " + (p1 == p2));     // false - different objects
        System.out.println("p1 == p3: " + (p1 == p3));     // true - same reference
        
        // Demonstrate logical equality (equals method)
        System.out.println("\nLogical equality demonstrations:");
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true - same name
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // true - same object
        System.out.println("p1.equals(null): " + p1.equals(null)); // false - null check
        System.out.println("p1.equals(\"Mike\"): " + p1.equals("Mike")); // false - different types
    }
}
