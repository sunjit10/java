package lambdas.predicates;

import java.util.function.Predicate;

public class PredicatesBasics {
    public static void main(String[] args) {

	// Predicate is a Functional Interface
	// Hence - one method called test that returns boolean
	Predicate<String> p1 = new Predicate<>() {
		@Override
		public boolean test(String t) {
		    return t.length() < 4;
		}
	    };

	System.out.println(p1.test("hello"));
	System.out.println(p1.test("hi"));

	// More Elegant using Lambdas
	Predicate<String> p2 = t -> t.length() < 4;
	System.out.println(p2.test("howdy"));
	System.out.println(p2.test("yo"));
	
    }
}
