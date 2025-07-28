package streams.numeric;

import java.util.stream.IntStream;
import java.util.stream.DoubleStream;

// IntStream is one of the many Numeric streams
// It is suited for operations on numbers with much better performance
public class IntStreamToDoubleStream {
    public static void main(String[] args) {
	DoubleStream dStream = IntStream.rangeClosed(1,5).asDoubleStream();
	dStream.forEach(System.out::println);
    }
}
