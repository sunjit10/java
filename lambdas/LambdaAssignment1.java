package lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaAssignment1 {
    public static void main(String[] args) {

	var listOfNumbers = new ArrayList<>(List.of(1, 5, 9, 1000, 3, 6, -20, 4));

	/*
	 * Assignment: In the above listOfNumbers
         * 1. Remove all items outside the range 0-10
         * 2. Add 100 to each item
         * 3. Display the resulting list
	 */

	solveAssignment(listOfNumbers);
    }

    private static void solveAssignment(List<Integer> listNums) {
	// removeIf uses Predicates (should be true or false condition)
	listNums.removeIf(n -> n > 10 || n < 0);

	// replaceAll uses UnaryOperator (Input and Output of the same data type)
	listNums.replaceAll(n -> n + 100);
	
	listNums.forEach(System.out::println);
    }
}
