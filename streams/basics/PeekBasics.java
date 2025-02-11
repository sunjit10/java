package streams.basics;

import java.util.List;
import java.util.stream.Collectors;

public class PeekBasics {
    public static void main(String[] args) {
	var nums = List.of(1,3,2,6,4,9,5);
	
	// peek - as it means literally is to peek what is inside a Stream
	var listOfNums = nums.stream()
	    .peek(n -> System.out.println(n + ": " + n.getClass()))
	    .map(n -> n*n)
	    .peek(n -> System.out.println("Squarred value: " + n))
	    .map(i -> i * 10)
	    .peek(n -> System.out.println("Peek2 when *10: " + n))
	    .collect(Collectors.toList());
	
	System.out.println(listOfNums);

	// Check above, it traverses from top to bottom one element after other
	// So you will see: 1 1 10, 3 9 90, 2 4 40, 6 36 360 ....
	
	System.out.println("-----------------------------------");
	peekBeingIgnored();
    }
    
    private static void peekBeingIgnored() {
	var nums = List.of(10,20,60,20,90,50);
	// You will see that map, peek will not get executed. Reason is that compiler is smart
	// enough to realize that all we care about is count, why bother stuff in between
	// if you just need to know the size
	var sizeOfList =
	    nums
	    .stream()
	    .map(o -> String.valueOf(o))
	    .peek(n -> System.out.println(n + " : " + n.getClass()))
	    .count(); 	// count is another terminal method like collect.
	System.out.println("size of list: " + sizeOfList);
    }
}
