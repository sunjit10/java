package streams.util.shortcircuit;

import java.util.List;
import java.util.ArrayList;

// This is in shortcircuit package since we don't have to
// go through the entire stream, the moment the limit condition
// gets satisfied, the stream traversal ends
public class LimitStream {
    public static void main(String[] args) {
	ArrayList<Integer> tens =
	    new ArrayList<Integer>(List.of(10,20,30,40,50,60,70,80,90,100));

	tens.stream()
	    .limit(5) // Only handle the first 5
	    .forEach(System.out::println);
	
    }
}
