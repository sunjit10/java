package collections.lists;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/*
   Check Modifiable List where getPeople() returns list as is
 */
class People {
    private List<String> people = new ArrayList<>();

    public People() {
	people.add("Bob");
	people.add("Jim");
	people.add("Sue");
    }

    public List<String> getPeople() {
	return Collections.unmodifiableList(people);
    }
}

public class UnmodifiableLists {
    public static void main(String[] args) {
	People people = new People();
	var employees = people.getPeople();
	employees.forEach(e -> System.out.println(e));
	// Cannot call remove since List is Unmodifiable
	//employees.remove(1);

	System.out.println("--------------");
	var employees2 = people.getPeople();
	employees2.forEach(e -> System.out.println(e));
    }
}
