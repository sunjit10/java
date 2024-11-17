package streams.collectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
  - Using streams
  - Load a text file
  - Create a map of all the words in the text file
  - Map Key: Each unique word
  - Map Value: Frequency/Count of each occurrence of the word

 */
public class CountWordFrequency {
    public static void main(String[] args) throws IOException {
	var output = Files.lines(Paths.get("/home/rishma/dev/java/streams/blah.txt"))
	             .map(s -> s.split("[^a-zA-Z]"))
	             .map(Arrays::asList)
	             .flatMap(l -> l.stream())
	             .collect(
			      HashMap<String, Integer>::new,
			      (map, word) -> {
				  Integer count = map.get(word);
				  if (count == null) {
				      map.put(word, 1);
				  } else {
				      map.put(word, count + 1);
				  }
			      },
			      CountWordFrequency::combine
			      );
	System.out.println(output);
	
    }

    private static void combine(Map<String, Integer> map1, Map<String, Integer> map2) {
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
