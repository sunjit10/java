package streams.reduce;

import java.util.List;
import java.util.Optional;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReduceBasics {
    public static void main(String[] args) {
	List<Integer> list1 = Arrays.asList(5,6,7);
	performMultiplication(list1);
	performMultiplicationWithoutIdentity(list1);
    }

    private static void performMultiplication(List<Integer> list1) {
	int val =
	    list1.stream()
	    .reduce(2, (a,b) -> a*b);
	// Above, 2 is called the Identity of reduce function
	System.out.println(val);
	
	/*
	  R1: a = 2, b = 5 -> 2*5 = 10
	  R2: a = 10, b = 6 -> 10*6 = 60
	  R3: a = 60, b = 7 -> 60*7 = 420
	*/
    }

    // Without identity value, an Optional gets returned
    private static void performMultiplicationWithoutIdentity(List<Integer> list1) {
	Optional<Integer> result =
	    list1.stream()
	    .reduce((a,b) -> a*b);
	
	System.out.println(result.isPresent());
	System.out.println(result.get());
	
	/*
	  R1: a = 5, b = 6 -> 5*6 = 30
	  R2: a = 30, b = 7 -> 30*7 = 210
	*/
    }
}
