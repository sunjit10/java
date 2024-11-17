package streams;

import java.util.stream.Stream;

public class CombinersDemo {
    public static void main(String[] args) {
	
	var result = Stream.of("hello", "how", "are", "you", "doing", "today", "mate")
	    .reduce("", (partial, item) -> partial + " " + item);
	System.out.println(result);

	System.out.println("---- Now doing in parallel ----");
	
	var result2 = Stream.of("hello", "how", "are", "you", "doing", "today", "mate")
	    .parallel()
	    .reduce("", (partial, item) -> partial + " " + item,
		    (partial1, partial2) -> partial1 + partial2);
	
	System.out.println(result2);
    }
}
