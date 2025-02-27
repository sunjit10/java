package streams.numeric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

/*
  mapToObj - Convert numeric stream to some object
  mapToLong - Convert numeric stream to Long Stream
  mapToDouble - Convert numeric stream to Double Stream
 */
public class NumericStreamMapFunctions {
    public static void main(String[] args) {
	
	// mapToObject
	List<Integer> list =
	    IntStream.rangeClosed(1,5)
	    . mapToObj(i -> {
		    return new Integer(i);
		} )
	    .collect(Collectors.toList());
	System.out.println(list);
  
    }
}
