package streams.map.flatmap;

import java.util.List;
import java.util.Set;

/*
  FlatMap like a Map converts from one type to another
  But, FlatMap is used in context of Streams. It converts one type of Stream to another
  So here each element in FlatMap (A Stream) is in itself a combination of many elements
  Ex: Convert a Stream<List> to Stream<Arrays>
 */
public class FlatMapBasics {
    public static void main(String[] args) {
	List<Set<Integer>> list = List.of(Set.of(1,2,3),
					  Set.of(4,5,6),
					  Set.of(7,8,9));
	
	list.stream()
	    .forEach(System.out::println);

	System.out.println("Now flattening it");

	// here we combine multiple individual streams into a main stream
	list.stream()
	    .flatMap(s -> s.stream())
	    .forEach(System.out::println);
    }
}
    
