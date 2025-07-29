package basics.core.compare;

import java.util.Objects;

/**
 * Person class representing a person with a name and age.
 * This class implements Comparable to allow natural ordering based on name,
 * with age as a secondary comparison criterion.
 */
public class Person implements Comparable<Person> {
    // Instance variables
    private String name;
    private int age;
    
    /**
     * Constructs a Person with the specified name and age.
     * 
     * @param name the person's name
     * @param age the person's age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /**
     * Returns the person's name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the person's age as an Integer object.
     * 
     * @return the age as an Integer
     */
    public Integer getAge() {
        return age;
    }
    
    /**
     * Returns a string representation of this Person.
     * 
     * @return a string in the format "name : age"
     */
    @Override
    public String toString() {
        return name + " : " + age;
    }

    /**
     * Compares this person with another person for order.
     * Comparison is primarily by name, and secondarily by age if names are equal.
     * 
     * @param p the person to be compared
     * @return a negative integer, zero, or a positive integer as this person
     *         is less than, equal to, or greater than the specified person
     */
    @Override
    public int compareTo(Person p) {
        // First compare by name
        int comparison = name.compareTo(p.getName());
        
        // If names are equal, compare by age
        if (comparison == 0) {
            comparison = Integer.compare(age, p.getAge());
        }
        
        return comparison;
    }
    
    /**
     * Indicates whether some other object is "equal to" this one.
     * Two Person objects are considered equal if they have the same name and age.
     * 
     * @param obj the reference object with which to compare
     * @return true if this object is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }
    
    /**
     * Returns a hash code value for the object.
     * 
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
