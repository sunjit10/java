package streams.collectors;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsBasics {
    public static void main(String[] args) {
	example1();
	System.out.println("----------------------------");
	example2();
	System.out.println("----------------------------");
	example3();
    }

    private static void example1() {
	var names = List.of("Jamie", "Sean", "Jack", "Molly");
	
	var listOfNames = names.stream().collect(Collectors.toList());
	System.out.println(listOfNames.getClass());
	listOfNames.add("John");
	
	for (var name : listOfNames) {
	    System.out.println(name);
	}
    }

     private static void example2() {
	var names = List.of("Jamie", "Sean", "Jack", "Molly");

	// Added an intermediary .map operation
	var listOfNames = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
	System.out.println(listOfNames.getClass());
	listOfNames.add("MANDY");
	
	for (var name : listOfNames) {
	    System.out.println(name);
	}
    }

    private static void example3() {
	var result = Stream.of("one", "two", "three", "four")
	    .collect(
		     () -> new ArrayList<String>(),
		     (list, item) -> list.add(item),
		     (list1, list2) -> list1.addAll(list2)
		     );
	
	System.out.println(result);
    }
}
