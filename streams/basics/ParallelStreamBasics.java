package streams.basics;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ParallelStreamBasics {
    public static void main(String[] args) {
	List<String> westernStates = List.of("CA","OR","WA","NV", "ID","AZ");
	// Sequential Stream - output order will be same every time
	westernStates.stream().forEach(System.out::println);

	System.out.println("--------------------");
	// Parallel Stream - output order will be random
	westernStates.parallelStream().forEach(System.out::println);
    }
}
