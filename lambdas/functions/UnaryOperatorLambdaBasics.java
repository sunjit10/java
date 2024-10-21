package lambdas.functions;

import java.util.function.UnaryOperator;

/*
  Function<T,R> has a single method (Functional Interface)
  
  R apply(T t)
 */
public class UnaryOperatorLambdaBasics {
    public static void main(String[] args) {
	UnaryOperator<String> smithFamily = s -> s +  " Smith";
	
	System.out.println("Full Name: " + smithFamily.apply("Mike"));
	System.out.println("Full Name: " + smithFamily.apply("Jim"));

	UnaryOperator<Integer> squared = n -> n*n;
	System.out.println(squared.apply(3));
	System.out.println(squared.apply(4));
    }
}
