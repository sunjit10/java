package collections.lists;

import java.util.List;
import java.util.ArrayList;

class Person {
    String name;
    
    Person(String name) {
	this.name = name;
    }
    
    @Override
    public String toString() {
	return name;
    }
}

public class ListOfPersons {
    public static void main(String[] args) {
	List<Person> lists = new ArrayList<>();
	lists.add(new Person("Mike"));
	lists.add(new Person("Jack"));
	
	lists.set(1, new Person("Ian"));
	showPersons(lists);
    }
    
    private static void showPersons(List<Person> persons) {
	persons.forEach(e -> {
		String fullName = e + " Smith";
		System.out.println(fullName);
	    });
    }
}
