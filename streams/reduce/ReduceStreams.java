package streams.reduce;

import java.util.stream.IntStream;

public class ReduceStreams {
    public static void main(String[] args) {
	System.out.println(IntStream.range(0,5).count());
	System.out.println(IntStream.range(0,5).sum());
	
	int value = IntStream.range(0,5).reduce(7, (subtotal, item) -> {
		System.out.println(subtotal + ":" + item);
		return subtotal + item;
	    });
	System.out.println(value);
	System.out.println("---------------------------------------");
	
	var value2 = IntStream.range(0,5).reduce((subtotal, item) -> {
		System.out.println(subtotal + ":" + item);
		return subtotal + item;
	    });
	System.out.println(value2);
    }
}

