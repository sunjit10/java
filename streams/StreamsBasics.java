package streams;

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
	
	Stream.of(1,5,2,3).forEach(System.out::println);
	
	System.out.println();
	
	Stream.generate(() -> "hello").limit(3).forEach(System.out::println);
    }
}
