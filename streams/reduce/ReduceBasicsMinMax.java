package streams.reduce;

import java.util.List;
import java.util.Optional;

import java.util.Arrays;
import java.util.stream.IntStream;

// cannot use identity syntax: reduce(<Identity Value>, (a,b) ....)
// since the identity could be the min or max vs the values from list
// Hence using the Non-Identity syntax which outputs an Optional
public class ReduceBasicsMinMax {
    public static void main(String[] args) {
	List<Integer> list1 = Arrays.asList(7,5,3,8,2,9,4);
	Optional<Integer> max =
	    list1.stream()
	    .reduce((a,b) -> a > b ? a : b);
	
	System.out.println("Max " + max.get());
	
	Optional<Integer> min =
	    list1.stream()
	    .reduce((a,b) -> a < b ? a : b);
	
	System.out.println("Min " + min.get());
    }
}
