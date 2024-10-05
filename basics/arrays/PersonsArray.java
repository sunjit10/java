package basics.arrays;

import basics.pkg1.Person;

public class PersonsArray {
    public static void main(String[] args) {
	Person[] allPersons = new Person[5];

	for (int i = 0; i < allPersons.length; i++) {
	    allPersons[i] = new Person();
	}
	
	for (Person person : allPersons) {
	    person.hello(person.toString());
	    System.out.println(person.numberOfPersons());
	}
    }
}
