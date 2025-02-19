package streams.util.shortcircuit;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// This is in shortcircuit package since we don't have to
// go through the entire stream, the moment the condition
// gets satisfied, the stream traversal ends

// In this example findFirst() and findAny() will return the
// same but in parallelStreams you will see the difference
public class FindFirstFindAnyStream {
    public static void main(String[] args) {
	ArrayList<Integer> scores =
	    new ArrayList<Integer>(List.of(2,3,1,4,6,5,7,9,8));
	
	// Returns first element in the stream
	Optional<Integer> findScore =
	    scores.stream()
	    .filter(n -> n > 5)
	    .findFirst();
	
	System.out.println("findScore " + findScore.get());
	
	Optional<Integer> findScore =
	    scores.stream()
	    .filter(n -> n > 5)
	    .findAny();

	System.out.println("findScore " + findScore.get());
	
	
   }
}
