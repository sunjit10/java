package collections.maps;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Person {

    String name;

    Person(String name) {
	this.name = name;
    }

    public String toString() {
	return name;
    }
}

public class MapsForCustomObjects {
    public static void main(String[] args) {
	Map<Person, Integer> persons1 = new HashMap<>();
	Map<Person, Integer> persons2 = new LinkedHashMap<>();

	// For TreeMap to work, it needs to know the Natural Order
	// To achieve that, Person must implement Comparable interface
	//Map<Person, Integer> persons3 = new TreeMap<>();

	handlePersons(persons1);
	handlePersons(persons2);
	//handlePersons(persons3);
    }
    
    private static void handlePersons(Map<Person, Integer> persons) {
	persons.put(new Person("Mike"), 20);
	persons.put(new Person("Jake"), 10);
	persons.put(new Person("Mike"), 30);
	persons.put(new Person("Adam"), 15);
	
	persons.forEach((k,v) -> System.out.println(k + " : " + v));
	
    }
}
