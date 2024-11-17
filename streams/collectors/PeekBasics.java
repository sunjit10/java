package streams.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class PeekBasics {
    public static void main(String[] args) {
	var nums = List.of(1,3,2,6,4,9,5);
	
	// peek - as it means literally is to peek what is inside a Stream
	var listOfNums = nums.stream()
	    .peek(n -> System.out.println(n + ": " + n.getClass()))
	    .map(n -> n*n)
	    .peek(n -> System.out.println("Squarred value: " + n))
	    .collect(Collectors.toList());

    }
}
