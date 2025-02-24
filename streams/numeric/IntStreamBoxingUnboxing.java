package streams.numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntStreamBoxingUnboxing {
    public static void main(String[] args) {

	// Boxing - converting int to Integer
	List<Integer> list1 =
	    IntStream.rangeClosed(1,10)
	    // integer
	    .boxed()
	    // Integer
	    .collect(Collectors.toList());

	unBoxIntegerList(list1);
	
    }
    
    private static void unBoxIntegerList(List<Integer> list1) {
	int sum = list1.stream()
	    .mapToInt(Integer::intValue) // Unboxing: Integer to int
	    .sum();

	System.out.println("Sum " + sum);
    }
}
