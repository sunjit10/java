package lambdas.predicates;

import java.util.function.Predicate;

// Predicate1.and(Predicate2).test(<something>)
public class PredicateAnd {
    public static void main(String[] args) {
	Predicate<Integer> divisibleByTwo = n -> (n % 2) == 0;
	Predicate<Integer> divisibleByFive = n -> (n % 5) == 0;
	
	System.out.println(divisibleByTwo.and(divisibleByFive).test(10));
	System.out.println(divisibleByTwo.and(divisibleByFive).test(18));
    }
}
