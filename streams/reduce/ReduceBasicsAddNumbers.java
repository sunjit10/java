package streams.reduce;

import java.util.List;
import java.util.Optional;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReduceBasicsAddNumbers {
    public static void main(String[] args) {
	List<Integer> list1 = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
	int sum =
	    list1.stream()
	    .reduce(0, (a,b) -> a + b);

	System.out.println("Sum " + sum); // Output will be 550

	sum =
	    list1.stream()
	    .reduce(0, Integer::sum);

	System.out.println("Sum " + sum); // Output will be 550
	
    }
}
