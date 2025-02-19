package streams.util;

import java.util.List;
import java.util.ArrayList;

// All these methods take a predicate as input and
// returns a Boolean as output
public class AnyAllNoneStreamMatch {
    public static void main(String[] args) {
	ArrayList<Integer> scores =
	    new ArrayList<Integer>(List.of(2,3,1,4,6,5,7,9,8));

	// Returns true if atleast one of the element matches predicate
	boolean anyM = scores.stream()
	                     .anyMatch(n -> n % 2 == 0);
	System.out.println("any Match " + anyM);

	// Returns true only of ALL elements in stream matches predicte
	boolean allM = scores.stream()
	                     .allMatch(n -> n < 10);
	System.out.println("all Match " + allM);

	// Returns true if none of the elements in stream matches predicate
	boolean noneM = scores.stream()
	                     .noneMatch(n -> n > 10);
	System.out.println("none Match " + noneM);
    }
}
