package lambdas.predicates;

import java.util.function.Predicate;

// Predicate1.or(Predicate2).test(<something>)
public class PredicateOr {
    public static void main(String[] args) {
	Predicate<Integer> divisibleByTwo = n -> (n % 2) == 0;
	Predicate<Integer> divisibleByFive = n -> (n % 5) == 0;
	
	System.out.println(divisibleByTwo.or(divisibleByFive).test(15));
	System.out.println(divisibleByTwo.or(divisibleByFive).test(18));
	System.out.println(divisibleByTwo.or(divisibleByFive).test(21));
    }
}
