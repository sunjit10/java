package streams.util;

import java.util.List;
import java.util.ArrayList;

public class SkipStream {
    public static void main(String[] args) {
	ArrayList<Integer> tens =
	    new ArrayList<Integer>(List.of(10,20,30,40,50,60,70,80,90,100));

	tens.stream()
	    .skip(5) // Skip the first 5
	    .forEach(System.out::println);
	
    }
}
