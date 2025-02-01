package lambdas.predicates;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateRemoveIf {
    public static void main(String[] args) {
	var numbers = new ArrayList<>(List.of(3,5,4,7,6,1,2,8));
	numbers.forEach(System.out::println);
	removeAllNumbersBelow5(numbers);
    } 

    // removeIf takes a Predicate as a parameter.
    // Predicate returns true/false based on the result of operation
    private static void removeAllNumbersBelow5(List<Integer> list) {
	list.removeIf(n -> n < 5);

	System.out.println("\nPredicates after removing numbers < 5\n");
	list.forEach(System.out::println);
    }
}
