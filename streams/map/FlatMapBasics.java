package streams.map;

import java.util.List;
import java.util.Set;

public class FlatMapBasics {
    public static void main(String[] args) {
	List<Set<Integer>> list = List.of(Set.of(1,2,3),
					  Set.of(4,5,6),
					  Set.of(7,8,9));
	
	list.stream().forEach(System.out::println);

	System.out.println("Now flattening it");

	// here we combine multiple individual streams into a main stream
	list.stream().flatMap(s -> s.stream()).forEach(System.out::println);
    }
}
    
