package streams.basics;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsBasics {
    public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<>(List.of(1,6,4,6,4));
	numbers.stream().forEach(System.out::println);
	
	System.out.println();
	
	List.of(10,30,20).stream().forEach(System.out::println);
	
	System.out.println();
 
	// forEach is a terminal operation, it closes the stream
	// Other examples are count/collect
	Stream.of(1,5,2,3).forEach(System.out::println);
	
	System.out.println();

	// Without limit(n), it would be an never ending output
	// Stream.generate : initilization, limit: intermediary, forEach: terminate
	// Note: There can be one or many intermediary chained together
	Stream.generate(() -> "hello").limit(3).forEach(System.out::println);
    }
}
