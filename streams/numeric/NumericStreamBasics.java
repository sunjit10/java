package streams.numeric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// IntStream is one of the many Numeric streams
// It is suited for operations on numbers with much better performance
public class NumericStreamBasics {
    public static void main(String[] args) {
	List<Integer> intList = Arrays.asList(1,2,3,4,5,6);

	int sum =
	    intList.stream()
	    .reduce(0, (x,y) -> x + y);

	System.out.println("Sum " + sum);

	sum = IntStream.rangeClosed(1,6).sum();

	System.out.println("Sum " + sum);
    }
}
