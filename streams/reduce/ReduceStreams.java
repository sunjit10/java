package streams.reduce;

import java.util.stream.IntStream;

public class ReduceStreams {
    public static void main(String[] args) {
	// range does not include the upper bound.
	// Hence, (0,5) will be 0,1,2,3,4
	System.out.println(IntStream.range(0,5).count());
	System.out.println(IntStream.range(0,5).sum());
	
	int value1 = IntStream.range(0,5).reduce(7, (subtotal, item) -> {
		System.out.println(subtotal + ":" + item);
		return subtotal + item;
	    });
	System.out.println(value1);
	System.out.println("---------------------------------------");
	
	var value2 = IntStream.range(2,5).reduce((subtotal, item) -> {
		System.out.println(subtotal + ":" + item);
		return subtotal + item;
	    });
	System.out.println(value2);
    }
}

/*

 value1 calculations:
 7 + 0 -> 7 + 1 -> 8 + 2 -> 10 + 3 -> 13 + 4 = 17

 value2 calculations:
 0 + 0 -> 0 + 1 -> 1 + 2 -> 3 + 3 -> 6 + 4  = 10

 */

