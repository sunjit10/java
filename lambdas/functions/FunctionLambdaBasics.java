package lambdas.functions;

import java.util.function.Function;

/*
  Function<T,R> has a single method (Functional Interface)
  
  R apply(T t)
 */
public class FunctionLambdaBasics {
    public static void main(String[] args) {
	Function<String, String> smithFamily = s -> {  return s + " Smith"; };
	
	System.out.println("Full Name: " + smithFamily.apply("Mike"));
	System.out.println("Full Name: " + smithFamily.apply("Jimmy"));
	
    }
}
