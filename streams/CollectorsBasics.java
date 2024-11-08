package streams;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsBasics {
    public static void main(String[] args) {
	var names = List.of("Jamie", "Sean", "Jack", "Molly");

	var listOfNames = names.stream().collect(Collectors.toList());
	listOfNames.add("John");

	for (var name : listOfNames) {
	    System.out.println(name);
	}

    }
}
