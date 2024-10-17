package collections.maps;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
   HashMap - no order maintained, LinkedHashMap - maintains order
   TreeMap - stores by sorting by the key's "natural" order
 */
public class LinkedVsTreeMap {
    public static void main(String[] args) {
	Map<Integer, String> seasons = new LinkedHashMap<>();
	System.out.println("LinkedHashMap...stores in order");
	seasons.put(3, "Fall");
	seasons.put(1, "Spring");
	seasons.put(4, "Winter");
	seasons.put(2, "Summer");

	seasons.forEach((k,v) -> System.out.println(k + " : " + v));

	seasons.clear();
	System.out.println("\nTreeMap..automatically sorts using natural order");

	seasons = new TreeMap<>();
	seasons.put(3, "Fall");
	seasons.put(1, "Spring");
	seasons.put(4, "Winter");
	seasons.put(2, "Summer");

	seasons.forEach((k,v) -> System.out.println(k + " : " + v));

	
    }
}
