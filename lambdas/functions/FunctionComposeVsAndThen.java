package lambdas.functions;

import java.util.function.Function;

public class FunctionComposeVsAndThen {
    public static void main(String[] args) {
	Function<String, String> allCaps = s -> s.toUpperCase();
	Function<String, String> addHello = s -> s.concat("Hello");

	System.out.println("Compose: " + allCaps.compose(addHello).apply("meow"));
	System.out.println("AndThen: " + allCaps.andThen(addHello).apply("meow"));
	
    }
}
