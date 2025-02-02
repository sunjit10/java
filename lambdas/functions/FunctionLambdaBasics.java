package lambdas.functions;

import java.util.function.Function;

/*
  Function<T,R> has a single method (Functional Interface)
  
  R apply(T t)
 */
public class FunctionLambdaBasics {
    public static void main(String[] args) {
	example1();
	example2();
    }

    private static void example1() {
	Function<String, String> smithFamily = s -> {  return s + " Smith"; };
	
	System.out.println("Full Name: " + smithFamily.apply("Mike"));
	System.out.println("Full Name: " + smithFamily.apply("Jimmy"));
    }

    private static void example2() {
	Function<String, Integer> getStrLength = s -> s.length();
	System.out.println(getStrLength.apply("helloooo"));
    }
}
