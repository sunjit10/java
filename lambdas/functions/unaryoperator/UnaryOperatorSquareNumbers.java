package lambdas.functions.unaryoperator;

import java.util.List;
import java.util.ArrayList;

/*
 *  replaceAll(<UnaryOperator>)
 */
public class UnaryOperatorSquareNumbers {
    public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<>(List.of(1,3,4,6,8));

	numbers.replaceAll(n -> n*n);

	numbers.forEach(System.out::println);
    }
}
