package streams.numeric;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

// range(1, 50) means 49 numbers from 1 to 49
// rangeClosed(1, 50) means 50 numbers from 1 to 50
// Int and Long streams work the same way (Does not work for Double)
public class IntLongStreamRanges {
    public static void main(String[] args) {
	intStreamRanges();
	longStreamRanges();
    }

    private static void intStreamRanges() {	
	int sum = IntStream.range(1,6).sum();
	System.out.println("Sum with range " + sum);
	System.out.println("Count: " + IntStream.range(1,6).count());
	
	sum = IntStream.rangeClosed(1,6).sum();
	System.out.println("Sum with rangeClosed " + sum);
	System.out.println("Count: " + IntStream.rangeClosed(1,6).count());
    }

    private static void longStreamRanges() {
	long sum = LongStream.range(1,6).sum();
	System.out.println("Sum(Long) with range " + sum);
	
	sum = LongStream.rangeClosed(1,6).sum();
	System.out.println("Sum(Long) with rangeClosed " + sum);
    }
}
