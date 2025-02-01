package lambdas.predicates;

import java.util.function.BiPredicate;

// BiPredicate:  public boolean test(T t, U u)
public class BiPredicateBasics {
    public static void main(String[] args) {
	BiPredicate<Integer, Integer> testDivisible = (n1, n2) -> (n1 % n2) == 0;
	System.out.println(testDivisible.test(10,2));
	System.out.println(testDivisible.test(10,3));
    }
}
