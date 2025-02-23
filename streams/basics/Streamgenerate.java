package streams.basics;

import java.util.stream.Stream;
import java.util.function.Supplier;
import java.util.Random;

// generate takes a Supplier as an Input parameter
public class Streamgenerate {
    public static void main(String[] args) {
	Supplier<Integer> integerSupplier = new Random()::nextInt;
	
	Stream.generate(integerSupplier)
	    .limit(5) // without limit we will have an unlimited list 
	    .forEach(System.out::println);
    }
}
