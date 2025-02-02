package lambdas.functions;

import java.util.function.Function;

public class FunctionComposeVsAndThen {
    public static void main(String[] args) {
	Function<String, String> allCaps = s -> s.toUpperCase();
	Function<String, String> addHello = s -> s.concat("Hello");

	// Compose is opposite of andThen
	// Func1.andThen(Func2) - Execute Func1 first and then Func2
	// Func1.compose(Func2) - Execute Func2 first and then Func1
	System.out.println("Compose: " + allCaps.compose(addHello).apply("meow"));
	System.out.println("AndThen: " + allCaps.andThen(addHello).apply("meow"));
	
    }
}
