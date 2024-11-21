package streams.map;

import java.util.HashMap;
import java.util.Map;


public class CombiningMaps {
    public static void main(String[] args) {
	
	var map1 = new HashMap<String, Integer>(Map.of("one", 1, "two", 1, "four", 1));
	var map2 = new HashMap<String, Integer>(Map.of("two", 1, "three", 3, "four", 3));

	combine(map1, map2);
	System.out.println(map1);
    }

    private static void combine(Map<String, Integer> map1,
				Map<String, Integer> map2) {
	    
	    map2.forEach((word, count2) -> {
			 Integer count1 = map1.get(word);

			 if (count1 == null) {
			     map1.put(word, count2);
			 } else {
			     map1.put(word, count1 + count2);
			 }
		});
    }
}
