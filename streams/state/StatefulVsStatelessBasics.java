package streams.state;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

// Stateful: distinct(), sorted(), skip(), limit()
// Stateless: map(), filter()
public class StatefulVsStatelessBasics {
    public static void main(String[] args) {
	ArrayList<String> names =
	    new ArrayList<>(List.of("Jim", "Nick", "Sam", "Adam", "Nick", "Scarlet"));
	
	// stateful
	List<String> newList = 
	    names.stream()
	    .skip(1)
	    .peek(System.out::println)
	    .distinct()
	    .peek(System.out::println)
	    .sorted()
	    .peek(System.out::println)
	    .collect(Collectors.toList());
	System.out.println(newList);
	
	System.out.println("-------------------------");
	
	// stateless
	List<String> newList2 = 
	    names.stream()
	    .peek(System.out::println)
	    .filter(s -> s.length() == 3)
	    .peek(System.out::println)
	    .map(n -> n.toUpperCase())
	    .peek(System.out::println)
	    .collect(Collectors.toList());
	
	System.out.println(newList2);
    }
}
