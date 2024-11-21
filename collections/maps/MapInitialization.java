package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapInitialization {
    public static void main(String[] args) {
	// Max 5 pairs or 10 values
	HashMap<Integer, String> spring =
	    new HashMap<>(Map.of(3, "Mar", 4, "Apr", 5, "May"));

	spring.forEach((k,v) -> System.out.println("Spring month number " + k + " value " + v));

	// Unlimited length, no restriction
	HashMap<Integer, String> summer = new HashMap<>(Map.ofEntries(Map.entry(6, "Jun"), Map.entry(7, "Jul"), Map.entry(8, "Aug")));
	summer.forEach((k,v) -> System.out.println("Summer month number " + k + " value " + v));
	     
    }
}
