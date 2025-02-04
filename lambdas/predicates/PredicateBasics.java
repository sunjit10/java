package lambdas.predicates;

import java.util.function.Predicate;

// Predicate:<T>
// boolean test(T t)
public class PredicateBasics {
    public static void main(String[] args) {

		// Predicate to check if length of String is less than 4
		Predicate<String> p = t -> t.length() < 4;
		System.out.println(p.test("howdy"));
		System.out.println(p.test("yo"));

		usingOldSchoolWay();
    }
    
    private static void usingOldSchoolWay() {
	Predicate<String> p1 = new Predicate<>() {
		@Override
		public boolean test(String t) {
		    return t.length() < 4;
		}
	    };
	
	System.out.println(p1.test("hello"));
	System.out.println(p1.test("hi"));
    }
}
