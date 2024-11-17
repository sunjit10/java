package streams.reduce;

import java.util.stream.IntStream;

public class ReduceToCalculateFactorial {
    public static void main(String[] args) {

	int findFactorialFor = 5;

	int factorialValue = IntStream
	    .range(1, findFactorialFor + 1)
	    .reduce(1, (v1, v2) -> v1 * v2);
	System.out.println(factorialValue);

    }
}
