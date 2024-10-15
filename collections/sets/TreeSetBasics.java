package collections.sets;

import java.util.TreeSet;
 
/*
 * TreeSet sorts based on the natural order. For storing custom objects, we
 * have to implement the Comparable to tell what is a natural order for a Person
 * 
 */
class Person implements Comparable<Person> {
    String name;

    Person(String name) {
	this.name = name;
    }

    public String toString() {
	return name;
    }

    public int compareTo(Person other) {
	return name.compareTo(other.name);
    }
}


public class TreeSetBasics {
    public static void main(String[] args) {
	TreeSet<Person> persons = new TreeSet<>();
	persons.add(new Person("Mark"));
	persons.add(new Person("Albert"));
	persons.add(new Person("Zidane"));
	persons.add(new Person("Simon"));

	for (var person : persons) {
	    System.out.println(person);
	}
    }
}
