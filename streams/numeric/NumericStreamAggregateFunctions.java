package streams.numeric;

import java.util.OptionalInt;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateFunctions {
    public static void main(String[] args) {
	int sum = IntStream.rangeClosed(1,50).sum();
	System.out.println("Sum " + sum);
	minMaxCalc();
	avgCalc();
    }

    private static void minMaxCalc() {
	OptionalInt min = IntStream.rangeClosed(1,50).min();
	OptionalInt max = IntStream.rangeClosed(1,50).max();
	System.out.println("Min " + min.getAsInt() + 
			   " Max " + max.getAsInt());
    }
    
    private static void avgCalc() {
	OptionalDouble avg = LongStream.rangeClosed(1,50).average();
	System.out.println("Average " + avg.getAsDouble());
    }
}
