package lambdas.functions.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceBasics {
    public static void main(String args[]) {
		Function<String, String> getUpper = String::toUpperCase;
		System.out.println(getUpper.apply("Hello"));

		Function<String, Integer> getLen = String::length;
		System.out.println(getLen.apply("Howdy!"));

		withoutMethodReferences();
    }

    private static void withoutMethodReferences() {
		System.out.println("----------------------------");
		Function<String, String> getUpper = s -> s.toUpperCase();
		System.out.println(getUpper.apply("Hello"));

		Function<String, Integer> getLen = s -> s.length();
		System.out.println(getLen.apply("Howdy!"));
    }
}
