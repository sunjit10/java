package collections.lists.comparable;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
    String name;
    
    Person(String name) {
	this.name = name;
    }
    
    @Override
    public String toString() {
	return name;
    }

    public int compareTo(Person p) {
	return name.compareTo(p.toString());
    }
}


public class SortingPersonLists {
    public static void main(String[] args) {
	List<Person> lists = new ArrayList<>();
	lists.add(new Person("Mike"));
	lists.add(new Person("Adam"));
	lists.add(new Person("Jack"));
	lists.add(new Person("Peter"));
	
	Collections.sort(lists);
	lists.forEach(System.out::println);
    }
}
