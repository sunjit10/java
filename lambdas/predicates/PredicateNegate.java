package lambdas.predicates;

import java.util.function.Predicate;

// Predicate1.negate()  // This reverses the result
public class PredicateNegate {
    public static void main(String[] args) {
		Predicate<Integer> divisibleByTwo = n -> (n % 2) == 0;
		System.out.println(divisibleByTwo.negate().test(3));
		Predicate<Integer> divisibleByFive = n -> (n % 5) == 0;
		System.out.println(divisibleByFive.negate().test(10));

		System.out.println("-------------------------");

		System.out.println(divisibleByTwo.or(divisibleByFive).negate().test(15));
		System.out.println(divisibleByTwo.or(divisibleByFive).negate().test(18));
		System.out.println(divisibleByTwo.or(divisibleByFive).negate().test(21));
    }
}
