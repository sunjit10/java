package lambdas.methodreferences;

import java.util.List;
import java.util.ArrayList;

class Person implements Comparable<Person> {
    private String name;
    
    public Person(String name) { this.name = name; }
    
    public String getName() {  return name.toUpperCase(); }
    
    public void setName(String name) { this.name = name; }
    
    public String toString() { return name; }
    
    public int compareTo(Person p) {
	return name.compareTo(p.name);
    }
}

public class MethodReferencesLists {
    public static void main(String[] args) {
	List<Person> persons = new ArrayList<>(List.of(new Person("Jack"), new Person("Albert")));
	persons.sort(Person::compareTo);
	persons.forEach(System.out::println);

	System.out.println();

	List<String> fruits = new ArrayList<>(List.of("pear", "banana", "apple", "mango"));
	fruits.sort(String::compareTo);
	fruits.forEach(System.out::println);
	
    }
}
