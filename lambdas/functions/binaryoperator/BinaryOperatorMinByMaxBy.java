package lambdas.functions.binaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/*
 * BinaryOperator.minBy(<Comparator>)
 * BinaryOperator.maxBy(<Comparator>)
 */
public class BinaryOperatorMinByMaxBy {

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
    
    public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
		System.out.println(binaryOperator.apply(3, 4));

		BinaryOperator<Integer> getMin = BinaryOperator.minBy(comparator);
		System.out.println(getMin.apply(2, 8));

		BinaryOperator<Integer> getMax = BinaryOperator.maxBy(comparator);
		System.out.println(getMax.apply(2, 8));
    }
}
