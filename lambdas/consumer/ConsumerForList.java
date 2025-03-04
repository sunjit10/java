package lambdas.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerForList {
    public static void main(String[] args) {
	var list = List.of("one", "two", "three");
	
	list.forEach(new Consumer<String>() {
		@Override
		public void accept(String t) {
		    System.out.print(t);
		    System.out.print(" ");
		}
	    });
	
	System.out.println();
	
	list.forEach(System.out::println);

	System.out.println();

	list.forEach(t -> {
		System.out.print(t);
		System.out.print(" ");
	    });

	System.out.println();
    }
}
