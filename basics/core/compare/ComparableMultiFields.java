package basics.core.compare;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/*
 * Input:  Mike 50, Bob 20, Mike 40, Charles 30
 * Output: Bob 20, Charles 30, Mike 40, Mike 50
 */
public class ComparableMultiFields {
    public static void main(String[] args) {
	List<Person> persons = new ArrayList<>();
	persons.add(new Person("Mike", 50));
	persons.add(new Person("Bob", 20));
	persons.add(new Person("Mike", 40));
	persons.add(new Person("Charles", 30));
	
	Collections.sort(persons);
	persons.forEach(System.out::println);
    }
}
