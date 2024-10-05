package basics.core.compare;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import java.util.Comparator;

/*
 * Input:  Mike 50, Bob 20, Mike 40, Charles 30
 * Output: Bob 20, Charles 30, Mike 50, Mike 40
 */


public class ComparatorMultiFields {
    public static void main(String[] args) {
	List<Person> persons = new ArrayList<>();
	persons.add(new Person("Mike", 50));
	persons.add(new Person("Bob", 20));
	persons.add(new Person("Mike", 40));
	persons.add(new Person("Charles", 30));

	System.out.println("\nOnly Sorted with Name, ignoring Age");
	Collections.sort(persons, new OnlySortNameComparator());
	persons.forEach(System.out::println);

	System.out.println("\nNow showing with Reverse Name Sort");
	Collections.sort(persons, new PersonReverseComparator());
	persons.forEach(System.out::println);


	// Not using Collections.sort
	System.out.println("\nReverse sort based on only Age");
	persons.sort(new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
		    return -1 * p1.getAge().compareTo(p2.getAge());
		}
	    });
	persons.forEach(System.out::println);
    }
}

class OnlySortNameComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
	return p1.getName().compareTo(p2.getName());
    }
}


class PersonReverseComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
	return -1 * p1.getName().compareTo(p2.getName());
    }
}
